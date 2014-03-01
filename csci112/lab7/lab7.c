#include <math.h>
#include <stdio.h>
#include "proto.h"
int main()
{
    int i,j;
    double h, area;
    for(i=0;i<3;i++){
        double n = 2;
        if (i == 0)
        {
            printf("g(x) = XSquaredSinX\na = 0.00000, b = 3.14159\n");
            double a = 0.0;
            double b = 3.14159;
            int f = 1;
            for(j=0;j<7;j++){
                trap(a, b, n, f, &h, &area);
                printf("n = %4lf, h = %7.5lf, area = %12.5lf\n", n, h, area);
                n = 2 * n;
            }
        }
        else if (i == 1)
        {
            printf("h(x) = HalfCircle\na =-2.00000, b = 2.00000\n");
            double a = -2.0;
            double b = 2.0;
            int f = 2;
            for(j=0;j<7;j++){
                trap(a, b, n, f, &h, &area);
                printf("n = %4lf, h = %7.5lf, area = %12.5lf\n", n, h, area);
                n = 2 * n;
            }
        }
        else if (i == 2)
        {
            printf("f(x) = TestFunction\n a = 0.00000, b = 12.00000\n");
            double a = 0.0;
            double b = 12.0;
            int f = 3;
            for(j=0;j<7;j++){
                trap(a, b, n, f, &h, &area);
                printf("n = %4lf, h = %7.5lf, area = %12.5lf\n", n, h, area);
                n = 2 * n;
            }
        }

    }
	return 0;
}
