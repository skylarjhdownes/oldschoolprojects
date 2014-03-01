#include "proto.h"
int
fig_drops_min(int rate, int dropFactor)
{

    int drops;
    rate = (rate / 60);
    drops = (dropFactor * rate);
    return drops;
}
