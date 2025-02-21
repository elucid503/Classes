package cQueue;
public class TestQueue {

	public static void main(String[] args) {

		CQueue q = new CQueue();

		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(8);
		q.enQueue(0);
		q.enQueue(2);
		//full already
		q.enQueue(9);

		q.display();

		// rear index get's bumped fwd each dequeue
		while (!q.isEmpty()) {
			q.deQueue();
			q.display();
		}
		System.out.printf("%n");

		//empty queue / rear index 4
		for (int i = 2; i < 10; i += 2) {
			q.enQueue(i);
			q.display();
		}

		q.display();
		q.deQueue();
		q.display();
		q.deQueue();
		q.enQueue(99);
		q.enQueue(999);
		q.display();
		
  
	/*	String[] tokens = { "hello", "bye", "green", "house", "desk", "freedom", "element", "automobile" };

		// Queue<String> qs = new QueueArray<>();
		Queue<String> qs = new QueueArray<>();

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
	*/} // main
	
	
	
	
	

}
