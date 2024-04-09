#include <stdio.h> 

int main() {

    // print displays the string inside the quotes + a new line
    printf("Hello, World!\n");

    //printf can also display variables

    char letter = 'A';

    //%c is a placeholder for a char

    printf("The letter is %c\n", letter);

    int num = 22;
    float fNum = 3.14;

    //%d is a placeholder for an int
    //%f is a placeholder for a float

    printf("The number is %d and another is %f\n", num, fNum);

}