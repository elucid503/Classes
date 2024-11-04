package Class17Practice;

interface Flyable {

    void fly();

}

interface Swimmable {

    void swim();

}

class Duck implements Flyable, Swimmable {

    @Override
    public void fly() {
        System.out.println("Duck flies with its wings");
    }

    @Override
    public void swim() {
        System.out.println("Duck swims in the lake");
    }

}

public class Exercise2 {

    public static void main(String[] argv) {

        Duck duck = new Duck();

        duck.fly();
        duck.swim();

    }

}
