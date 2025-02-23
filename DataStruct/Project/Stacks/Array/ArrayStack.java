package Project.Stacks.Array;

import java.util.ArrayList;

import Project.Stacks.Stack;

public class ArrayStack<T> implements Stack<T> {

	ArrayList<T> arr = new ArrayList<>();

	@Override
	public void push(T i) {

		if (arr.size() == 0) {

			arr.add(i); // empty, so we just add

		} else {

			arr.add(0, i); // arraylist makes it easy to insert at 0

		}

	}

	@Override
	public T pop() {

		if (arr.size() == 0) {

			return null; // empty

		} else {

			T item = arr.get(0); // we must store the first item
			arr.remove(0); // and then remove it

			return item;

		}

	}

	@Override
	public int size() {

		return arr.size();

	}

	@Override
	public void clear() {

		arr.clear();

	}

}
