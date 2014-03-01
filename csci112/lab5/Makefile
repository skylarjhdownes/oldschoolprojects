#   Makefile for lab6.c 
#	Skylar Downes, csci112, lab6
#	02/27/12
#

lab6: lab6.o get_problem.o get_rate_drop_factor.o get_kg_rate_conc.o get_units_conc.o fig_drops_min.o fig_ml_hr.o by_weight.o by_units.o

	gcc -o lab6 lab6.o get_problem.o get_rate_drop_factor.o get_kg_rate_conc.o get_units_conc.o fig_drops_min.o fig_ml_hr.o by_weight.o by_units.o
	
lab6.o: lab6.c proto.h

	gcc -c lab6.c
	
get_problem.o: get_problem.c

get_rate_drop_factor.o: get_rate_drop_factor.c

get_kg_rate_conc.o: get_kg_rate_conc.c

get_units_conc.o: get_units_conc.c

fig_drops_min.o: fig_drops_min.c

fig_ml_hr.o: fig_ml_hr.c

by_weight.o: by_weight.c

by_units.o: by_units.c