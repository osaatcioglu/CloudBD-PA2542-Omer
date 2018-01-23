# Journal

It installed the gnome and Open JDK 8. However; I changed the directive to install xorg and openbox instead of gnome as I wanted to launch eclipse over X11 instead of using the guest UI. The Qualitas corpus archive is installed under home folder (/home/vagrant). 

NaiveDetector class has the main method. CloneInstances is used to store the clone objects and Clone class is storing the set of objects for comparison. This particular data structure is useful to create clone objects from chunks faster like in ListChunkCollection class.

These are the stats for the Qualitas corpus archive
336 659 total files
164 116 java files
1 215 217 123 bytes java files

I fixed the encoding issues by just trying the Ascii or ISO 8859 encoding options in case of an error. 

When running the code on a big size data, Eclipse failed due to out of memory. So, using an algorithm to save everything in the memory for the fast process doesn't work on the big data. 

My suggestion is to create segments of file and process the segments one at a time using the available memory till we finally reach the final solution. This may require more processing but it will not cause any out of memory errors. Another solution is that we can store the hash of the chunks in a lookup table that points to filename, start and end line of the chunk. And for the same chunks, we can check the actual content of the chunks to expand the chunk.
