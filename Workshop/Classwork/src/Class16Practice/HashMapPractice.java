package Class16Practice;

import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] argv) {

        HashMap<Integer, String> integerMap = new HashMap<>();

        integerMap.put(101, "Alice");
        integerMap.put(102, "Bob");
        integerMap.put(103, "Charlie");

        integerMap.put(101, "Alicia");

        System.out.println(integerMap);

    }
}