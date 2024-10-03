package Homework4;

public class LetterWriter {

    public String writeLetter(Person writer, String message) {

        System.out.println("Letter written by " + writer.getName() + ": " + message);
        return message;

    }

}
