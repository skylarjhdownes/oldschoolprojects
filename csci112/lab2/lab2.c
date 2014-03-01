/*	lab2.c
	Skylar Downes, csci112, lab2
	01/24/12
*/
int
main(void)
{
    double far; //holder for the input
    scanf("%lf", &far); //gets the input from a keyboard or text file
    double cel = (((far - 32.0) * 5.0) / 9.0); //converts the input from farenheit to celcius

    printf("Thank you for submitting temperature reading in fahrenheit.\nThe temperature in celcius = %f.\n", cel); //prints the converted value
    return(0);
}
