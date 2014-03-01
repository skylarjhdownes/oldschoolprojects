#include "proto.h"
int
get_rate_drop_factor()
{
    int rate;
    int dropFactor;
    printf("Enter rate in ml/hr=>");
    scanf("%d", &rate);
    printf("\nEnter tubing's drop factor(drops/ml)=>");
    scanf("%d", &dropFactor);
    rate = fig_drops_min(rate, dropFactor);
    printf("\nThe drop rate per minute is %d", rate);
}
