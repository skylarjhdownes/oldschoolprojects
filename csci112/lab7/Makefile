#   Makefile for lab7.c 
#	Skylar Downes, csci112, lab7
#	02/27/12
#

lab7: lab7.o trap.o testfunction.o xsquaredsinx.o halfcircle.o proto.h
	gcc -o lab7 lab7.o trap.o testfunction.o xsquaredsinx.o halfcircle.o proto.h -lm
	
lab7.o: lab7.c trap.o proto.h
	gcc -c lab7.c proto.h
	
trap.o: trap.c proto.h
	gcc -c trap.c proto.h

testfunction.o: testfunction.c proto.h
	gcc -c testfunction.c proto.h
	
xsquaredsinx.o: xsquaredsinx.c proto.h
	gcc -c xsquaredsinx.c proto.h
	
halfcircle.o: halfcircle.c proto.h
	gcc -c halfcircle.c proto.h
	
clean:
	rm *.o