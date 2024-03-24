import java.util.HashMap;

public class Lab7 {

    public static void FindDupeCharInString(String Str) {

        System.out.println("------------------ String: " + Str);

        // Find duplicate characters

        // Split the string into characters

        char[] Chars = Str.toCharArray();

        // Use a hash map to store the character and the number of times it appears
        // Hash map is kinda cool

        HashMap<Character, Integer> CharMap = new HashMap<>();

        for (char Char : Chars) {

            if (CharMap.containsKey(Char)) {

                CharMap.put(Char, CharMap.get(Char) + 1);

            } else {

                CharMap.put(Char, 1);

            }

        }

        // Print out the characters that appear more than once

        for (char Char : CharMap.keySet()) {

            if (CharMap.get(Char) > 1 && Char != ' ') {

                System.out.println("Character: " + Char + " appears " + CharMap.get(Char) + " times.");
            }

        }

    }

    public static String ModifyParentheses(String Str) {

        System.out.println("------------------ String: " + Str);

        int start = Str.indexOf('(');
        int end = Str.indexOf(')');

        if (start != -1 && end != -1 && start < end) {

            // Loop through the string and replace the substring of the parentheses with the uppercase version of the substring

            String ToReplace = Str.substring(start, end + 1);
            String Replaced = ToReplace.toUpperCase();

            Str = Str.replace(ToReplace, Replaced);

        }

        return Str;

    }

    public static boolean CheckIfAppearsSameNumberOfTimes(String Str, String Word1, String Word2) {

        System.out.println("------------------ String: " + Str);

        int Cnt1 = 0;
        int Cnt2 = 0;

        // Loop through the string and count the number of times each word appears

        for (int i = 0; i <= Str.length() - Math.max(Word1.length(), Word2.length()); i++) {

            // Check if the substring is the word and increment the count

            if (i + Word1.length() <= Str.length() && Str.substring(i, i + Word1.length()).equalsIgnoreCase(Word1)) {

                Cnt1++;

            } else if (i + Word2.length() <= Str.length() && Str.substring(i, i + Word2.length()).equalsIgnoreCase(Word2)) {

                Cnt2++;

            }

        }

        return Cnt1 == Cnt2; // Return if the words appear the same number of times

    }

    public static void main(String[] args) {

        FindDupeCharInString("This is a test to test the test string");

        String NewStr = ModifyParentheses("It was hot (darn hot!) I'm telling you");

        System.out.println(NewStr);

        // Warning: These won't support words with periods, commas, etc. as they are not stripped out
        // Always sanitize user input

        if (CheckIfAppearsSameNumberOfTimes("catdogcatdogcat", "cat", "dog")) {

            System.out.println("cat and dog appear the same number of times.");

        } else {

            System.out.println("cat and dog do not appear the same number of times.");

        }

        if (CheckIfAppearsSameNumberOfTimes("catdog", "cat", "dog")) {

            System.out.println("cat and dog appear the same number of times.");

        } else {

            System.out.println("cat and dog do not appear the same number of times.");

        }

    }

}


