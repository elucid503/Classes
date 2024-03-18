// Importing std libraries

import java.io.File;
import java.util.Scanner;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.Arrays;

class FilePathUtil { // Useful for preventing frustration
	public static String GetAbsolutePath(String relativePath) {

		Path path = Paths.get(relativePath);
		return path.toAbsolutePath().toString();

	}
}

public class ReadStudents {
	private static final int MAX_STUDENTS = 200;

	private static final int[] StudentIDs = new int[MAX_STUDENTS];
	private static final String[] FirstNames = new String[MAX_STUDENTS];
	private static final String[] LastNames = new String[MAX_STUDENTS];
	private static final int[] ScienceScores = new int[MAX_STUDENTS];
	private static final int[] HistoryScores = new int[MAX_STUDENTS];
	private static final int[] MathematicsScores = new int[MAX_STUDENTS];
	private static final int[] EnglishScores = new int[MAX_STUDENTS];
	private static int NumOfStudents = 0;

	// Initialize the arrays with the data from the file
	public static void LoadData() {

		try (Scanner scanner = new Scanner(new File(FilePathUtil.GetAbsolutePath("Project/src/Data.csv")))) {

			while (scanner.hasNextLine() && NumOfStudents < MAX_STUDENTS) {

				String Line = scanner.nextLine();
				String[] Fields = Line.split(",");

				if (Fields.length == 7) {

					// Set data

					StudentIDs[NumOfStudents] = Integer.parseInt(Fields[0]);
					FirstNames[NumOfStudents] = Fields[1];
					LastNames[NumOfStudents] = Fields[2];
					ScienceScores[NumOfStudents] = Integer.parseInt(Fields[3]);
					HistoryScores[NumOfStudents] = Integer.parseInt(Fields[4]);
					MathematicsScores[NumOfStudents] = Integer.parseInt(Fields[5]);
					EnglishScores[NumOfStudents] = Integer.parseInt(Fields[6]);

					NumOfStudents++;

				}

			}

		} catch (Exception e) {

			System.out.println("Error reading the file: " + e.getMessage());

		}

	}

	// Return shallow copies of the arrays

	public static int[] GetStudentIDs() {

		return Arrays.copyOf(StudentIDs, NumOfStudents);

	}

	public static String[] GetFirstNames() {

		return Arrays.copyOf(FirstNames, NumOfStudents);

	}

	public static String[] GetLastNames() {

		return Arrays.copyOf(LastNames, NumOfStudents);

	}

	public static int[] GetScienceScores() {

		return Arrays.copyOf(ScienceScores, NumOfStudents);
	}

	public static int[] GetHistoryScores() {

		return Arrays.copyOf(HistoryScores, NumOfStudents);

	}

	public static int[] GetMathematicsScores() {

		return Arrays.copyOf(MathematicsScores, NumOfStudents);

	}

	public static int[] GetEnglishScores() {

		return Arrays.copyOf(EnglishScores, NumOfStudents);

	}

}