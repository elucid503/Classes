import java.util.Scanner;

public class Lab6 {

    public static int DoMenu() {

        Scanner in = new Scanner(System.in);

        System.out.println("1. Chocolate Chip");
        System.out.println("2. Coffee");
        System.out.println("3. Vanilla");
        System.out.println("4. Strawberry");

        System.out.print("Enter your choice: ");

        int choice;

        try {
            choice = in.nextInt();
        } catch (Exception e) {
            choice = -1;
        }

        return choice;

    }

    public static String DoRating(int val) {

        switch (val) {
            case 1:
                return "Chocolate chip is pretty good.";
            case 2:
                return "Coffee IS good.";
            case 3:
                return "Vanilla always works.";
            case 4:
                return "Strawberry depends on the day.";
            default:
                return "Is not an ice cream.";
        }

    }

    public static void main(String[] args) {

        int choice = DoMenu();
        String rating = DoRating(choice);

        System.out.println(rating);

    }
}