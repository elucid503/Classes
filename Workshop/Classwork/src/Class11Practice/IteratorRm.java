package Class11Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRm {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
        myList.add("Lion");
        myList.add("Tiger");
        myList.add("Bear");

        removeItem(myList, "Lion");

        System.out.println("Updated list: " + myList);

    }

    // Method to remove a specific element from the list using an Iterator

    public static void removeItem(ArrayList<String> suppliedList, String toRemove) { //Step 1: Choose specific type of ArrayList and element in it as parameters

        // Step 2: Get an iterator for the ArrayList
        // Prompt: Why do we need to get an iterator here instead of using a simple for-each loop?
        
        // We need to get an iterator here instead of using a simple for-each loop because we need to safely remove elements from the list while iterating over it        
        
        Iterator<String> iterator = suppliedList.iterator();

        // Step 3: Iterate through the list using the iterator
        // Reflection: What does the hasNext() method check here? Why do we need it?

        // hasNext() checks if there are more elements in the collection to iterate over

        while (iterator.hasNext()) {

            // Step 4: Use next() to get the next element
            // Prompt: What does next() do and why should it be used inside the loop?

            String element = iterator.next();

            // Step 4: Check if the current element matches the fruit to remove

            if (element.equals(toRemove)) {

                // Step 5: Remove the matching fruit using the iterator's remove() method

                // Add a print to show that it is going to be removed

                System.out.println("Removing " + element + " from the list.");

                // Safely remove the fruit using the iterator

                iterator.remove();

                // If you do not want to remove any more elements, you can break out of the loop using break;

            }

        }

    }


}
