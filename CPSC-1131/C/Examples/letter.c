#include <stdio.h>
 
int main() {

	// the letter to guess.. 

	char myVar = 'x';

	printf("I'm thinking of a letter (lowercase), can you guess it? \n");

	char c;
	
	scanf("%c", &c); // Scan for a character and store it in c
	
	while (c != EOF) {		
        		
        /* keep going until letter found or quit ) */

 		if (c == myVar) {

			printf("\tYou got it!\n");
			break;

		} else if (c != myVar) {

			printf("Try again ");  
			scanf(" %c", &c);		

            /* note leading blank in format string; this tells scanf
            to skip any leading whitespace characters.  */

 		}
	}
}
