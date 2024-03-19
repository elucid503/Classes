import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentAnalyzer {

    // Constants

    private static final String[] Subjects = new String[] { "Science", "History", "Mathematics", "English" };

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
            System.out.println("5. Display pass/fail count");
            System.out.println("6. Display failed students per subject");
            System.out.println("7. Display pass percentage per subject");
            System.out.println("8. Display students failed in more than 2 subjects");
            System.out.println("9. Exit");

            int choice;

            try {

                choice = scanner.nextInt();

            }

            catch (Exception e) {

                System.out.println("Invalid choice. Please try again.");
                scanner.nextLine();
                continue;

            }

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

                    System.out.print("Enter the pass percentage: ");
                    int PassPercentage = scanner.nextInt(); // This will be redefined in other scopes (OK, but not best practice)

                    analyzer.DisplayPassFailCount(PassPercentage);

                    break;

                case 6:

                    System.out.print("Enter the pass percentage: ");
                    PassPercentage = scanner.nextInt();

                    analyzer.DisplayFailedStudentsPerSubject(PassPercentage);
                    break;

                case 7:

                    System.out.print("Enter the pass percentage: ");
                    PassPercentage = scanner.nextInt();

                    analyzer.DisplayPassPercentagePerSubject(PassPercentage);
                    break;

                case 8:

                    System.out.print("Enter the pass percentage: ");
                    PassPercentage = scanner.nextInt();

                    analyzer.DisplayStudentsFailedInMoreThanTwoSubjects(PassPercentage);
                    break;

                case 9:

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

            System.out.printf("ID: %d, Name: %s %s, Total Score: %d, Percentage: %.2f%%\n", StudentIDs[i], FirstNames[i], LastNames[i], TotalScores[i], Percentages[i]);

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

        for (int i = 0; i < StudentIDs.length; i++) { // Could also use an enhanced for loop, I prefer the implicit index

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

    private boolean[][] CalculatePassFailStatus(int passPercentage) {

        boolean[][] passFailStatus = new boolean[Scores.length][StudentIDs.length];

        for (int i = 0; i < Scores.length; i++) {

            for (int j = 0; j < StudentIDs.length; j++) {

                passFailStatus[i][j] = Scores[i][j] >= passPercentage;

            }

        }

        return passFailStatus;

    }

    public void DisplayPassFailCount(int passPercentage) {

        boolean[][] PassFailStatus = CalculatePassFailStatus(passPercentage);

        int[] PassCount = new int[Scores.length];
        int[] FailCount = new int[Scores.length];

        for (int i = 0; i < Scores.length; i++) {

            for (int j = 0; j < StudentIDs.length; j++) {

                if (PassFailStatus[i][j]) {

                    PassCount[i]++;

                } else {

                    FailCount[i]++;

                }

            }

        }


        System.out.println("Pass/Fail Count:");

        for (int i = 0; i < Scores.length; i++) {

            System.out.printf("%s - Passed: %d, Failed: %d\n", Subjects[i], PassCount[i], FailCount[i]);

        }

    }

    public void DisplayFailedStudentsPerSubject(int PassPercentage) {

        // Calculate how many students failed in each subject

        boolean[][] PassFailStatus = CalculatePassFailStatus(PassPercentage);

        int[] FailCount = new int[Scores.length];

        for (int i = 0; i < Scores.length; i++) {

            for (int j = 0; j < StudentIDs.length; j++) {

                if (!PassFailStatus[i][j]) {

                    FailCount[i]++;

                }

            }

        }

        System.out.println("Number of Failed Students per Subject:");

        for (int i = 0; i < Scores.length; i++) {

            System.out.printf("%s - Failed: %d\n", Subjects[i], FailCount[i]);

        }

    }

    public void DisplayPassPercentagePerSubject(int PassPercentage) {

        // Calculate the % of students who passed in each subject

        boolean[][] PassFailStatus = CalculatePassFailStatus(PassPercentage);

        double[] passPercentages = new double[Scores.length];

        for (int i = 0; i < Scores.length; i++) {

            int PassCount = 0;

            for (int j = 0; j < StudentIDs.length; j++) {

                if (PassFailStatus[i][j]) {

                    PassCount++;

                }

            }

            passPercentages[i] = (double) PassCount / StudentIDs.length * 100;

        }

        System.out.println("Pass Percentage per Subject:");

        for (int i = 0; i < Scores.length; i++) {

            System.out.printf("%s - Pass Percentage: %.2f%%\n", Subjects[i], passPercentages[i]);

        }

    }

    public void DisplayStudentsFailedInMoreThanTwoSubjects(int PassPercentage) {

        // Calculate how many students failed in more than 2 subjects

        boolean[][] PassFailStatus = CalculatePassFailStatus(PassPercentage);

        int Count = 0;

        for (int j = 0; j < StudentIDs.length; j++) {

            int FailCount = 0;

            for (int i = 0; i < Scores.length; i++) {

                if (!PassFailStatus[i][j]) {

                    FailCount++;

                }

            }

            if (FailCount > 2) {

                Count++;

            }

        }

        System.out.printf("Number of Students Failed in More Than 2 Subjects: %d\n", Count);

    }

}