package Examples.Ex4;
public class yLinkedList {
	Node head;

	public void add(int data) {
		
		//if head == null, nothing in the list
		//create a new node with the data
		//set that to head
		// return

		if(head == null) {
			head = new Node(data);
			return;
		}
		
		//else
		//set head to local Node current
		//step thru each element in the list, checking if the .next of this node is null
		//once found, create a new node out of incoming data & set that to current.next
		
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
		
		
	}

	public void delete(int data) {
		//if head == null, nothing in the list, return
		if(head == null)
			return;

		//if head.data == incoming data
		// set head = the node head points to.  return.
		
		//else
		//create a new local node with the head
		//step thru each element in the list.  if the next is non null
		//check if that data == the data we want to delete
		//if yes, this is the element to delete.  
		//do that by setting current.next = current.next.next
		//else, set current to the next element in the list
		
		Node current = head;
		while(current.next != null) {
			if(current.next.data == data)
				current.next = current.next.next;
			else
				current = current.next;
		}
		
	}
	
	public void display() {
		Node tmp = head;
		while (tmp != null) {
			
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
	}
	
}
