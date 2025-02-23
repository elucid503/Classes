package Project;

import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;

import Project.Stacks.Stack;

import Project.Util.Tokenizer;
import Project.Util.Operators;

public class CalculatorImpl implements Calculator {

	Stack stack = null;
	
	public CalculatorImpl(Stack s) {

		stack = s;

	}

	@Override
	public String calculate(String inputString) throws Exception {

		ArrayList<String> tokens = Tokenizer.tokenize(inputString);
		
		for (String token : tokens) {
			
			// if token is a number, push it onto the stack
			// if token is an operator, pop two numbers from the stack, apply the operator, and push the result back onto the stack

			
			

			
		}
		
		

		return null;
		
	}

}
