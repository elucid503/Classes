#include <stdio.h> 
#include <math.h>

int SumEven(int UpperBound) {

    int SumEven = 0;

    for (int i = 2; i <= UpperBound; i += 2) {

        SumEven += i;

    }

    return SumEven;

}

int SumOdd(int UpperBound) {

    int SumOdd = 0;

    for (int i = 1; i <= UpperBound; i += 2) {

        SumOdd += i;

    }

    return SumOdd;

}

int AbsoluteDifference(int SumEven, int SumOdd) {

    return abs(SumEven - SumOdd);

}

int main() {

    int UpperBound;

    printf("Enter an upper bound: ");

    scanf("%d", &UpperBound);

    int EvenSum = SumEven(UpperBound);
    int OddSum = SumOdd(UpperBound);

    printf("The sum of even numbers is %d\n", EvenSum);
    printf("The sum of odd numbers is %d\n", OddSum);

    printf("The absolute difference between the two sums is %d\n", AbsoluteDifference(EvenSum, OddSum));

    return 0;
    
}