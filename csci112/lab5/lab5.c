/*
    lab5.c
	Skylar Downes, csci112, lab5
	02/14/12
*/

int palindromes;
main (void)
{
    int counter = 1; //for the while loop
    int j = 0; //for the for loop
    scanf("%d", &palindromes); //gets the number of palindromes
    printf("The palindromes of %d are:\n", palindromes);
    while (counter <= palindromes) //loops through each palindrome
    {
        for(j = 0; j < counter + (counter -  1); j += 1) //loops through the numbers in the palindrome
        {
            if (j < counter) //numbers before the center
            {
                printf("%d ", j);
            }
            else // numbers after the center
            {
                printf("%d ", (counter - (j - (counter - 2))));
            }
        }
        printf("\n");
        counter++;
    }
}
