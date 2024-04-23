#include <stdio.h>

int StrCompare(char *First, char *Second);
char *YourNameReturned();

int main() {

    // Test strings for StrCompare

    char *FirstTestStr = "This is a regular string, nothing special except pointers.\0";
    char *EqualToFirst = "This is a regular string, nothing special except pointers.\0";

    char *SecondTestStr = "This is still a regular test string.\0";
    char *BadString = "Segfault";

    if (StrCompare(FirstTestStr, EqualToFirst) != -1) {

        printf("The first two strings are equal.\n");

    }

    else {

        printf("First two are not equal.\n"); 

    }

    if (StrCompare(SecondTestStr, BadString) != -1) {

        printf("The second two strings are equal.\n");

    }

    else {

        printf("The second two strings are not equal.\n");

    }

    char *MyName = YourNameReturned();

    printf("My name is %s, hopefully.", MyName);

}

int StrCompare(char *First, char *Second) {

    int IsEqual = 0;
    int i = 0;

    while (First[i] != '\0' && Second[i] != '\0') {

        if (First[i] != Second[i]) {

            // NOT equal, no more loop required 

            IsEqual = -1;

            break;

        }

        i++;

    }

    // Returns 0 if equal, -1 if not equal

    return IsEqual;

}

char *YourNameReturned() {

    return "Paul";

}