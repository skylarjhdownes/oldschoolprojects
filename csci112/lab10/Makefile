#   Makefile for lab10.c 
#	Skylar Downes, csci112, lab10
#	04/15/12

lab10:lab10.o linkedfunctions.o 
	gcc -lm -o lab10 lab10.c linkedfunctions.c
lab10.o: lab10.c
	gcc -c lab10.c
linkedfunctions.o: linkedfunctions.c
	gcc -c linkedfunctions.c


clean:
	rm *.o
	