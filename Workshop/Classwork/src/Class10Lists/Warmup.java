package Class10Lists;

import java.util.ArrayList;

public class Warmup {

    public static void main(String[] argv) {

        // Task 1: Create an ArrayList to store Strings
        // Prompt: Declare and initialize an ArrayList named 'myList' that holds String values.

        ArrayList<String> myList = new ArrayList<>();

        // Task 2: Add elements to the ArrayList
        // Prompt: Add three elements to 'myList'. Example: "Apple", "Banana", "Cherry"

        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");

        // Task 3: Get an element from the ArrayList
        // Prompt: Use the get() method to retrieve the second element from 'myList' and print it.

        System.out.println(myList.get(1));

        // Task 4: Set an element in the ArrayList
        // Prompt: Change the first element of 'myList' to "Grapes" using the set() method.

        myList.set(0, "Grapes");

        // Task 5: Remove an element from the ArrayList
        // Prompt: Remove the third element from 'myList' using the remove() method.

        myList.remove(2);

        // Task 6: Get the size of the ArrayList
        // Prompt: Use the size() method to print the current size of 'myList'.

        System.out.println(myList.size());

        // Task 7: Print the final list
        // Prompt: Print all elements in 'myList' to see the final content.

        for (String item : myList) {

            System.out.println(item);

        }
    }
}