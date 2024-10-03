package Homework4;

public class Person {

    // Props

    private final String name;
    private String receivedLetter;

    public Person(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

    public void sendLetter(Person recipient, String letter) {

        recipient.receiveLetter(letter);

    }

    public void receiveLetter(String letter) {

        System.out.println("Letter received by " + this.name);
        this.receivedLetter = letter;

    }

    public void readLetter() {

        System.out.println("Letter read by " + this.name + ": " + this.receivedLetter);

    }

}
