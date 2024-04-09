#include <stdio.h>

main() {

    float cash = 0.01;
    int day;

    for (day = 1; day <= 40; day++) {

		printf("On day %d you have $%.2f", day, cash);
		printf("\tFluffy has $1000000.00\n");

		cash += cash  * 2.0;

    }
    
}