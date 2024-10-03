package Class10Lists;
import java.util.ArrayList;
import java.util.Scanner;

//Part 1

public class Fruit {

    final String name;
    double price;
    int quantity;

    // Constructor

    public Fruit(String name, double price, int quantity) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    // Getters and Setters

    public String getName() {

        return name;

    }

    public double getPrice() {

        return price;

    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;

    }

    public int getQuantity() {

        return quantity;

    }

    // Method to print fruit details

    public void printFruitDetails() {

        System.out.println(name + ": $" + price + " - " + quantity + " units");

    }

    public static void main(String[] args) {

        System.out.println("\nPart 2:");

        // Task 8: Part 2.1: Create an ArrayList 'market' of Fruit objects

        ArrayList<Fruit> market = new ArrayList<>();

        // Task 9: Part 2.2: Add fruits to the market

        market.add(new Fruit("Apple", 1.99, 10));
        market.add(new Fruit("Banana", 0.99, 20));

        // Task 10: Print the ArrayList 'market' directly
        // Prompt: What do you see? Are the fruit details printed as expected or just object references?

        System.out.println("Printing market directly: " + market);

        // This will print the object references, not the fruit details, since the ArrayList is of type Fruit.

        // Task 11: Use a for-each loop to print each Fruit object’s details
        // Prompt: Use a for-each loop to call printFruitDetails() for each fruit in the market1 list.

        for (Fruit fruit : market) {

            fruit.printFruitDetails();

        }

        // Task 12: Modify an existing fruit's quantity (e.g., when new stock arrives)

         // Modify Apple quantity

        market.forEach(fruit -> {

            if (fruit.getName().equals("Apple")) {

                fruit.setQuantity(15);

            }

        });

        //Task 13: Use a while loop to print each Fruit object’s details after the update

        int i = 0;

        while (i < market.size()) {

            market.get(i).printFruitDetails();
            System.out.println(market.get(i).getQuantity()); // printing to see the changed quantity

            i++;

        }

        System.out.println("\nPart 3:");

        // Task 14: Search for a specific fruit

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the name of the fruit to search: ");
        String searchName = scanner.nextLine();

        boolean found = false;

        //Use a for-each loop for the 'market' collection

        for (Fruit fruit : market) {

            if (fruit.getName().equalsIgnoreCase(searchName)) {

                System.out.println("Found fruit: ");

                //Print the fruit details

                fruit.printFruitDetails();

                // Update the state of 'found'
                found = true;

            }
        }

        // if not found then.......

        if (!found) {
            System.out.println("Fruit not available.");
        }

    }

}