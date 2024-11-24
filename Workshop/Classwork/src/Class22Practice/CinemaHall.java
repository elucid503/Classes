package Class22Practice;

public class CinemaHall {

    boolean[][] seats = new boolean[10][10];

    public void printSeats() {

        String seatEmptyAppend = "(A) ";
        String seatFilledAppend = "(B) ";

        for (int i = 0; i < seats[0].length; i++) {

            // Loop through the first dimension, which is all the rows

            for (int j = 0; j < seats.length; j++) {

                // Now in the 2nd dimension, which represents a single row

                int seatNumber = j + 1;

                boolean isSeatBooked = seats[i][j];

                String representation = String.format("%s%d", getRowLetter(i), seatNumber); // Ex: A1, A2, A3, etc.

                System.out.print(representation + (isSeatBooked ? seatFilledAppend : seatEmptyAppend));

            }

            System.out.println();

        }

    }

    public void bookSeat(int row, int column) throws Exception { // making it throw an exception instead of just printing the error, for fun

        // Do some initial checks to avoid invalid assignment/query on the array

        if (row < 0 || row >= seats.length || column < 0 || column >= seats[0].length) {

            throw new Exception("Invalid seat");

        }

        if (seats[row][column]) {

            System.out.println("Seat already booked"); // this won't throw an exception b/c it's not a critical error

        } else {

            seats[row][column] = true;

            System.out.println("Seat booked");

        }

    }

    private String getRowLetter(int row) {

        // Using some ascii stuff

        return String.valueOf((char) (row + 65)); // + 65 to get the ascii value of the letter

    }

    // Needs to be public, using it in Manager

    public int getRowFromLetter(char letter) {

        return (int) letter - 65; // Reverse of above, casting to an int

    }

}
