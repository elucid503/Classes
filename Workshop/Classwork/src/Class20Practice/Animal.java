package Class20Practice;

public class Animal implements AnimalBehavior {

    // Constants

    static final String KINGDOM = "Animalia";

    static int totalAnimalCount = 0;

    String type;

    public Animal(String type) {

        this.type = type;
        totalAnimalCount++;

    }

    static void announcePresence() {

        System.out.println("A new animal appears!");

    }

    int getTotalAnimalCount() {

        return totalAnimalCount;

    }

    @Override
    public void eat() {
        System.out.println("The animal is eating");
    }

    @Override
    public void sleep() {
        System.out.println("The animal is sleeping");
    }

}
