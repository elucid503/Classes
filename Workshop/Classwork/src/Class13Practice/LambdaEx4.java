package Class13Practice;

import java.util.ArrayList;

public class LambdaEx4 {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Use a forEach loop to print all fruits in uppercase

        fruits.forEach(fruit -> {

            // Convert the fruit to uppercase and print

            System.out.println(fruit.toUpperCase());

        });

    }
}