package Class13Practice;

import java.util.*;

public class Warmup {

    public static void main(String[] args) {

        // Create an ArrayList of some city names

        ArrayList<String> cities = new ArrayList<>();

        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Paris");

        // Use a for-each loop to print each city in the list

        System.out.println("Printing cities using a for-each loop:");

        for (String city : cities) {
            System.out.println(city);
        }

        // Use the forEach method with a method reference to print each city in the list

        System.out.println("\nPrinting cities using the forEach method:");

        cities.forEach(System.out::println);

    }

}