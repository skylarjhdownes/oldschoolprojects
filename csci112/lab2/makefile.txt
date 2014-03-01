#   Makefile for lab2.c 
#	Skylar Downes, csci112, lab1
#	01/24/12
#

lab2: lab2.o

	gcc -o lab2 lab2.o
	
lab2.o: lab2.c

	gcc -c lab2.c