// Generic Stack Reference Implementation
package linkedQueue;

public class QueueRef<T> implements Queue<T> {

	protected Node<T> front; // reference to the front of this queue
	protected Node<T> rear; // reference to the rear of this queue
	protected int numElements = 0; // number of elements in this queue

	public QueueRef() {
		front = null;
		rear = null;
	}

	public boolean enqueue(T element)
	// Adds element to the rear of this queue.
	{
		Node<T> newNode = new Node<T>(element, null);
		if (rear == null)
			front = newNode;
		else
			rear.next = newNode;
		rear = newNode;
		numElements++;
		return true;
	}

	public T dequeue()
	// Throws QueueUnderflowException if this queue is empty;
	// otherwise, removes front element from this queue and returns it.
	{
		if (empty()) {
			System.out.println("Dequeue attempted on empty queue.");
			return null;
		} else {
			T element;
			element = front.data;
			front = front.next;
			if (front == null)
				rear = null;
			numElements--;
			return element;
		}
	}

	public boolean empty()
	// Returns true if this queue is empty; otherwise, returns false.
	{
		return (front == null);
	}

	public boolean full()
	// Returns false - a linked queue is never full.
	{
		return false;
	}

	public int size()
	// Returns the number of elements in this queue.
	{
		return numElements;
	}

	public void display() {
		Node<T> tmp = front;
		/*
		 * while (tmp != null) { System.out.print(tmp.data);
		 * 
		 * System.out.println("-"); tmp = tmp.next; }
		 */

		int i;
		if (empty()) {
			System.out.println("Empty Queue");
		} else {
			// display the front of the queue
			System.out.println("\nFront index-> " + front.data);

			// display element of the queue
			System.out.println("Items -> ");

			while (tmp != null) {
				System.out.print(tmp.data);

				System.out.println("-");
				tmp = tmp.next;

				while (tmp != null) {
					System.out.print(tmp.data);
					System.out.print(" ");
					tmp = tmp.next;
				}

				// display the rear of the queue
				System.out.println("\nRear index-> " + rear.data);

			}
		}
	}
}
