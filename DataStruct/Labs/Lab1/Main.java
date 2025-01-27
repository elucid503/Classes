package Labs.Lab1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GeneralProcessor processor = new InputProcessor(); // GeneralProcessor can be used here as the type since the InputProcessor adheres to it

        processor.setInput(getInput());

        processor.processItems();

        processor.getResults().forEach((word) -> System.out.println(word)); // print on a new line for each one

    }
    
    public static String getInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter anything: ");

        String input = scanner.nextLine();

        scanner.close();

        return input;

    }

}