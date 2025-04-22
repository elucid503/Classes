package BusFare;

 
import Heap.MaxHeap; 

public class BusFareHandlerImpl implements BusFareHandler {

	private MaxHeap heap;

	BusFareHandlerImpl() {

		heap = new MaxHeap(10);
	}

	//think about this..    want a random assortment
	public void initChange() {

		heap.insert(5);
		heap.insert(100);
		heap.insert(25);
		heap.insert(50);
		heap.insert(1);
		heap.insert(10);
		heap.insert(2);   // yes we have a 2 cent coin

	}

	/**
	 * EXACT FARE ONLY!
	 * bus doesn't take pennies or dimes
	 */
	
	public int payBusFare(int sum) {

		//TODO - recursively come up with exactly 180 by fetching the 
		// next highest coin from your pocket ( maxheap )
		// note, some additional logic needed to handle no pennies or dimes.
	
		
		//TODO replace
		return -1;
	}

	public int getMaxFromHeap() {
		//TODO - retrieve and return the next value from your maxheap
		//TODO replace:
		return -1;
	}

	public void grabChange() {
		//TODO - kick off the processby loading the pile of coins into your MaxHeap
	}

}
