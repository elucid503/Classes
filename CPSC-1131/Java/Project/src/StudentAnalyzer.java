import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentAnalyzer {

    // This class will contain similar, but different data from the ReadStudents class and use it for the requirements

    // CURRENTLY ONLY DOES REQUIREMENTS 1-4

    // I've changed the ReadStudents class around, because I didn't necessarily like it
    // The ReadStudents class also now uses relative paths on all OS's, has better naming (for me), and is more flexible

    private static int[] StudentIDs; // IDs of the students
    private static String[] FirstNames; // First names of the students
    private static String[] LastNames; // Last names of the students
    private static int[][] Scores; // A 2D array to store the scores of each student in different subjects
    private static int[] TotalScores; // Total scores of each student
    private static double[] Percentages; // Percentage of each student

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ReadStudents.LoadData(); // Read the data from the file

        int[] StudentIDs = ReadStudents.GetStudentIDs();
        String[] FirstNames = ReadStudents.GetFirstNames();
        String[] LastNames = ReadStudents.GetLastNames();

        int[][] Scores = new int[][] {
                ReadStudents.GetScienceScores(),
                ReadStudents.GetHistoryScores(),
                ReadStudents.GetMathematicsScores(),
                ReadStudents.GetEnglishScores()
        };

        // Create an instance of the StudentAnalyzer class (this file) and pass the student information to it
        StudentAnalyzer analyzer = new StudentAnalyzer(StudentIDs, FirstNames, LastNames, Scores);

        // Show Menu and capture user input

        while (true) {

            System.out.println("Select an option:");
            System.out.println("1. Display student information");
            System.out.println("2. Display total scores");
            System.out.println("3. Display percentages");
            System.out.println("4. Display top students");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    analyzer.DisplayStudentInfo();
                    break;

                case 2:

                    analyzer.DisplayTotalScores();
                    break;

                case 3:

                    analyzer.DisplayPercentages();
                    break;

                case 4:

                    System.out.print("Enter the number of top students to display: ");
                    int numTopStudents = scanner.nextInt();

                    analyzer.DisplayTopStudents(numTopStudents);

                    break;

                case 5:

                    System.out.println("Exiting...");
                    System.exit(0);

                default:

                    System.out.println("Invalid choice. Please try again.");

            }

            System.out.println();

        }
    }
    public StudentAnalyzer(int[] StudentIDs, String[] FirstNames, String[] LastNames, int[][] Scores) {

        StudentAnalyzer.StudentIDs = StudentIDs;
        StudentAnalyzer.FirstNames = FirstNames;
        StudentAnalyzer.LastNames = LastNames;
        StudentAnalyzer.Scores = Scores;

        TotalScores = new int[StudentIDs.length];
        Percentages = new double[StudentIDs.length];

        CalculateTotalScores();
        CalculatePercentages();

    }

    public void DisplayStudentInfo() {
        System.out.println("Student Information:");

        for (int i = 0; i < StudentIDs.length; i++) {
            System.out.printf("ID: %d, Name: %s %s, Total Score: %d, Percentage: %.2f%%\n",
                    StudentIDs[i], FirstNames[i], LastNames[i], TotalScores[i], Percentages[i]);
        }
    }

    private void CalculateTotalScores() {
        for (int i = 0; i < Scores[0].length; i++) {
            int sum = 0;

            for (int j = 0; j < Scores.length; j++) {
                sum += Scores[j][i];
            }

            TotalScores[i] = sum;
        }
    }

    public void DisplayTotalScores() {

        System.out.println("Total Scores:");

        for (int i = 0; i < StudentIDs.length; i++) {

            System.out.printf("ID: %d, Total Score: %d\n", StudentIDs[i], TotalScores[i]);

        }

    }

    private void CalculatePercentages() {
        int TotalSubjects = Scores.length;

        for (int i = 0; i < TotalScores.length; i++) {
            Percentages[i] = (double) TotalScores[i] / TotalSubjects;
        }
    }

    public void DisplayPercentages() {

        System.out.println("Percentages:");

        for (int i = 0; i < StudentIDs.length; i++) {

            System.out.printf("ID: %d, Percentage: %.2f%%\n", StudentIDs[i], Percentages[i]);

        }

    }

    public void DisplayTopStudents(int NumTopStudents) {

        // Create a copy of the StudentIDs array to store the indexes

        Integer[] indexes = new Integer[StudentIDs.length];

        for (int i = 0; i < StudentIDs.length; i++) {

            indexes[i] = i;

        }

        // Sort the indexes based on the total scores in descending order

        Arrays.sort(indexes, Comparator.comparingInt(i -> -TotalScores[i]));

        System.out.println("Top Students:");

        for (int i = 0; i < NumTopStudents && i < indexes.length; i++) {

            int index = indexes[i];
            System.out.printf("ID: %d, Name: %s %s, Total Score: %d, Percentage: %.2f%%\n", StudentIDs[index], FirstNames[index], LastNames[index], TotalScores[index], Percentages[index]);

        }

    }

}