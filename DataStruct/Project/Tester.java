package Project;

import java.util.ArrayList;

import Project.Stacks.Array.ArrayStack;
import Project.Stacks.Linked.LinkedStack;

public class Tester {

	public static void main(String[] args) {

		System.out.println("Testing ArrayList version");
		
		CalculatorImpl calc = new CalculatorImpl(new ArrayStack<Integer>());
		testRPNCalculator(calc);

		System.out.println("Testing LinkedList version");
		
		calc = new CalculatorImpl(new LinkedStack<Integer>());
		testRPNCalculator(calc);

	}
	
	private static void testRPNCalculator(Calculator calc) {

		ArrayList<String> testExpressions = new ArrayList<>();

		testExpressions.add("1 1 +"); // 2
		testExpressions.add("1 3 -"); // -2
		testExpressions.add("1 1 + 2 *"); // 4
		testExpressions.add("1 1 2 + *"); // 3
		testExpressions.add("1 1 + 2 2 * -"); // 2
		testExpressions.add("11 bv +"); // bad token
		testExpressions.add("2 3 + -"); // underflow on an operator
		testExpressions.add("2 3 + 4 5 -"); // leftover tokens
		
		// Division Test 

		testExpressions.add("1 1 /"); // 1
		testExpressions.add("1 2 /"); // 0
		testExpressions.add("1 0 /"); // divide by zero err
		

		for (String s : testExpressions) {

			try {
				
				System.out.println(calc.calculate(s));
				
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
				
			}
								
		}
		
	}

}