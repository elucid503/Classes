package BusFare;
 
import Heap.MaxHeap; 

public class BusFareHandlerImpl implements BusFareHandler {

	private MaxHeap heap;

	BusFareHandlerImpl() {

		heap = new MaxHeap(10);

	}

	public void initChange() {

		heap.insert(5);
		heap.insert(100);
		heap.insert(25);
		heap.insert(50);
		heap.insert(1);
		heap.insert(10);
		heap.insert(2); // yes we have a 2 cent coin

	}

	/**
	 * EXACT FARE ONLY!
	 * bus doesn't take pennies or dimes
	*/
	public int payBusFare(int sum) {
	
		if (sum == 180) {

			return sum; // good

		}

		// no pennies or dimes

		if (sum == 1 || sum == 10) {

			return payBusFare(sum);

		}

		int paidWith = heap.extractMax();
		
		sum += paidWith;

		// we can't go overboard, so we will regress

		if (sum > 180) {

			return sum - heap.extractMax();

		}

		return payBusFare(sum); // do again

	}

	public int getMaxFromHeap() {

		return heap.extractMax();

	}

	public void grabChange() {

		this.initChange();

	}

}
