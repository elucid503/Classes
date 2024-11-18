package Class21Practice;

import java.util.Scanner;

public class FibGenerator {

    public static void main(String[] argv) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci numbers you want to generate: ");

        int n = scanner.nextInt();

        scanner.close();

        long[] fib = new long[n];

        fib[0] = 0;

        if (n > 1) {
            fib[1] = 1;
        }

        for (int i = 2; i < n; i++) {

            // Assigns the sum of the two previous numbers to the current index

            fib[i] = fib[i-1] + fib[i-2];

        }

        for (int i = 0; i < n; i++) {

            System.out.println(fib[i]);

        }

    }

}