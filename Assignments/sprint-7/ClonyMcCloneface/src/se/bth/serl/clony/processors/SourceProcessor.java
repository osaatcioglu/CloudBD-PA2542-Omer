/*
 * Copyright <2017> <Blekinge Tekniska Högskola>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining 
 * a copy of this software and associated documentation files (the "Software"), 
 * to deal in the Software without restriction, including without limitation 
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the 
 * Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in 
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE 
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING 
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER 
 * DEALINGS IN THE SOFTWARE.
 */

package se.bth.serl.clony.processors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import se.bth.serl.clony.chunks.BaseChunkCollection;
import se.bth.serl.clony.chunks.Chunk;

/**
 * 
 * @author Michael Unterkalmsteiner
 *
 */
public class SourceProcessor {
	public static final int DEFAULT_CHUNKSIZE = 5;
	private BaseChunkCollection chunkCollection;
	private List<Path> listOfJavaFiles; 
	private int chunkSize;
	private int totalFilesToProcess;
	private int currentFilesProcessed;
	private int totalLinesProcessed;
	
	public SourceProcessor(Path rootFolder, int chunkSize, BaseChunkCollection chunkCollection) {
		this.chunkSize = chunkSize > 0 ? chunkSize : DEFAULT_CHUNKSIZE;
		this.chunkCollection = chunkCollection;
		this.totalFilesToProcess = 0;
		this.currentFilesProcessed = 0;
		this.totalLinesProcessed = 0;
		
		try {
			this.listOfJavaFiles = Files.walk(rootFolder, Integer.MAX_VALUE).filter(Files::isRegularFile).filter(p -> p.toString().endsWith(".java")).collect(Collectors.toList());
			this.listOfJavaFiles.sort(new Comparator<Path>() {
				public int compare(Path a, Path b) {
					return a.getFileName().compareTo(b.getFileName());
				}
			});
			this.totalFilesToProcess = listOfJavaFiles.size();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public BaseChunkCollection populateChunkCollection() {
		if(chunkCollection.isEmpty() && totalFilesToProcess > 0) {
		String originId;
		StringBuilder chunkContentBuilder = new StringBuilder();
		int firstRaw;
		int lastRaw;
		Chunk chunk;
		for(Path p : listOfJavaFiles) {
				SourceReader sr = new SourceReader(p);
				List<SourceLine> sourceLines = sr.getOnlySourceWithContent();
				int numLines = sourceLines.size();
				originId = p.toString();
				for (int index = 0; (index + chunkSize - 1) < numLines; index++) {
					firstRaw = index;
					lastRaw = firstRaw + chunkSize - 1;
					chunkContentBuilder.setLength(0);
					for (int i = firstRaw; i <= lastRaw; i++) {
						chunkContentBuilder.append(sourceLines.get(i).getContent());
					}
					chunk = new Chunk(originId, 
						chunkContentBuilder.toString(), 
						sourceLines.get(firstRaw).getLineNumber(), 
						sourceLines.get(lastRaw).getLineNumber());
					chunkCollection.addChunk(chunk);
				};
				totalLinesProcessed += sourceLines.size();
				currentFilesProcessed++;
				
				if(currentFilesProcessed%100 == 0) 
					System.out.println("Files processed: " + currentFilesProcessed + "/" + totalFilesToProcess);
			}
		}
		
		return chunkCollection;
	}
	
	public int totalFilesProcessed() {
		return totalFilesToProcess;
	}
	
	public int totalLinesProcessed() {
		return totalLinesProcessed;
	}
}
