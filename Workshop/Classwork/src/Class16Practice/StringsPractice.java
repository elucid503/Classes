package Class16Practice;

public class StringsPractice {

    public static void main(String[] argv) {

        String paragraph = "Learning Java is empowering and challenging.";

        System.out.println(paragraph.contains("Java"));

        System.out.println(paragraph.indexOf("empowering"));

        System.out.println(paragraph.substring(9, 13)); // The word Java starts at index 9 and ends at 13

        System.out.println(paragraph.toLowerCase());

        String extraSpaces = " Java \"Rocks\"! ";

        System.out.println(extraSpaces.trim());

    }

}
