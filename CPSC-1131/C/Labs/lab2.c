#include <stdio.h>
#include <stdlib.h> // Using stdlib instead of math.h since clang seemed to complain last time 

// Protos 

void Increment(int *Number);
void Update(int *a, int *b);

int main() {

    // Pointer swap 

    int Number = 0;

    printf("Number is %d\n", Number);

    Increment(&Number);

    printf("Number is now %d\n", Number);

    // Math example

    int a = 4, b = 5;

    printf("a is %d, b is %d\n", a, b);

    Update(&a, &b);

    printf("a is now %d, b is now %d\n", a, b);

}

void Increment(int *Number) {

    *Number = *Number + 1;

}

void Update(int *a, int *b) {

    int Sum = *a + *b;
    int AbsDifference = abs(*a - *b);

    *a = Sum;
    *b = AbsDifference;

}