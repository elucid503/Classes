package Class13Practice;

import java.util.ArrayList;

public class LambdaEx3 {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        int[] count = {0}; // Tricky!

        // After doing some research and looking at the error for probably too long, all variables used within the lambda must be "final".
        // AtomicInteger works because the class effectively contains the int, so it can be changed without changing the reference.
        // Storing the int into the array's 0th also will work, because the reference is the same.

        // Use a forEach loop to count fruits with more than 5 letters

        fruits.forEach(fruit -> {

            if (fruit.length() > 5) {

                count[0]++;

            }

        });

        System.out.println("Number of fruits with more than 5 letters: " + count[0]);

    }

}