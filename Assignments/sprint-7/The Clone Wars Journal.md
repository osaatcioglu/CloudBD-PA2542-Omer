# Journal

1. It installed the gnome and Open JDK 8. However; I changed the directive to install xorg and openbox instead of gnome as I wanted to launch eclipse over X11 instead of using the guest UI. 
2. The Qualitas corpus archive is installed under home folder (/home/vagrant). 
3. NaiveDetector class has the main method. 
4. CloneInstances is used to store the clone objects and Clone class is storing the set of objects for comparison. 
5. This particular data structure is useful to create clone objects from chunks faster like in ListChunkCollection class.
6. The Qualitas corpus archive contains 336 659 total files (find . -type f | wc -l)
7. The Qualitas corpus archive contains 164 116 Java files (find . -name "*.java" -type f | wc -l)
8. The Java files in Qualitas corpus archive occupies 1 215 217 123 bytes on the disk (find . -name "*.java" -type f -printf "%s\n" | awk '{sum+=$1} END {print sum}')
9. I fixed the encoding issues by just trying the Ascii or ISO 8859 encoding options in case of an error. 
10. When running the code on a big size data, Eclipse failed due to out of memory. 
11. Using an algorithm to save everything in the memory for the fast process doesn't work on the big data. 
12. My suggestion is to create segments of file and process the segments one at a time using the available memory till we finally reach the final solution. This may require more processing but it will not cause any out of memory errors. Another solution is that we can store the hash of the chunks in a lookup table that points to filename, start and end line of the chunk. And for the same chunks, we can check the actual content of the chunks to expand the chunk.
