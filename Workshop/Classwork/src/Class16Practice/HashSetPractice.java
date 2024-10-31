package Class16Practice;

import java.util.HashSet;

public class HashSetPractice {

    public static void main(String[] argv) {

        HashSet<Integer> integerSet = new HashSet<>();

        integerSet.add(2);
        integerSet.add(5);
        integerSet.add(8);
        integerSet.add(9);
        integerSet.add(10);
        integerSet.add(30);
        integerSet.add(33);

        integerSet.remove(30);

        System.out.println(integerSet); // Not guaranteed to be in order

    }

}
