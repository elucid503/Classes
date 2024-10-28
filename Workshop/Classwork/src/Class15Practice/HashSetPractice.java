package Class15Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetPractice {

    public static void main(String[] args) {

        // Example with ArrayList

        List<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("A"); // Duplicate

        System.out.println("ArrayList elements (Order maintained):");
        for (String element : arrayList) {
            System.out.println(element);
        }

        // Print the order of elements in the ArrayList

        System.out.println("Order of elements in ArrayList: " + arrayList);
        System.out.println();

        // Example with HashSet

        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A"); // Duplicate

        System.out.println("HashSet elements (Order not guaranteed):");

        for (String element : hashSet) {
            System.out.println(element);
        }

        // Print the order of elements in the HashSet
        System.out.println("Order of elements in HashSet: " + hashSet);
        System.out.println();

        // Practice: Add more elements to the ArrayList and HashSet and observe the order.

        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");

        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");

        System.out.println("Updated ArrayList elements (Order maintained):");
        System.out.println(arrayList);

        System.out.println("Updated HashSet elements (Order not guaranteed):");
        System.out.println(hashSet);

    }
}

