package Homework4;

public class Main {

    public static void main(String[] argv) {

        Person linus = new Person("Linus");
        Person terry = new Person("Terry");

        PostOffice postOffice = new PostOffice("Postman Ken");

        LetterWriter letterWriter = new LetterWriter();

        String letter = letterWriter.writeLetter(linus, "Hello, Terry!");

        postOffice.deliverLetter(linus, terry, letter);

        terry.readLetter();

    }

}
