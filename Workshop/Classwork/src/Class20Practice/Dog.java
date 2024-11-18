package Class20Practice;

public class Dog extends Animal {

    static int numberOfDogsCreated = 0;

    public Dog(String name) {

        super(name);
        numberOfDogsCreated++;

        this.type = "dog";

    }

    @Override
    public void run() {

        System.out.println("The dog is running!");

    }

    @Override
    public void eat() {

        // Demo of calling super

        System.out.println("Feeding the dog");
        super.eat();

    }

    public String getType() {

        return this.type;

    }

}
