package Project.Util;

import java.util.ArrayList;

import Project.Util.Operators;

public interface Tokenizer {

	public static ArrayList<String> tokenize(String exp) {

		// take a string.  If it is valid RPN stuff - integers or operators
		// - then put them in a list for processing.
		// anything bad (not int or one of the operators we like) and return a null.

		ArrayList<String> tokens = new ArrayList<>();
		
		String[] splitExp = exp.split(" ");

		for (String s : splitExp) {

			// we must check if the string is an integer or an operator

		}
		
		// YOU WRITE THIS!
		return null;

	}
	
}
