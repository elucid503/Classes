package linkedQueue;
public class TestQueue {

	public static void main(String[] args) {

		Queue<Integer> q = new QueueRef<>();

		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(8);
		q.enqueue(0);
		q.enqueue(2);
		q.enqueue(9);

		q.display();

		while (!q.empty()) {
			q.dequeue();
			q.display();
		}
		System.out.printf("%n");

		for (int i = 2; i < 23; i += 2)
			q.enqueue(i);

		q.display();

		while (!q.empty()) {
			q.dequeue();
			q.display();
		}

		System.out.printf("%n");

		for (int i = 21; i < 60; i += 2) {
			q.enqueue(i);

			try {
				Thread.currentThread().sleep(125);
			} catch (InterruptedException ie) {
			}

			q.display();
		}

		String[] tokens = { "hello", "bye", "green", "house", "desk", "freedom", "element", "automobile" };

		// Queue<String> qs = new QueueArray<>();
		Queue<String> qs = new QueueRef<>();

		qs.display();

		for (String str : tokens) {
			qs.enqueue(str);
			qs.display();
			try {
				Thread.currentThread().sleep(125);
			} catch (InterruptedException ie) {
			}
		}

		System.out.println();

		while (!qs.empty()) {
			qs.dequeue();
			qs.display();
			try {
				Thread.currentThread().sleep(125);
			} catch (InterruptedException ie) {
			}
		}
	} // main
	
	
	
	
	

}
