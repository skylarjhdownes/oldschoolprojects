#   Makefile for lab9.c 
#	Skylar Downes, csci112, lab9
#	03/27/12
#

lab9: lab9.o binarysearch.o proto.h
	gcc -o lab9 lab9.o binarysearch.o proto.h
	
lab9.o: lab9.c proto.h
	gcc -c lab9.c proto.h
	
binarysearch.o: binarysearch.c proto.h
	gcc -c binarysearch.c proto.h

clean:
	rm *.o