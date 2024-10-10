package Class12Practice;

import java.util.ArrayList;

public class RmWithWhile { // Private again to avoid conflicts

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("John");
        students.add("Alex");
        students.add("Emma");
        students.add("Alex");

        int index = 0;

        // This removes all occurrences, but to remove a single, can use break;

        while (index < students.size()) {

            if (students.get(index).equals("Alex")) {
                students.remove(index);
            } else {
                index++;
            }
        }

        System.out.println("Updated student list: " + students);
    }

}
