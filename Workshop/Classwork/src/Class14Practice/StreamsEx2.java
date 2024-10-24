package Class14Practice;

import java.util.Arrays;
import java.util.List;

public class StreamsEx2 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squaredNumbers = numbers.stream()
            .map(number -> (int) Math.pow(number, 2)) // intermediate operation to square the number using Math lib (casting back to int)
            .toList(); // terminal operation

        System.out.println("Original List: " + numbers);
        System.out.println("Squared List: " + squaredNumbers);

    }
}
