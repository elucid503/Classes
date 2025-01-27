package Labs.Lab1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GeneralProcessor processor = new InputProcessor(); // GeneralProcessor can be used here as the type since the InputProcessor adheres to it

        processor.setInput(getInput());

        processor.processItems();

        System.out.println(processor.getResults());

    }
    
    public static String getInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter anything: ");

        String input = scanner.nextLine();

        scanner.close();

        return input;

    }

}