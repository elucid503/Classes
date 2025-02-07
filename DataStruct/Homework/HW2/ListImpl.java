package Homework.HW2;

public class ListImpl<T extends Comparable<T>> implements List<T> {

	private ListNode<T> head;

	public ListImpl() {

		head = null;

	}

	// insert adds a node into the list in key order

	public boolean insert(T key) {

		if (head == null) {
			
			head = new ListNode<T>(key, null);
			return true;

		}

		ListNode<T> prev = search(key);

		if (prev != null) {
		
			ListNode<T> next = prev.getNext();
			ListNode<T> newNode = new ListNode<T>(key, next);

			prev.setNext(newNode);

		} else {

			// we assume that head must be null here

			ListNode<T> newNode = new ListNode<T>(key, head);
			head = newNode;

		}

		return true; 

	}

	// Search is looking for value Key in the list
	// It will return the pointer to the previous node where key is (or should be)
	// or null if key is or should be in the first node

	private ListNode<T> search(T key) {

		ListNode<T> prev = null, curr = head;
		boolean done = false;

		while (curr != null && !done) {

			if (curr.getData().compareTo(key) < 0) {

				prev = curr;
				curr = curr.getNext();

			} else {

				done = true;

			}

		}

		return prev; 

	}

	public boolean remove(T key) {

		ListNode<T> prev = search(key);

		if (prev == null) {

			// we can assume that head is null

			if (head != null && head.getData().equals(key)) {

				head = head.getNext();
				return true;

			} else {

				return false;

			}

		} else {

			ListNode<T> curr = prev.getNext();

			if (curr != null && curr.getData().equals(key)) {

				prev.setNext(curr.getNext());
				return true;

			} else {

				return false;

			}

		}
		

	}

	// prints the list content in [ ]'s separated by commas

	public void display() {

		ListNode<T> current = head;

		if (current == null) {
			System.out.print("[]\n");
			return;
		}

		System.out.print("["); // Start the "list"

		while (current != null) {

			System.out.print(current.getData().toString()); // should always call .toString since generic

			current = current.getNext();

			if (current != null) {

				// If next, add a , to the "list"
				System.out.print(", ");

			}

		}

		System.out.print("]\n"); // Ending the "list"

	}
	
} 