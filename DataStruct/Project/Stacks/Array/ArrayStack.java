package Project.Stacks.Array;

import java.util.ArrayList;

import Project.Stacks.Stack;

public class ArrayStack implements Stack {

	ArrayList<Integer> arr = new ArrayList<>();

	@Override
	public void push(Integer i) {

		if (arr.size() == 0) {

			arr.add(i); // empty, so we just add

		} else {

			arr.add(0, i); // arraylist makes it easy to insert at 0

		}

	}

	@Override
	public Integer pop() {

		if (arr.size() == 0) {

			return null; // empty

		} else {

			Integer item = arr.get(0); // we must store the first item
			arr.remove(0); // and then remove it

			return item;

		}

	}

	@Override
	public Integer size() {

		return arr.size();

	}

}
