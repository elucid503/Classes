package Labs.Lab2;

public class LinkedList<T> implements List<T>{

	private Node<T> head;
	
	@Override
	public boolean add(T key) {

		if (head == null) {
			head = new Node<T>(key);
			return true;
		}

		Node<T> current = head;

		while (current.getNext() != null) {
			current = current.getNext();
		}

		current.setNext(new Node<T>(key));

		return true;
		
	}

	@Override
	public boolean delete(T key) {

		Node<T> current = head;

		if (current == null) {

			return false; // nothing to delete

		}

		if (current.getData().equals(key)) {

			// item found, forget the head and link to the next

			head = current.getNext();
			return true;

		}

		while (current.getNext() != null) {

			if (current.getNext().getData().equals(key)) {

				// item found, forget the next and link to the next of next

				current.setNext(current.getNext().getNext());
				return true;

			}

			current = current.getNext();
		}

		return false; // not found
		
	}

	@Override
	public void display() {
		
		Node<T> current = head;

		while (current != null) {
			
			System.out.println(current.getData().toString()); // should always call .toString since generic
			current = current.getNext();

		}

		return;
	}
	 
}
