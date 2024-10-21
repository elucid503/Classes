package Class13Practice;

import java.util.ArrayList;

public class LambdaEx1 {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        // Add some fruits to the list

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Use a for-each loop to print each fruit (replace with lambda expression)

        fruits.forEach(fruit -> System.out.println(fruit));

    }

}