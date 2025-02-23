package Project;

import java.util.List;
import Project.Stacks.Stack;
import Project.Util.Tokenizer;
import Project.Util.Operators;

public class CalculatorImpl implements Calculator {

    Stack<Integer> stack = null;

	public CalculatorImpl(Stack<Integer> s) {
		
		stack = s;
		
    }

    @Override
	public String calculate(String inputString) throws Exception {

		// First, clear the stack of any previous calculations

		stack.clear(); // I went ahead and added this method to the Stack interface. they both now implement it
        
		List<String> tokens = Tokenizer.tokenize(inputString);

		for (String token : tokens) {

			if (Operators.getOperator(token) != null) {

				if (stack.size() < 2) {

					throw new Exception("Underflow: " + inputString);

				}

				int b = stack.pop();
				int a = stack.pop();

				int result = performCalculation(a, b, Operators.getOperator(token));

				stack.push(result);

			} else {

				try {

					stack.push(Integer.parseInt(token));

				} catch (NumberFormatException e) {

					throw new Exception("Bad token: " + token);

				}

			}

		}
		
		if (stack.size() == 1) {

			return Integer.toString(stack.pop());

		} else {

			throw new Exception("Overflow: " + inputString);

		}
				
    }

	private int performCalculation(int a, int b, Operators operator) throws Exception {

		switch (operator) {

			case Add:

				return a + b;

			case Subtract:

				return a - b; 

			case Multiply:

				return a * b;


			case Divide:

				if (b == 0) {

					throw new Exception("Division by zero");

				}

				return a / b;

			default:

				return 0; // Consider throwing an exception for unsupported operators

		}

	}
	
}