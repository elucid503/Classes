#include <stdlib.h>
#include <stdio.h>
#include <time.h>

// Consts

#define MyFavoriteNumber 10
#define MyFavoriteColor "Blue"

// Protos 

void ConstantTester();
int RNG(int Seed);

int main() {

    ConstantTester();

    int Seed = 10;
    int RandomNumber = RNG(Seed);

    printf("Random number between 0 and %d is %d", Seed, RandomNumber);

    return 0;

}

// Actual funcs

void ConstantTester() {

    printf("My favorite number is %d", MyFavoriteNumber);
    printf("My favorite color is %s", MyFavoriteColor);

}

int RNG(int Seed) {

    srand(time(NULL));

    int RandomNumber = rand() % Seed; // Random number between 0 and Seed

    return RandomNumber;

}