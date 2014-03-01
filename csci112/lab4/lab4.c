/*
    lab4.c
	Skylar Downes, csci112, lab4
	02/07/12
*/
double x;
double y;

main (void)
{
    scanf("%lf%lf", &x, &y);
    if (x == 0)
    {
        if (y == 0)
        {
            printf ("(%6.1f,%6.1f) is on the origin.", x, y);
        }
        else
        {
            printf ("(%6.1f,%6.1f) is on the x-axis", x, y);
        }
    }
    else
    {
         if (y == 0)
         {
             printf ("(%6.1f,%6.1f) is on the y-axis", x, y);
         }
         else
         {
            if (x > 0)
            {
                if (y > 0)
                {
                    printf ("(%6.1f,%6.1f) is in quadrant Q1", x, y);
                }
                else
                {
                    printf ("(%6.1f,%6.1f) is in quadrant Q4", x, y);
                }
            }
            else
            {
                if (y > 0)
                {
                    printf ("(%6.1f,%6.1f) is in quadrant Q2", x, y);
                }
                else
                {
                    printf ("(%6.1f,%6.1f) is in quadrant Q3", x, y);
                }
            }
        }
    }


}
