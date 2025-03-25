package Classwork.Examples.Ex4;
public class TestHarness {
	
	private static yLinkedList l = new yLinkedList();
	
	public static void main(String args[]) {
		
		TEST_ADD();
		System.out.println("");
		TEST_DELETE();
	}

	
	public static void TEST_ADD() {
		
		l.add(32);
		l.add(105);
		l.add(35);
		l.add(39);
		l.add(34);
		l.display();
		System.out.println(" ");
		l.delete(35);

		System.out.println(" ");
		l.display();
		

	}
	
	public static void TEST_DELETE() {
		
		l.delete(39);
		l.display();
		
	}
	
	
}
