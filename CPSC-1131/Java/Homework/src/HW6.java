import java.util.Scanner;

public class HW6 {

    public static int CountNumberOfVowels() {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String Str = in.nextLine();

        int Cnt = 0;
        String[] vowels = {"a", "e", "i", "o", "u"};

        for (int i = 0; i < Str.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (Str.substring(i, i + 1).equalsIgnoreCase(vowels[j])) {
                    Cnt++;
                }
            }
        }

        return Cnt;

    }

    public static void StringWorker(String Str, boolean fix) {

        System.out.println("---------------------\nString: " + Str + "\n---------------------");

        String[] Words = Str.split(" ");

        for (String word : Words) {

            if (word.length() % 2 == 0) {

                System.out.printf("Character at Pos 2 of \"%s\": " + word.charAt(1) + "\n", word); // If the word length is even, print the second character

            } else {

                if (!fix) {

                    // If the word length is odd, print the index of the last character
                    // Word: Odd

                    System.out.printf("Last Character Index of \"%s\" (Bad Way): " + (word.indexOf(word.charAt(word.length() - 1))) + "\n", word);

                }

                else {

                    // Don't look up by letter since the letter may be duped
                    // This will *always* get the last index of the word

                    System.out.printf("Last Character Index of \"%s\" (Good Way!): " + (word.length() - 1) + "\n", word);

                }

            }

        }

    }

    public static void main(String[] argv) {

        System.out.println("Number of vowels: " + CountNumberOfVowels());

        StringWorker("Even Odd", false); // Note, this will actually return the incorrect index with "Odd" since it has two "d" characters at the end and it's using .charAt
        StringWorker("Even Odd", true); // This fixes that

    }

}
