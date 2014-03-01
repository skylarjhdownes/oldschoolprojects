/*
    lab3.c
	Skylar Downes, csci112, lab3
	02/02/12
*/
#include <math.h>
double number; //number to be rounded, input
double roundingNumber; //number after .0005 has been added
double exponentedNumber;  //number after being multiplied by 10 to the third.
double intedNumber; //number after being made into an int
double roundedNumber; //number after being rounded to the nearest 1000th

main(void)
{
    scanf("%lf", &number); //gets the input from a keyboard or text file
    roundingNumber = (number + .0005); //adds .0005 to the input
    exponentedNumber = (roundingNumber * (pow(10, 3))); // multiplies the number by ten to the third
    intedNumber = (int)(exponentedNumber);  //makes the number an int
    roundedNumber = (double) ((intedNumber) * (pow (10, -3))); // makes the int into a double after multiplying it by ten to the negative third
    printf("%f rounded to the nearest 1000th is %.3f\n", number, roundedNumber);
    return(0);
}
