package Examples.Ex3;

import java.util.Random;
import java.text.DecimalFormat;

public class SelSortBinSearch {
	 static int SIZE = 100; // size of array to be searched
	 int[] values = new int[SIZE]; // values to be sorted

	 void initValues()
	// Initializes the values array with random integers from 0 to SIZE.
	{
		Random rand = new Random();
		for (int index = 0; index < SIZE; index++)
			values[index] = Math.abs(rand.nextInt()) % SIZE;
	}

	 public boolean isSorted()
	// Returns true if the array values are sorted and false otherwise.
	{
		boolean sorted = true;
		for (int index = 0; index < (SIZE - 1); index++)
			if (values[index] > values[index + 1])
				sorted = false;
		return sorted;
	}

	 public void swap(int index1, int index2)
	// Precondition: index1 and index2 are >= 0 and < SIZE.
	//
	// Swaps the integers at locations index1 and index2 of the values array.
	{
		int temp = values[index1];
		values[index1] = values[index2];
		values[index2] = temp;
	}

	 public void printValues()
	// Prints all the values integers.
	{
		int value;
		DecimalFormat fmt = new DecimalFormat("000");
		System.out.println("The values array is:");
		for (int index = 0; index < SIZE; index++) {
			value = values[index];
			if (((index + 1) % 10) == 0)
				System.out.println(fmt.format(value));
			else
				System.out.print(fmt.format(value) + " ");
		}
		System.out.println();
	}

	/////////////////////////////////////////////////////////////////
	//
	// Selection Sort
	 
	void selectionSort() {

		int minIndex = 0; // index of smallest value in unsorted portion of array

		for (int unsortedIndex = 0; unsortedIndex < (SIZE - 1); unsortedIndex++) {

			// Loops through the unsorted portion of the array to find the smallest value

			minIndex = unsortedIndex; // Set the new minIndex to the NEW first index of the unsorted portion

			for (int nextUnsortedIndex = unsortedIndex + 1; nextUnsortedIndex < SIZE; nextUnsortedIndex++) {

				// Loop through the new unsorted portion of the array

				if (values[nextUnsortedIndex] < values[minIndex]) { minIndex = nextUnsortedIndex; } // New minIndex found
				
				swap(unsortedIndex, minIndex); // Swap the new minIndex with the first index of the unsorted portion
			
			}

		}
					
	}

	//
	// Selection Sort End
	/////////////////////////////////////////////////////////////////

	 
	 /*
	  * In the binary search method, the collection is repeatedly divided into half 
	  * and the key element is searched in the left or right half of the collection 
	  * depending on whether the key is less than or greater than the mid element of the collection.
	  */
	 
	boolean binarySearch(int target, int first, int last) {
	 
		int mid = (first + last) / 2;

		if (first >= last) {

			// The target is not found
			return false;

		} if (target < values[mid]) {

			// Search the left half
			return binarySearch(target, first, mid - 1);

		} else if (target > values[mid]) {

			// Search the right half
			return binarySearch(target, mid + 1, last);

		} else {

			// Found!
			return true;

		}
				
	}
	
}
