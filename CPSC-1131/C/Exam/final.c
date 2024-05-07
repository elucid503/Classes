// Headers 

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

// Protos

void DoWeird(int Num);

void DoConstant();

void DoAbsValue(int* a, int* b); // Returning nothing, modifying ptrs

int RandomStatic();

void RandomPtr(int *a);

int DoTempConvert(int TempInC);

char* Concat(char* a, char* b);

int IsGiddy(char *Str);

int Sum(int n);

// Consts

#define ExamString "Today is a delightful day to take the final exam."

int main() {

    // Calling all the functions

    printf("------------DoWeird------------\n");

    printf("Enter a number: ");

    int Num;

    // Using stdio lib to use get user input from stdinput 

    scanf("%d", &Num); // Push the val into the memory location of Num

    DoWeird(Num);

    printf("------------DoConstant------------\n");

    DoConstant();

    printf("\n------------DoAbsValue------------\n");

    int a = 5;
    int b = 10;

    printf("BEFORE: a: %d, b: %d\n", a, b);

    DoAbsValue(&a, &b);

    printf("AFTER: a: %d, b: %d\n", a, b);

    printf("------------RandomStatic------------\n");

    printf("Random number: %d\n", RandomStatic());

    printf("------------RandomPtr------------\n");

    int RandomNum = 42; // will only very rarely, if ever, equal 42 again -- the answer to life, the universe, and everything

    RandomPtr(&RandomNum);

    printf("Random number: %d\n", RandomNum);

    printf("------------DoTempConvert------------\n");

    printf("Enter a temperature in Celsius: ");

    int TempInC;

    scanf("%d", &TempInC);

    printf("Temperature in Fahrenheit: %d\n", DoTempConvert(TempInC));

    printf("------------Concat------------\n");

    char* StrA = "Kitty";
    char* StrB = "cat";

    printf("Concatenated string: %s\n", Concat(StrA, StrB));

    // EXTRA CREDIT 

    printf("------------IsGiddy------------\n");

    char* Str = "xxggxggx";

    printf("String: %s\n", Str);

    if (IsGiddy(Str)) {

        printf("Giddy!\n");

    }

    else {

        printf("Not Giddy!\n");

    }

    printf("------------Sum------------\n");

    int n = 3;

    printf("Recursive sum of 1 to %d: %d\n", n, Sum(n)); // 1 + 2 + 3 = 6

}

// Declarations

void DoWeird(int Num) {

    if (Num % 2 != 0) {

        printf("Weird: Odd\n"); // Is odd

        return;
    }

    if (Num >= 2 && Num <= 5) {

        printf("Even Weird: >=2 and <= 5\n");

    }

    if (Num >= 6 && Num <= 20) {

        printf("Even Weird: >= 6 and <= 20\n");

    }

    if (Num > 20) {

        printf("Not Weird, but Even and > 20\n");

    }

}

void DoConstant() {

    int OccurancesOfY = 0;

    // doing y count first

    for (int i = 0; ExamString[i] != '\0'; i++) {

        if (ExamString[i] == 'y') {

            OccurancesOfY++;

        }

    }

    printf("Number of y's: %d\n", OccurancesOfY);

    // Splitting into each word the hard way

    int WordLength = 0;

    for (int i = 0; ExamString[i] != '\0'; i++) {

        if (ExamString[i] == ' ' || ExamString[i] == '.') {

            if (WordLength % 2 != 0) {

                printf("%c", ExamString[i - WordLength]);

            }

            if (WordLength % 2 == 0) {

                if (WordLength > 1) {

                    printf("%c ", ExamString[i - WordLength + 1]);

                } else {

                    printf("%c ", ExamString[i - WordLength]);

                }

            }

            WordLength = 0;

        }

        else {

            WordLength++;

        }
    }    

}

void DoAbsValue(int* a, int* b) {

    int Diff = *a - *b;
    int Sum = *a + *b;

    *a = Sum;

    // only doing this as we learned the hard way that the abs func is not standardized on compilers with different lib requirements 

    if (Diff < 0) {

        *b = (Diff * -1);

    }

    else {

        *b = Diff;

    }

}

int RandomStatic() {

    srand(time(NULL));

    return rand() % 100 + 1; // 1 - 100, not 0 - 99

}

void RandomPtr(int *a) {

    srand(time(NULL)); // This may be the same as the previous since c is fast!

    *a = rand() % 100 + 1; // pushing back into the memory location of a

}

int DoTempConvert(int TempInC) {

    return ((9 * TempInC) / 5) + 32;

}

char* Concat(char* a, char* b) {

    // Determine length of each string

    int len1 = 0;
    int len2 = 0;

    for (int i = 0; a[i] != '\0'; i++) {

        len1++;

    }

    for (int i = 0; b[i] != '\0'; i++) {

        len2++;

    }

    // Allocate memory for Result

    char* Result = malloc(len1 + len2 + 1); 
    
    // malloc is not something we did in class, but per my knowledge (and stackoverflow's) it is necessary here for this crazy array-based approach 
    // will take the heap memory and ONLY enough for the explicit length. bad idea to use malloc (in general) for small things, but for this it's helpful

    for (int i = 0; i < len1; i++) {

        Result[i] = a[i];

    }

    for (int i = 0; i < len2; i++) {

        Result[i + len1] = b[i];

    }

    Result[len1 + len2] = '\0';

    return Result;

}

int IsGiddy(char* Str) {

    int GiddyStatus = 0; // One of my funnier variable names as of late

    for (int i = 0; Str[i] != '\0'; i++) {

        if (Str[i] == 'g') {

            if (Str[i - 1] == 'g' || Str[i + 1] == 'g') {

                GiddyStatus = 1;

            }

            else {

                GiddyStatus = 0;

                break;

            }

        }
    
    }

    return GiddyStatus; // return the GIDDYSTATUS

}

int Sum(int n) {

    if (n == 0) {

        return 0;

    }

    return n + Sum(n - 1); // goes down until the internal count == 0

}