package Class13Practice;

import java.util.ArrayList;

public class LambdaEx2 {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Avocado");
        fruits.add("Grapes");

        // Use a for-each loop with a condition to print fruits that start with "A"
        // Convert this into a lambda expression inside the forEach method

        fruits.forEach(fruit -> {

            if (fruit.startsWith("A")) {
                System.out.println(fruit);
            }

        });

    }

}