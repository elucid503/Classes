import java.util.ArrayList;

public class Fruits {

    public static void main(String[] argv) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // Enhanced-for loop

        for (String item : list) {
            System.out.println(item);
        }

        // Print using while loop

        int i = 0;

        while (i < list.size()) {
            System.out.println(list.get(i));
            i++;
        }

    }

}