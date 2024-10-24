package Class14Practice;

import java.util.ArrayList;

public class StreamsEx1 {

    public static void main(String[] args) {

        // Given ArrayList of numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        // 1. Filtering Even Numbers and Printing Them (Intermediate + Terminal Operation)
        // TODO: Use streams to filter out even numbers from the list and print each of them.

        numbers.stream()
            .filter(number -> number % 2 == 0) // intermediate operation
            .forEach(System.out::println); // terminal operation

        // 2. Transform Numbers to Their Squares and Print Them (Intermediate + Terminal Operation)
        // TODO: Use streams to transform each number in the list to its square value and print it.

        numbers.stream()
            .map(number -> number * number) // intermediate operation
            .forEach(System.out::println); // terminal operation

        // 3. Summing Up All Elements (Terminal Operation)
        // TODO: Use streams to calculate the sum of all numbers in the list.

        int sum = numbers.stream()
            .reduce(0, Integer::sum); // Can just reference Integer::sum instead of (a, b) -> a + b

        // Since .reduce() is a terminal operation, we can't chain another stream operation after it

        System.out.println("Sum of all numbers: " + sum);

        // 4. Filter Numbers Greater Than 5 and Print Them (Intermediate + Terminal Operation)
        // TODO: Use streams to filter out numbers greater than 5 and then print each of them.

        numbers.stream()
            .filter(number -> number > 5) // intermediate operation
            .forEach(System.out::println); // terminal operation

    }

}
