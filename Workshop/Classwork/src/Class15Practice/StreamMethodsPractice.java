package Class15Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMethodsPractice {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 6);
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Apple");
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Yellow", "Green");

        // 1. distinct() - Remove duplicate numbers

        System.out.println("Distinct numbers:");
        numbers.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        // Practice: Use distinct() on a list of fruits to remove duplicates.

        System.out.println("Distinct fruits:");
        fruits.stream().distinct().forEach(System.out::println);

        System.out.println();

        // 2. sorted() - Sort the numbers

        System.out.println("Sorted numbers:");
        numbers.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        // Practice: Sort the list of colors alphabetically.

        System.out.println("Sorted colors:");
        colors.stream().sorted().forEach(System.out::println);

        System.out.println();

        // 3. limit() - Limit to the first 3 fruits

        System.out.println("Limited fruits:");
        fruits.stream()
                .limit(3)
                .forEach(System.out::println);
        System.out.println();

        // Practice: Limit the numbers list to the first 4 elements.

        System.out.println("Limited numbers:");
        numbers.stream().limit(4).forEach(System.out::println);

        System.out.println();

        // 4. skip() - Skip the first 2 colors

        System.out.println("Skipped colors:");
        colors.stream()
                .skip(2)
                .forEach(System.out::println);
        System.out.println();

        // Practice: Skip the first 3 numbers in the list.

        System.out.println("Skipped numbers:");
        numbers.stream().skip(3).forEach(System.out::println);

        System.out.println();

        // 5. anyMatch() - Check if any number is greater than 5

        boolean anyMatch = numbers.stream().anyMatch(num -> num > 5);
        System.out.println("Any number greater than 5: " + anyMatch);
        System.out.println();

        // Practice: Check if any fruit starts with "B".

        boolean anyFruitWithB = fruits.stream().anyMatch(fruit -> fruit.startsWith("B"));

        System.out.println("Any fruit starts with 'B': " + anyFruitWithB);
        System.out.println();

        // 6. allMatch() - Check if all numbers are positive

        boolean allMatch = numbers.stream().allMatch(num -> num > 0);
        System.out.println("All numbers are positive: " + allMatch);
        System.out.println();

        // Practice: Check if all colors have more than 3 letters.

        boolean allColorsLong = colors.stream().allMatch(color -> color.length() > 3);

        System.out.println("All colors have more than 3 letters: " + allColorsLong);
        System.out.println();

        // 7. noneMatch() - Check if no number is negative

        boolean noneMatch = numbers.stream().noneMatch(num -> num < 0);
        System.out.println("No numbers are negative: " + noneMatch);
        System.out.println();

        // Practice: Check if none of the fruits contain the letter "z".

        boolean noFruitWithZ = fruits.stream().noneMatch(fruit -> fruit.contains("z"));

        System.out.println("No fruit contains 'z': " + noFruitWithZ);
        System.out.println();

        // 8. count() - Count the number of fruits

        long count = fruits.stream().count();
        System.out.println("Number of fruits: " + count);
        System.out.println();

        // Practice: Count the number of colors in the list.

        long colorCount = colors.stream().count();

        System.out.println("Number of colors: " + colorCount);
        System.out.println();

        // 9. findFirst() - Find the first number

        Optional<Integer> firstNumber = numbers.stream().findFirst();
        firstNumber.ifPresent(num -> System.out.println("First number: " + num));
        System.out.println();

        // Practice: Find the first fruit in the list.

        Optional<String> firstFruit = fruits.stream().findFirst();

        firstFruit.ifPresent(fruit -> System.out.println("First fruit: " + fruit));
        System.out.println();

        // 10. max() - Find the maximum number using a lambda comparator

        Optional<Integer> maxNumber = numbers.stream().max((num1, num2) -> Integer.compare(num1, num2));

        maxNumber.ifPresent(max -> System.out.println("Max number: " + max));

        System.out.println();

        // Practice: Find the longest fruit name using a lambda comparator.

        Optional<String> longestFruit = fruits.stream().max((fruit1, fruit2) -> Integer.compare(fruit1.length(), fruit2.length()));

        longestFruit.ifPresent(fruit -> System.out.println("Longest fruit: " + fruit));

    }
}

