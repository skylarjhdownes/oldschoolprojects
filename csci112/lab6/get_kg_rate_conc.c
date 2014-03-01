#include "proto.h"
get_kg_rate_conc()
{
    int answer;
    float rate;
    int weight;
    int concentration;
    printf("Enter rate in mg/kg/hr=>");
    scanf("%lf", &rate);
    printf("Enter patient weight in kilograms=>");
    scanf("%d", &weight);
    printf("Enter concentration in mg/ml=>");
    scanf("%d", &concentration);
    answer = by_weight(&rate, &weight, &concentration);
    printf("The rate in milliliters per hour is %d.", answer);
}
