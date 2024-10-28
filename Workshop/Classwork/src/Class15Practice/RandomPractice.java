package Class15Practice;

import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class RandomPractice {

    public static void main(String[] args) {

        // Create an instance of Random

        Random rand = new Random();

        // 1. Generate a random integer (no bounds)

        int randomInt = rand.nextInt();
        System.out.println("Random integer: " + randomInt);

        // Practice: Generate another random integer and print it.

        int anotherRandomInt = rand.nextInt();

        System.out.println("Another random integer: " + anotherRandomInt);
        System.out.println();

        // 2. Generate a random integer between 1 and 100 (inclusive)

        int randomValue = 1 + rand.nextInt(100);
        System.out.println("Random integer between 1 and 100: " + randomValue);

        // Practice: Generate a random integer between 50 and 150 (inclusive).

        int newBoundedRandomVal = 50 + rand.nextInt(101);

        System.out.println("Random integer between 50 and 150: " + newBoundedRandomVal);
        System.out.println();

        // 3. Generate a random index for a list

        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Yellow");
        int randomIndex = rand.nextInt(colors.size());

        System.out.println("Random index for colors: " + randomIndex);
        System.out.println("Randomly selected color: " + colors.get(randomIndex));

        // Practice: Create a list of fruits and generate a random index to select a fruit.

        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date");

        int randomFruitIndex = rand.nextInt(fruits.size());

        System.out.println("Randomly selected fruit: " + fruits.get(randomFruitIndex));

    }
}


