/*
    lab6.c
	Skylar Downes, csci112, lab6
	02/27/12
*/

#include "proto.h"

int
main()
{
    int quit = 0;
    while (quit == 0)
    {
        int choice;
        choice = get_problem();
        if(choice == 1)
        {
            printf("Problem=> 1\n");
            get_rate_drop_factor();
        }
        else if(choice == 2)
        {
            int answer;
            int rate;
            printf("Problem=> 2\n");
            printf("Enter number of hours=>");
            scanf("%d", &rate);
            answer = fig_ml_hr(&rate);
            printf("\nThe rate in milliliters per hour is %d.\n", answer);
        }
        else if(choice == 3)
        {
            printf("Problem=> 3\n");
            get_kg_rate_conc();
        }
        else if(choice == 4)
        {
            printf("Problem=> 4\n");
            get_units_conc();
        }
        else if(choice == 5)
        {
            quit = 1;
            printf("Problem=> 5\n");
        }
    }
}
