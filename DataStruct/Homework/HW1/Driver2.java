package Homework.HW1;

import java.io.*;
import java.util.*;

public class Driver2 {
	
	private static Student2 [] students = new Student2[100];
	private static Scanner inputScanner = new Scanner(System.in);

	public static void main(String[] argv) throws FileNotFoundException {
		
		FileReader file = new FileReader("students.txt");		
		Scanner fileScanner = new Scanner(file);
				
		int i = 0;

		while (fileScanner.hasNextLine()) {
			
			String l1 = fileScanner.nextLine();
			String l2 = fileScanner.nextLine();
			String l3 = fileScanner.nextLine();
			int sem = fileScanner.nextInt();
			fileScanner.nextLine();
		
			students[i++] = new Student2(l1, l2, l3, sem);	
		}
	
		runMenu();
		
		System.out.printf("Program Finished");

		fileScanner.close();
		
	}
	
	public static void runMenu() {

		do {
		
			menu();

			String input = inputScanner.nextLine();
			int choice = Integer.parseInt(input);
			System.out.printf("%n");

			switch (choice) {

				case 1:
					displayAll();
					break;
				case 2:
					displayIndex();
					break;
				case 3:
					displayName();
					break;
				case 4:
					displaySemester();
					break;
				case 5:
					addStudent();
					break;
				case 6:
					return;

			}
			
			try {

				Thread.currentThread().sleep(2000);

			}
			
			catch (InterruptedException ie) { }
		
		} while (true);
		
	}
	
	public static void menu() {

		System.out.printf("Choose an Option%n");
		System.out.printf("1 - Display All%n");
		System.out.printf("2 - Display by Index%n");
		System.out.printf("3 - Display Name%n");
		System.out.printf("4 - Display By Semester%n");
		System.out.printf("5 - Add A Student%n");
		System.out.printf("6 - Quit%n");

	}
	
	public static String getInput(String prompt) {

		System.out.print(prompt + ": ");
		return inputScanner.nextLine();

	}

	public static String pluralize(int number, String word) {

		// not sure if java has single-line ternary stuff, but this does fine

		if (number == 1) { return word; }
		else { return word + "s"; }

	}
	
	public static void displayAll() {

	    int i = 0;
		int count = 0; // will explicitly count the number of students displayed
		
		while (students[i] != null) {
			
	        System.out.printf("%s%n%s%n", students[i++], "-------------------");
			count++;
			
	    }
	    System.out.printf("%d %s Displayed.\n", count, pluralize(count, "Student"));
	}

	public static void displayIndex() {

		String index = getInput("Enter the Index");

		int choice = Integer.parseInt(index);
		
		System.out.printf("%s%n%s%n", students[choice], "-------------------");
		System.out.printf("1 Student Displayed.\n"); // always one student here, so i hardcoded it
		
	}
	
	
	public static void displayName() {

		String name = getInput("Enter the Name");

		int i = 0;
		int count = 0;

		while (students[i] != null) {

			if (students[i].getName().toLowerCase().indexOf(name.toLowerCase()) != -1) {

				System.out.printf("%s%n%s%n", students[i], "-------------------");
				count++;

			}

			i++;

		}
		System.out.printf("%d %s Displayed.\n", count, pluralize(count, "Student"));

	}
	
	public static void displaySemester() {

		String sem = getInput("Enter the Semester");

		int i = 0;
		int count = 0;

		while (students[i] != null) {

			if (students[i].getSem() == Integer.parseInt(sem)) {

				System.out.printf("%s\n%s\n", students[i], "-------------------");
				count++;

			}

			i++;

		}
		System.out.printf("%d %s Displayed.\n", count, pluralize(count, "Student"));

	}

	public static void addStudent() {

		String name = getInput("Enter Full Student Name");
		String status = getInput("Enter Year (Freshman, Sophomore, Junior, Senior)");
		String major = getInput("Enter the Major (CPSC, ENG, MATH, PSYCH)");
		String sem = getInput("Enter the Semester (1,2,3,4,5,6,7,8)");

		int i = 0;

		while (students[i] != null) { i++; } // this gets the first null index available

		students[i] = new Student2(name, status, major, Integer.parseInt(sem));

		// extra addition: write to file as well. can add this to a method if needed elsewhere

		try {

			FileWriter file = new FileWriter("students.txt", true);
			PrintWriter out = new PrintWriter(file);

			// since out is the stream for the file, we can use printf here since it is also a PrintStream
			out.printf("%s\n%s\n%s\n%s\n", name, status, major, sem);

			out.close();

		}

		catch (IOException e) {

			System.out.printf("Error Writing to File\n"); // this, however, will print to the console

		}

		System.out.printf("Student Added.\n");

	}
	
}
