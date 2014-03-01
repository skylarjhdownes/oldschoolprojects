#include <math.h>
#include "proto.h"
double xsquaredsinx(double input)
{
    double squared = input * input;
    double sined = sin(input);
    double answer = squared * sined;
    return answer;
}
