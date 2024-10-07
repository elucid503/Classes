package Class11Practice;

// Task 1: Import the necessary libraries for ArrayList and Iterator

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorLoop {

    public static void main(String[] args) {

        // Creating an ArrayList of fruits
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Task 2: Get an iterator for the ArrayList

        Iterator<String> fruitIterator = fruits.iterator();

        // Task 3: Iterate through the list using the iterator
        // Reflection: What does the hasNext() method check here?

        // hasNext() checks if there are more elements in the collection to iterate over

        while (fruitIterator.hasNext()) {

            // Task 4: Use next() to retrieve the next element in the collection and assign it to a variable
            // Reflection: Why do we need to call next() after checking hasNext()?

            String currentFruit = fruitIterator.next();

            // next() retrieves the next element in the collection and advances the iterator to the next element

            System.out.println("Current fruit: " + currentFruit);

        }

        // Task 5: After the loop ends, discuss why the loop stops when hasNext() is false

        // The loop stops when hasNext() is false because there are no more elements in the collection to iterate over

        // Reflection: What happens when there are no more elements to iterate over?

        // When there are no more elements to iterate over, the loop stops and the program continues to execute the next statement

        System.out.println("All fruits have been processed.");

        // Calling the removeFruit method to remove a specific fruit from the list

    }

}