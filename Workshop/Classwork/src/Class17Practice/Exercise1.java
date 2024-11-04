package Class17Practice;

abstract class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

}

interface Movable {

    default void move() {
        System.out.println("I am moving");
    }

}

class Dog extends Animal implements Movable {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void move() {
        Movable.super.move();
    }
}

public class Exercise1 {

    public static void main(String[] argv) {

        Dog dog = new Dog("Rufus");

        System.out.println(dog.name);
        dog.makeSound();
        dog.move();

    }

}