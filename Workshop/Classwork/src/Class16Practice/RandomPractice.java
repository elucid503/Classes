package Class16Practice;

public class RandomPractice {

    public static void main(String[] argv) {

        int num1 = getRandomNumberInclusive(1, 500);
        int num2 = getRandomNumberInclusive(1, 500);

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        String[] animals = {"cat", "dog", "rabbit", "bird", "kangaroo"};

        System.out.println("Random animal: " + animals[getRandomNumberInclusive(0, animals.length - 1)]);

    }

    // This helps consolidate some code here

    public static int getRandomNumberInclusive(int min, int max) {

        // To be inclusive, add 1 to the max

        return (int) (Math.random() * ((max - min) + 1)) + min;

    }

}


