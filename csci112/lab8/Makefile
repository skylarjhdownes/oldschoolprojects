#   Makefile for lab8.c 
#	Skylar Downes, csci112, lab8
#	04/23/12

lab8: lab8.o fgetAnswers.o 
	gcc -o lab8 lab8.o fgetAnswers.o -lm
	
lab8.o: lab8.c fgetAnswers.o proto.h
	gcc -c lab8.c proto.h
	
getAnswers.o: fgetAnswers.c proto.h
	gcc -c fgetAnswers.c proto.h
	
clean:
	rm *.o