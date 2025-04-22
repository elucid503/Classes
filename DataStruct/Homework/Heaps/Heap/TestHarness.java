package Heap;

public class TestHarness {
	
	 public static void main(String...arg) {
	        
		System.out.println("The Max Heap is ");
		MaxHeap maxHeap = new MaxHeap(15);

		maxHeap.insert(53);
		maxHeap.insert(25);
		maxHeap.insert(41);
		maxHeap.insert(12);
		maxHeap.insert(6);
		maxHeap.insert(31);
		maxHeap.insert(7);         
		maxHeap.insert(17);         
		maxHeap.insert(77);         

		maxHeap.print();

		System.out.println("The max val is " + maxHeap.extractMax());
		System.out.println("The max val is " + maxHeap.extractMax());
		System.out.println("The max val is " + maxHeap.extractMax());
		System.out.println("The max val is " + maxHeap.extractMax());
		System.out.println("The max val is " + maxHeap.extractMax());
		System.out.println("The max val is " + maxHeap.extractMax());
		System.out.println("The max val is " + maxHeap.extractMax());
		System.out.println("The max val is " + maxHeap.extractMax());
		System.out.println("The max val is " + maxHeap.extractMax());
		
	}

}