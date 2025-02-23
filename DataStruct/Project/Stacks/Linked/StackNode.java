package Project.Stacks.Linked;

public class StackNode {

	private Integer item;
	private StackNode next;
	
	public Integer getItem() {

		return item;

	}
	
	public StackNode getNext() {

		return next;

	}
	
	public void setItem(Integer i) {
		
		item = i;

	}
	
	public void setNext(StackNode node) {
		
		next = node;
		
	}

}
