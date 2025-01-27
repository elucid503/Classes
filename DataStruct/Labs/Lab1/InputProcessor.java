package Labs.Lab1;

import java.util.ArrayList;

public class InputProcessor implements GeneralProcessor {

    private String input;

    private ArrayList<String> items = new ArrayList<String>();

    @Override
    public void setInput(String input) {

        this.input = input;

    }

    @Override
    public ArrayList<String> getResults() {

        return items;

    }

    private void splitInput() {

        String[] words = input.split(" ");

        for (String item : words) {

            if (item.length() != 0) items.add(item);

        }

    }

    private void sortItems() {

        // Using the built in sort method for ArrayList, and compareTo method for Strings

        items.sort((String a, String b) -> a.toLowerCase().compareTo(b.toLowerCase())); // mutates so we don't need another list. also, toLowerCase helps

    }

    @Override
    public void processItems() {

        // Splits and sorts 

        splitInput();

        sortItems();

    }
    
}
