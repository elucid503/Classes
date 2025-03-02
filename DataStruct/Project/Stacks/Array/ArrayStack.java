package Project.Stacks.Array;

import java.util.ArrayList;

import Project.Stacks.Stack;
public class ArrayStack<T> implements Stack<T> {

	ArrayList<T> arr = new ArrayList<>();

	@Override
	public void push(T i) {

		if (this.arr.size() == 0) {

			this.arr.add(i); // empty, so we just add

		} else {

			this.arr.add(0, i); // arraylist makes it easy to insert at 0

		}

	}

	@Override
	public T pop() {

		if (this.arr.size() == 0) {

			return null; // empty

		} else {

			T item = this.arr.get(0); // we must store the first item
			this.arr.remove(0); // and then remove it

			return item;

		}

	}

	@Override
	public int size() {

		return this.arr.size();

	}

	@Override
	public void clear() {

		this.arr.clear();

	}

}
