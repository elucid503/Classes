package Homework.HW4;

public class QueueArray<T> implements Queue<T> {

	private int front;
	private int rear;

	private int MAX_SIZE = 100;
	private T[] data;
	private int numElements = 0;

	public QueueArray() {

		data = (T[]) new Object[MAX_SIZE];

		front = 0;
		rear  = 0;
		
	}
	
	public boolean empty() {

		return this.numElements == 0;

	}

	public boolean full() {

		return this.numElements == this.MAX_SIZE;
		
	}

	public boolean enqueue(T el) {

		if (this.full()) {
			return false;
		}

		if (this.empty()) {

			this.data[0] = el;

			this.front = 0;
			this.rear = 0;

			this.numElements++;

			return true;

		}
		
		this.rear = this.bump(rear);

		this.data[this.rear] = el;

		this.numElements++;

		return true;
		
	}

	public T dequeue() {

		if (this.empty()) {

			return null;

		}

		T toRemove = this.data[this.front];

		if (this.numElements == 1) {

			this.front = -1;
			this.rear = -1;

			this.numElements--;

		} else {

			this.front = this.bump(this.front);

			this.numElements--;

		}
		
	 	return toRemove;
		
	}

	public void display() {

		if (this.empty())
			System.out.println("[ ]");

		else if (this.numElements == 1) {

			System.out.printf("[%s]%n", this.data[this.front]);
		}
		
		else if (this.front == this.rear) {

			System.out.printf("[%s]%n", this.data[this.front]);

		}
		
		else {

			System.out.print("[ ");

			int i = this.front;

			while (true) {

				System.out.print(this.data[i] + " ");

				if (i == this.rear)
					break;

				i++;

				if (this.numElements == 0)
					break;

			}

			System.out.print("] ");
			System.out.println(" ");

		}

	}

	private int bump(int index) {

		return (index + 1) % data.length;

	}

}