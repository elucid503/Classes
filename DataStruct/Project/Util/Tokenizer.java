package Project.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Project.Util.Operators;

public interface Tokenizer {

	public static Map<ArrayList<String>> tokenize(String exp) {

		// takes in an expression and parses operators and numbers

		ArrayList<String> tokens = new ArrayList<>();
		
		String[] splitExp = exp.split(" ");

		for (String s : splitExp) {

			Operators op = Operators.getOperator(s);

			if (op != null) {

				tokens.add(s);

			} else {

				try {

					// might be a number

					Integer.parseInt(s); // just here to fail if not a number 
					tokens.add(s);

				} catch (NumberFormatException e) {

					return null; // invalid input

				}

			}
			
		}
		
		return {};

	}
	
}
