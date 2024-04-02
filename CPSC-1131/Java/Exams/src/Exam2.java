import java.util.Scanner;

public class Exam2 {

    // Not sure if you say was supposed to be in there, but kept it to be consistent with the results
    final static String StringConstant = "Today is a Very Fine Day to be in Fairfield you say";

    public static void PrintOddUpperCase() {

        // Prints the words with odd length in StringConstant as uppercase

        int NumOfWordsWithY = 0;
        int NumOfYOccurences = 0;

        for (String word: StringConstant.split(" ")) {

            if (word.toLowerCase().contains("y")) {
                NumOfWordsWithY++;
            }

            for (int i = 0; i < word.length(); i++) {

                if (word.toLowerCase().charAt(i) == 'y') {
                    NumOfYOccurences++;
                }

            }

            // Notice not using println

            if ((word.length() % 2) == 1) {

                // Word is odd length

                System.out.print(word.toUpperCase() + " ");

            }

            else {

                System.out.print(word.toLowerCase() + " ");

            }

        }

        System.out.println("\nNumber of words with 'y': " + NumOfWordsWithY); // New line
        System.out.println("Number of 'y' occurences: " + NumOfYOccurences);

    }

    public static boolean IsZonker(String Word) {

        // Returns true if the string contains the same word twice

        for (int i = 0; i < Word.length(); i++) {

            if (Word.indexOf(Word.charAt(i)) != Word.lastIndexOf(Word.charAt(i))) {

                return true;

            }

        }

        return false;

    }

    public static boolean IsGiddyString(String Word) {

        // Returns true if has a letter with a "g" to the left or right

        for (int i = 0; i < Word.length(); i++) {

            if (Word.charAt(i) == 'g') {

                if (i > 0 && Word.charAt(i - 1) == 'g') {

                    return true;

                }

                if (i < Word.length() - 1 && Word.charAt(i + 1) == 'g') {

                    return true;

                }

            }

        }

        return false;

    }

    public static boolean CanSplitWithEvenSum(int[] ArrayToSplit) {

        // Returns true if the inputted array can be split where both sides have the same sum

        int LeftSum = 0;
        int RightSum = 0;

        for (int i = 0; i < ArrayToSplit.length; i++) {

            LeftSum += ArrayToSplit[i];

            for (int j = i + 1; j < ArrayToSplit.length; j++) {

                RightSum += ArrayToSplit[j];

            }

            if (LeftSum == RightSum) {

                return true;

            }

            RightSum = 0; // Important in order to reset the sum, skipping this led to a very brief headache

        }

        return false;

    }

    public static int Exponential(int Base, int Exponent) {

        // Exponent using recursion

        if (Exponent == 0) {

            // Exponent of any number to 0 is 1

            return 1;

        }

        return Base * Exponential(Base, Exponent - 1);

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ShowAndHandleMenu(in);

    }

    public static void ShowAndHandleMenu(Scanner in) {

        while(true) {

            System.out.println("1. Constant Upper");
            System.out.println("2. Zonker");
            System.out.println("3. Giddy String");
            System.out.println("4. Fulcrum");
            System.out.println("5. Recursion Exponentiation");

            System.out.println("9. Exit");

            try {

                System.out.println("Enter your choice: ");
                int UserInput = in.nextInt();

                switch(UserInput) {
                    case 1:
                        PrintOddUpperCase();
                        break;
                    case 2:
                        String Word1 = "deed";
                        String Word2 = "notazonker";

                        if (IsZonker(Word1)) {
                            System.out.println(Word1 + " is a zonker.");
                        }
                        else {
                            System.out.println(Word1 + " is not a zonker.");
                        }

                        if (IsZonker(Word2)) {
                            System.out.println(Word2 + " is a zonker.");
                        }
                        else {
                            System.out.println(Word2 + " is not a zonker.");
                        }

                        break;
                    case 3:

                        String Word3 = "xxggxx";
                        String Word4 = "xxgxx";

                        if (IsGiddyString(Word3)) {
                            System.out.println(Word3 + " is a giddy string.");
                        }
                        else {
                            System.out.println(Word3 + " is not a giddy string.");
                        }

                        if (IsGiddyString(Word4)) {
                            System.out.println(Word4 + " is a giddy string.");
                        }
                        else {
                            System.out.println(Word4 + " is not a giddy string.");
                        }

                        break;

                    case 4:

                        int[] Array1 = {1, 2, 3, 4, 5, 5, 1};
                        int[] Array2 = {1, 2, 3, 4, 5, 5};

                        if (CanSplitWithEvenSum(Array1)) {
                            System.out.println("Array1 can be split with even sum.");
                        }
                        else {
                            System.out.println("Array1 cannot be split with even sum.");
                        }

                        if (CanSplitWithEvenSum(Array2)) {
                            System.out.println("Array2 can be split with even sum.");
                        }
                        else {
                            System.out.println("Array2 cannot be split with even sum.");
                        }

                        break;
                    case 5:

                        int Base = 5;
                        int Exponent = 3;

                        System.out.println("Exponential of " + Base + " to the power of " + Exponent + " is " + Exponential(Base, Exponent));

                        break;
                    case 9:
                        System.out.println("Exiting...");
                        return;
                    default:
                        throw(new Exception()); // Redundancy
                }

            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                in.nextLine(); // Clear buffer (IMPORTANT to avoid infinite loop, idk why java does not automatically clear it, probably a good reason)
                continue;
            }

        }

    }

}