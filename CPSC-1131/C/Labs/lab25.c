#include <stdio.h>

// Protos

void HelloFun(void);

void HelloGreetingFun(int NumberChosen);

int DoArithmetic(int Numbers[]);

// Main

int main() {

    HelloFun();

    printf("Enter a number: ");

    int NumberChosen;

    scanf("%d", &NumberChosen);

    HelloGreetingFun(NumberChosen); 

    int Numbers[] = {1, 2, 3};

    printf("The result is %d\n", DoArithmetic(Numbers));

    return 0;

}

// Declarations 

void HelloFun(void) {

    printf("Hello, C!\n");

}

void HelloGreetingFun(int NumberChosen) {

    printf("Your number is %d\n", NumberChosen);
    
}

int DoArithmetic(int Numbers[]) {

    int SumOfFirstAndThird = Numbers[0] + Numbers[2];

    int Subtracted = SumOfFirstAndThird - Numbers[1];

    return Subtracted; // Should be 2 if given { 1, 2, 3 }
}