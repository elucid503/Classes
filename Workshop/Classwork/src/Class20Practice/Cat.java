package Class20Practice;

public class Cat extends Animal {

    static int numberOfCatsCreated = 0;

    public Cat(String name) {

        super(name);
        numberOfCatsCreated++;

        this.type = "cat";

    }

    @Override
    public void run() {

        System.out.println("The cat is running!");

    }

    @Override
    public void eat() {

        // Demo of calling super

        System.out.println("Feeding the cat");
        super.eat();

    }

    public String getType() {

        return this.type;

    }

}
