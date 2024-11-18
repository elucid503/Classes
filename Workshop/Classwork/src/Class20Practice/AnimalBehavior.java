package Class20Practice;

public interface AnimalBehavior {

    public static final String name = "Animal";

    public abstract void eat();
    public abstract void sleep();

    public default void run() {
        System.out.println("Animal is running");
    }

}
