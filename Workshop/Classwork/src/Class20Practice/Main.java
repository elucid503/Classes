package Class20Practice;

public class Main {

    public static void main(String[] argv) {

        Animal myAnimal = new Animal("Bird");

        Cat myCat = new Cat("Flinkey");
        Dog myDog = new Dog("Skipper");

        System.out.println("----- Generic Animal (Bird) -----");

        System.out.println("Total Animals Created: " + myAnimal.getTotalAnimalCount());
        myAnimal.run();

        System.out.println("----- Cat -----");

        System.out.println("Total Cats Created: " + Cat.numberOfCatsCreated);
        myCat.eat();

        System.out.println("----- Dog -----");

        System.out.println("Total Dogs Created: " + Dog.numberOfDogsCreated);
        myDog.run();

    }

}
