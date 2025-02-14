package Homework.HW2;

public class ListImpl<T extends Comparable<T>> implements List<T> {

	private ListNode<T> head;

	public ListImpl() {

		head = null;

	}

	// insert adds a node into the list in key order using the prev method

	public boolean insert(T key) {

		ListNode<T> prev = search(key);

		if (prev == null) {

			// nothing, so we insert at the head

			head = new ListNode<T>(key, head);
			return true;

		} else {

			// insert after prev (last node less than key)

			ListNode<T> newNode = new ListNode<T>(key, prev.getNext());
			prev.setNext(newNode);
			return true;

		}
		
	}

	// Search is looking for value key in the list
	// It will return the pointer to the previous node where key is (or should be)
	// or null if key is or should be in the first node

	private ListNode<T> search(T key) {

		ListNode<T> prev = null, curr = head;
		boolean done = false;

		while (curr != null && !done) {

			if (curr.getData().compareTo(key) < 0) { // in ascending order

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

		if (prev != null) {

			ListNode<T> current = prev.getNext();

			// if current is not null and equals key, remove it

			if (current != null && current.getData().equals(key)) {

				prev.setNext(current.getNext());
				return true;

			} else {

				// key not found

				return false;

			}

		} else {

			// we will remove the head if it equals, if not, fail

			if (head != null && head.getData().equals(key)) {

				head = head.getNext();
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