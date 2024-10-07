package Class11Practice;

import java.util.ArrayList;

public class FruitLoop {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Stops printing when it reaches Banana

        for (String fruit : fruits) {

            System.out.println("Current fruit: " + fruit);

            if (fruit.equals("Banana")) {
                return;
            }

        }

    }

}
 