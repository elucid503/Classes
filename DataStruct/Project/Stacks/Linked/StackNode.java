package Project.Stacks.Linked;

public class StackNode<T> {

	private T item;
	private StackNode<T> next;
	
	public T getItem() {

		return item;

	}
	
	public StackNode<T> getNext() {

		return next;

	}
	
	public void setItem(T i) {
		
		item = i;

	}
	
	public void setNext(StackNode<T> node) {
		
		next = node;
		
	}

}
