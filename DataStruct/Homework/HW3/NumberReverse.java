package Homework.HW3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class NumberReverse {

    public static void main(String[] argv) {

        while (true) {

            NumberFormat numFormatter = NumberFormat.getInstance(Locale.US); // will make printing look better. credit where due: https://stackoverflow.com/questions/21751658/method-to-insert-commas-into-large-numbers
            StackArray stack = new StackArray(100);
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter a positive long int or -1 to quit: ");

            long numberEntered = 0;

            try {

                numberEntered = scanner.nextLong();

            } catch (Exception e) {

                System.out.println("Invalid input. Please enter a *long* number."); // not sure if the parser throws if not explicitly a long, but better to handle it
                continue;

            }

            if (numberEntered == -1) {

                System.out.println("Program Finished...");
                scanner.close();

                break;

            }

            if (numberEntered < 0) {

                System.out.println("Invalid input. Please enter a *positive* long number.");
                continue;

            }
            
            System.out.printf("You entered: %s\n", numFormatter.format(numberEntered)); // even tho its a long, formatter will return string, so %s

            numberEntered = numberEntered * 2; // double the number 

            System.out.printf("Doubled is: %s\n", numFormatter.format(numberEntered));

            // ex input: 1234, doubled: 2468; then after this we should have 8, 6, 4, 2 in the stack

            while (numberEntered > 0) {

                stack.push((int) (numberEntered % 10)); // mod 10 gets the last digit
                numberEntered = numberEntered / 10; // this removes the last digit

            }

            long result = 0;
            int power = 0;

            while (!stack.empty()) {

                result += stack.pop() * Math.pow(10, power);
                power++;

            }

            System.out.printf("Reversed: %s\n\n", numFormatter.format(result));

        }
        
    }
    
}