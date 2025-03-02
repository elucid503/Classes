package Project.Stacks.Linked;

public class StackNode<T> {

	private T item;
	private StackNode<T> next;
	
	public T getItem() {

		return this.item;

	}
	
	public StackNode<T> getNext() {

		return this.next;

	}
	
	public void setItem(T i) {
		
		this.item = i;

	}
	
	public void setNext(StackNode<T> node) {
		
		this.next = node;
		
	}

}
