public class Main {
    public static void main(String[] args) {

        // Call the readStudents.ReadStudents method (utility class)

        new ReadStudents();
        int[] studentIDs = ReadStudents.getStudentId();


        System.out.println("Student IDs: ");

        for (int i = 0; i < studentIDs.length; i++) {
            System.out.println(studentIDs[i]);
        }

    }
}