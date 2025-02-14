package Project;

import java.util.ArrayList;

import Project.Stack.YourArrayListStack;
import Project.Stack.YourLinkedListStack;

public class RPNTester {

	public static void main(String[] args) {

		// don't change this method!

		System.out.println("Testing ArrayList version");
		
		YourRPNCalculator calc = new YourRPNCalculator(new YourArrayListStack());
		testRPNCalculator(calc);

		System.out.println("Testing LinkedList version");
		
		calc = new YourRPNCalculator(new YourLinkedListStack());
		testRPNCalculator(calc);

	}
	
	private static void testRPNCalculator(SimpleRPNCalculator calc) {

		ArrayList<String> testExpressions = new ArrayList<>();

		testExpressions.add("1 1 +"); // 2
		testExpressions.add("1 3 -"); // 2
		testExpressions.add("1 1 + 2 *"); // 4
		testExpressions.add("1 1 2 + *"); // 3
		testExpressions.add("1 1 + 2 2 * -"); // 2
		testExpressions.add("11 bv +"); // bad token
		testExpressions.add("2 3 + -"); // underflow on an operator
		testExpressions.add("2 3 + 4 5 -"); // leftover tokens

		// YOU SHOULD ADD MORE TEST CASES!
		
		for (String s : testExpressions) {

			System.out.println(calc.calculate(s));

		}
		
	}

}