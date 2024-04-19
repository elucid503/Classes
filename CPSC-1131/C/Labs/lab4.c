#include <stdio.h>

// Utils 

void PrintArray(int *a);

// Real methods 

int Sum(int *a);

void HalfArray(int *a);

int main() {

    int Arr[5] = {2, 4, 6, 8, 10};

    // Print Arr before any mutation

    PrintArray(Arr);

        printf("\n");

    printf("Sum of Array is: %d\n", Sum(Arr));

    HalfArray(Arr); // Mutate (pointers!) 

    PrintArray(Arr);

}

void PrintArray(int a[5]) {

    for (int i = 0; i < 5; i++) {

        printf("%d ", a[i]);

    }

}

int Sum(int a[5]) {

    int TotalSum = 0;

    for (int i = 0; i < 5; i++) {

        TotalSum += a[i];

    }

    return TotalSum;

}

void HalfArray(int a[5]) {

    for (int i = 0; i < 5; i++) {

        a[i] = a[i] / 2;

    }

}