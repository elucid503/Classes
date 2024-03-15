public class Main {
    public static void main(String[] args) {

        new ReadStudents();
        int[] studentIDs = ReadStudents.getStudentId();

        System.out.println("Student IDs: ");

        for (int i = 0; i < studentIDs.length; i++) {
            System.out.println(studentIDs[i]);
        }

    }
}