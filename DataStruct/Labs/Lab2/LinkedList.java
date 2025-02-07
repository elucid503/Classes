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

		if (head == null) {
			return false;
		}

		if (head.getData() == key) {
			head = head.getNext();
			return true;
		}

		Node<T> current = head;

		while (current.getNext() != null) {

			if (current.getNext().getData() == key) {
				// Skip the next node

				current.setNext(current.getNext().getNext());
				return true;

			}
			
			current = current.getNext();

		}

		//if head == null, nothing in the list, return
		 
		//if head.data == incoming data
		// set head = the node head points to.  return.
				
		//else
		//create a new local node with the head
		//step thru each element in the list.  if the next is non null
		//check if that data == the data we want to delete
		//if yes, this is the element to delete.  
		//do that by setting current.next = current.next.next
		//else, set current to the next element in the list
		
		//remove this
		return false;
	}

	@Override
	public void display() {
		
		Node<T> current = head;

		while(current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}

		return;
	}
	 
}
