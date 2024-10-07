package Class11Practice;

public class EqualityDemo {

    public static void main(String[] args) {

        // Create two String literals

        String str1 = "world";
        String str2 = "world";

        // Task 15: Compare identity of literals str1 and str2 using '=='
        // Prompt: Are both literals str4 and str5 identical in memory? Why or why not?

        System.out.println("Identity comparison of String literals (==):");
        System.out.println(str1 == str2);

        // The literals str1 and str2 are identical in memory because Java uses String interning -> https://en.wikipedia.org/wiki/String_interning

        // Task 16: Compare equality of str1 and str2 using .equals()
        // Prompt: Now, compare str4 and str5 using the .equals() method.

        System.out.println("Equality comparison of String literals (.equals):");
        System.out.println(str1.equals(str2));

        // The literals str1 and str2 are equal in content because they have the same value

        // Task 17: Create a String object 'str3' with the same content using the 'new' keyword

        String str3 = new String("world");

        // Task 18: Compare identity of str1 and str3 using '==' operator
        // Prompt: Compare identity between str1 and str3 and think about how String literals are handled in Java.

        System.out.println("Identity comparison of String literals and String Objects using (==):");
        System.out.println(str1 == str3);

        // Returns false because str1 and str3 are different objects in memory... pointers are not ==

        // Task 19: Compare equality of str1 and str3 using .equals() method
        // Prompt: Now, compare str1 and str3 using the .equals() method. Will this return true or false?

        System.out.println("Equality comparison of String literals and String Objects using (.equals):");
        System.out.println(str1.equals(str3));

        // Returns true because the content of str1 and str3 are the same

        // Task 20: Create another String object 'str4' with the same content using the 'new' keyword

        String str4 = new String("world");

        // Task 21: Compare identity of str3 and str4 using '==' operator (identity comparison of String objects)

        System.out.println("Identity comparison of String objects (==):");
        System.out.println(str3 == str4);

        // Returns false because str3 and str4 are different objects in memory... pointers are again not ==

        // Task 22: Compare equality of str3 and str4 using .equals() method (equality comparison of String objects)

        System.out.println("Equality comparison of String objects (.equals):");
        System.out.println(str3.equals(str4));

        // Returns true because the content of str3 and str4 are the same

    }

}
