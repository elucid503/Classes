package Homework7;

abstract class Animal {

    String name;
    String type;

    public Animal(String name, String type) {

        this.name = name;
        this.type = type;

    }

    abstract void makeSound();

    void sleep() {

        System.out.println(name + " is sleeping.");

    }

}

interface Moveable {

    abstract void move();

    default void stop(String animalName) {

        // To actually reference the animal name here as directed in the instructions, you'd need to use the instanceof
        // operator to see if this is being called from a class that extends Animal, and then cast the "this" object to an Animal
        // since we didn't cover that, this can be done by just requiring the animal name as a parameter.

        System.out.println(animalName + " has stopped moving.");

    }

}

class Location {

    String animalName;

    int x;
    int y;

    public Location(String animalName) {

        this.animalName = animalName;

    }

    void updatePosition(int x, int y) {

        this.x = x;
        this.y = y;

        System.out.println(this.animalName + " is now at position (" + x + ", " + y + ").");

    }

    // Overloading for if not wanting to print

    void updatePosition(int x, int y, boolean noPrint) {

        this.x = x;
        this.y = y;

    }

}

class Dog extends Animal implements Moveable {

    Location location;

    public Dog(String name, String type) {

        super(name, type);

        this.location = new Location(name);

    }

    @Override
    void makeSound() {

        System.out.println(name + " barks!");

    }

    @Override
    public void move() {

        this.location.updatePosition(4, 2);

    }

}

class Bird extends Animal implements Moveable {

    Location location;

    public Bird(String name, String type) {

        super(name, type);

        this.location = new Location(name);

    }

    @Override
    void makeSound() {

        System.out.println(name + " chirps!");

    }

    @Override
    public void move() {

        this.location.updatePosition(50, 3, true); // Does not print

        System.out.println(name + " is flying to position: (" + this.location.x + ", " + this.location.y + ").");

    }

}

public class Main {

    public static void main(String[] argv) {

        Dog dog = new Dog("Rufus", "Dog");
        Bird bird = new Bird("Chirpy", "Bird");

        dog.makeSound();
        dog.sleep();
        dog.move();
        dog.stop(dog.name); // Read above on why the name is passed here

        bird.makeSound();
        bird.sleep();
        bird.move();
        bird.stop(bird.name);

    }

}