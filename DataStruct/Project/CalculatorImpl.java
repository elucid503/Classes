package Project;

import java.util.List;

import Project.Stacks.Stack;

import Project.Util.Tokenizer;
import Project.Util.Operators;

public class CalculatorImpl implements Calculator {

    Stack<Number> stack = null;

	public CalculatorImpl(Stack<Number> s) {
		
		stack = s;
		
    }

    @Override
	public Number calculate(String inputString, int precision) throws Exception {

		// First, clear the stack of any previous calculations

		this.stack.clear(); // I went ahead and added this method to Stack
        
		List<String> tokens = Tokenizer.tokenize(inputString); // get token representation of input string

		for (String token : tokens) {

			if (Operators.getOperator(token) != null) {

				// operator, so do a calculation

				if (this.stack.size() < 2) {

					// not enough operands

					throw new Exception("Underflow: " + inputString);

				}

				Number b = this.stack.pop(); // generally important to pull b first for correct order of operations
				Number a = this.stack.pop();
				
				Number result = performCalculation(a, b, Operators.getOperator(token));

				this.stack.push(result);

			} else {

				// not an operator, so try to push an operand
				// if fails, invalid token

				try {

					this.stack.push(Float.parseFloat(token));

				} catch (NumberFormatException e) {

					throw new Exception("Bad token: " + token);

				}

			}

		}
		
		if (this.stack.size() == 1) {

			// Round and return 

			Float floatResult = this.stack.pop().floatValue();
			
			return Math.round(floatResult * Math.pow(10, precision)) / Math.pow(10, precision);

		} else {

			// leftover tokens

			throw new Exception("Overflow: " + inputString);

		}
				
    }

	private Number performCalculation(Number a, Number b, Operators operator) throws Exception {

		// pretty standard logic here

		switch (operator) {

			case Add:

				return a.floatValue() + b.floatValue();

			case Subtract:

				return a.floatValue() - b.floatValue();

			case Multiply:

				return a.floatValue() * b.floatValue();

			case Divide:

				if (b.floatValue() == 0) {

					throw new Exception("Division by zero");

				}

				return a.floatValue() / b.floatValue();

			default:

				// no op
				return 0;

		}

	}
	
}