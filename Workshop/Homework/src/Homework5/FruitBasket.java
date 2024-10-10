package Homework5;

import java.util.ArrayList;
import java.util.Iterator;

public class FruitBasket {

    ArrayList<String> fruits = new ArrayList<String>();

    public static void main(String[] argv) {

        FruitBasket basket = new FruitBasket();

        basket.addFruit("Apple");
        basket.addFruit("Banana");
        basket.addFruit("Cherry");
        basket.addFruit("Date");
        basket.addFruit("Elderberry");

        basket.printAllFruits();

        basket.removeFruit("Banana");

        basket.printAllFruits();

        basket.findFruit("Cherry");

        basket.findFruit("Banana");

    }

    public void addFruit(String fruit) {

        fruits.add(fruit);

    }

    public void printAllFruits() {

        for (String fruit : fruits) {

            System.out.println(fruit);

        }

    }

    public void removeFruit(String fruit) {

        Iterator iterator = fruits.iterator();

        while (iterator.hasNext()) {

            if (iterator.next().equals(fruit)) {

                iterator.remove();

            }

        }

    }

    public void findFruit(String fruit) {

        int index = 0;
        boolean found = false;

        while (!found && index < fruits.size()) {

            if (fruits.get(index).equals(fruit)) {

                found = true;

            }

            index++;

        }

        if (found) {

            System.out.println(fruit + " is in the basket.");

        } else {

            System.out.println(fruit + " is not in the basket.");

        }

    }

}
