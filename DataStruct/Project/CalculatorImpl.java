package Project;

import java.util.ArrayList;

import Project.Stacks.Stack;
import Project.Util.Tokenizer;

public class CalculatorImpl implements Calculator {

	// don't change these...
	
	Stack stack = null;
	
	public CalculatorImpl(Stack s) {

		stack = s;

	}

	@Override
	public String calculate(String inputString) {

		// this is probably helpful, but you can remove...

		ArrayList<String> tokens = Tokenizer.tokenize(inputString);
		
		// here's the calculator logic!

		return null;
		
	}

}
