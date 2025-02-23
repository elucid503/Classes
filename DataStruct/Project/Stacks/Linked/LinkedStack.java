package Project.Stacks.Linked;

import Project.Stacks.Stack;

public class LinkedStack<T> implements Stack<T> {
		
	private StackNode<T> top = null;
	private int size = 0;
	
	@Override
	public void push(T i) {

		// creating a new node first
		
		StackNode<T> node = new StackNode<>();
		node.setItem(i);

		// if the stack is empty, set the top to the new node

		if (top == null) {

			top = node;

		} else {

			// otherwise, add to top, reassigning the top

			node.setNext(top);
			top = node;

		}

		size += 1; // increment size

	}

	@Override
	public T pop() {

		// get rid of the top and return it

		if (top == null) {

			return null; // empty

		} else {

			T item = top.getItem();
			top = top.getNext();

			size -= 1; // decrement size

			return item;

		}

	}

	@Override
	public int size() {

		return size;

	}

	@Override
	public void clear() {

		top = null;
		size = 0;

	}

}
