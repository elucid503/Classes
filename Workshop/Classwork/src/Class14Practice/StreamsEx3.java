package Class14Practice;

import java.util.Arrays;
import java.util.List;

public class StreamsEx3 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Finding sum of the squares of the even numbers

        int sumOfSquaresOfEvenNumbers = numbers.stream()
            .filter(number -> number % 2 == 0) // intermediate operation using lambda expression w modulus
            .map(number -> number * number) // (another) intermediate operation to square the number w/o math lib
            .reduce(0, Integer::sum); // terminal operation, using method reference. can also be written as (a, b) -> a + b

        System.out.println("Sum of the squares of the even numbers: " + sumOfSquaresOfEvenNumbers);

    }
}
