package Class22Practice;

import java.util.Scanner;

public class Manager {

    static CinemaHall cinema = new CinemaHall();

    public static void watchInteractions() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the cinema hall!\nBelow are the available seats.");

        cinema.printSeats();

        while (true) { // Loop for UI

            System.out.println("Enter the seat you want to book (e.g. A1, B2, etc.) or type 'exit' to leave.");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {

                System.out.println("Goodbye!");
                break; // exits since compiler has no more event loop

            }

            // Sanitize input

            int[] rowColumn;

            try {

                rowColumn = convertInputToRowColumn(input);

            } catch (Exception e) {

                System.out.println("Invalid input");
                cinema.printSeats(); // Be consistent

                continue; // skips the rest of the loop

            }

            int row = rowColumn[0];
            int column = rowColumn[1];

            try {

                cinema.bookSeat(row, column);

            } catch (Exception e) {

                System.out.println(e.getMessage());

            }

            cinema.printSeats();

        }

    }

    private static int[] convertInputToRowColumn(String input) throws Exception {

        // User will enter something like A1, B1, etc.. etc...

        char rowString = input.charAt(0);
        String columnString = input.substring(1); // +1 to ignore the letter

        int row, column;

        try {

            row = cinema.getRowFromLetter(rowString);
            column = Integer.parseInt(columnString) - 1; // -1 to make it 0-based

        } catch (Exception e) {

            throw new Exception("Invalid input");

        }

        return new int[] {row, column};

    }

}
