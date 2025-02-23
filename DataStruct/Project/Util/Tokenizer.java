package Project.Util;

import java.util.ArrayList;
import java.util.List;


public interface Tokenizer {

	public static List<String> tokenize(String exp) {

		List<String> tokens = new ArrayList<String>();
		String[] split = exp.split(" ");

		for (int i = 0; i < split.length; i++) {

			tokens.add(split[i]);

		}

		return tokens;

	}
		
}
