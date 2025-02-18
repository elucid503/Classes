package Project.Stacks.Linked;

import Project.Stacks.Stack;

public class LinkedStack implements Stack {
		
	private StackNode top = null;
	private Integer size = 0;
	
	@Override
	public void push(Integer i) {

		// creating a new node first
		
		StackNode node = new StackNode();
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
	public Integer pop() {

		// get rid of the top and return it

		if (top == null) {

			return null; // empty

		} else {

			Integer item = top.getItem();
			top = top.getNext();

			size -= 1; // decrement size

			return item;

		}

	}

	@Override
	public Integer size() {

		return size;

	}

}
