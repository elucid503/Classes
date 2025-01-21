package Classwork.Class1;
import java.util.Scanner;

// Code by Paul Ujlaky, 1/21/25

public class Main {

    // using all static methods, but could be multiple classes

    public static void main(String[] argv) {

        String input = read();

        String output = process(input);

        System.out.println(output);

    }

    public static String process(String input) {

        if (input.length() <= 4) {

            return input;

        } else {

            // Can do first & last only once. only middle needs custom logic

            String first = input.substring(0, 1); 
            String last = input.substring(input.length() - 1);

            if (input.length() % 2 == 1 && input.length() >= 5) { // odd and >= 5

                String middle = input.substring(input.length() / 2, input.length() / 2 + 1); // middle character

                return first + middle + last; // concat them all

            } else if (input.length() % 2 == 0 && input.length() >= 6) { // even and >= 6

                String twoMiddle = input.substring(input.length() / 2 - 1, input.length() / 2 + 1); // two middle characters

                return first + twoMiddle + last; // also concat them all
                
            } else {

                return input; // should not happen

            }

        }
        
    }

    public static String read() {

        System.out.print("Enter a string: ");

        Scanner scanner = new Scanner(System.in);

        String nextLine = scanner.nextLine();

        scanner.close(); // make compiler happy

        return nextLine;

    }

}