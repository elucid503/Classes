package Class15Practice;

public class StringMethodsPractice {

    public static void main(String[] args) {

        String text = "Java programming is fun";
        String fileName = "document.pdf";
        String sentence = "Hello World";
        String spacedText = "   Hello Java   ";

        // 1. contains() - Check if the text contains "Java"

        boolean containsJava = text.contains("Java");
        System.out.println("Contains 'Java': " + containsJava);

        // Practice: Check if the text contains "Python".

        System.out.println("Contains 'Python': " + text.contains("Python"));
        System.out.println();

        // 2. endsWith() - Check if the file name ends with ".pdf"

        boolean isPDF = fileName.endsWith(".pdf");
        System.out.println("Is a PDF file: " + isPDF);

        // Practice: Check if the file name ends with ".doc".

        System.out.println("Is a DOC file: " + fileName.endsWith(".doc"));
        System.out.println();

        // 3. startsWith() - Check if the sentence starts with "Hello"

        boolean startsWithHello = sentence.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);

        // Practice: Check if the sentence starts with "World".

        System.out.println("Starts with 'World': " + sentence.startsWith("World"));
        System.out.println();

        // 4. indexOf() - Find the index of "World" in the sentence

        int index = sentence.indexOf("World");
        System.out.println("Index of 'World': " + index);

        // Practice: Find the index of "Java" in the text.

        System.out.println("Index of 'Java': " + text.indexOf("Java"));
        System.out.println();

        // 5. substring() - Extract "Java" from the text

        String subText = text.substring(0, 4);
        System.out.println("Extracted text: " + subText);

        // Practice: Extract "programming" from the text.

        System.out.println("Extracted text: " + text.substring(5, 15));
        System.out.println();

        // 6. toUpperCase() - Convert the sentence to uppercase

        String upperSentence = sentence.toUpperCase();
        System.out.println("Uppercase sentence: " + upperSentence);

        // Practice: Convert the text to uppercase.

        System.out.println("Uppercase text: " + text.toUpperCase());
        System.out.println();

        // 7. trim() - Remove leading and trailing spaces from spacedText

        String trimmedText = spacedText.trim();
        System.out.println("Trimmed text: '" + trimmedText + "'");

        // Practice: Create another string with spaces and trim it.

        String anotherSpacedText = "  Learn Java  "; // your code here
        System.out.println("Trimmed text: '" + anotherSpacedText.trim() + "'");

    }
}

