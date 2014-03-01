#include <math.h>
#include "proto.h"
void trap(double a, double b, double n, double f, double *h, double *area)
{
    *h = ((b-a) / n);
	double width = ((b-a) / n);
    if (f == 1)
    {
		int i;
		double sum = 0;
		for (i=1; i<n; i++)
		{
			sum += xsquaredsinx(a + (width * (double)i));
		}
        *area = (*h/2.0)*(xsquaredsinx(a) + xsquaredsinx(b) + (2.0 * sum));
    }
    else if (f == 2)
    {
		int i;
		double sum = 0;
		for (i=1; i<n; i++)
		{
			sum += halfcircle(a + (width * (double)i));
		}
        *area = (*h/2.0)*(halfcircle(a) + halfcircle(b) + (2.0 * sum));
    }
    else if (f == 3)
    {
		int i;
		double sum = 0;
		for (i=1; i<n; i++)
		{
			sum += testfunction(a + (width * (double)i));
		}
        *area = (*h/2.0)*(testfunction(a) + testfunction(b) + (2.0 * sum));
    }
}
