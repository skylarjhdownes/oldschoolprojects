#include <math.h>
#include "proto.h"
double halfcircle(double input)
{
    double answer = sqrt(4 - (input*input));
    return answer;
}
