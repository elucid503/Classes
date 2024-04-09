#include <stdio.h> 

int main() {

    // scanf reads input from the user
    
    int age;

    printf("enter your age: ");

    scanf("%d", &age);

    printf("Your age is %d\n", age);

    getchar(); // this is to clear the buffer

    //scanf can also read characters

    char letter;

    printf("Enter a letter: ");

    scanf("%c", &letter);

    printf("The letter is %c\n", letter);
    
    getchar(); // this is to clear the buffer

    // scanf can also read strings
    // note that the string is a char array

    char name[30];

    printf("Enter your name: ");

    scanf("%s", name);

    printf("Hello %s\n", name);

}
