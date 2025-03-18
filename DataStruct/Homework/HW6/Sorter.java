package Homework.HW6;

public class Sorter {

	private int[] data;

	public Sorter() {

		this(null);

	}

	public Sorter(int[] data) {

		this.data = data;

	}

	public void setData(int[] data) {

		this.data = data;

	}

	// helper method which calls the recursive mergesort

	public void mergesort() {

		mergesort(0, data.length - 1);

	}

	public void merge(int f, int m, int l) {

		// allocate a temp array for the merge

		int[] temp = new int[l - f + 1];

		// create the indexes for both array halves

		int f1 = f, l1 = m, f2 = m + 1, l2 = l, i = 0;

		while ((f1 <= l1) && (f2 <= l2))

			if (data[f1] < data[f2])
				temp[i++] = data[f1++];
			else
				temp[i++] = data[f2++];

		while (f1 <= l1)
			temp[i++] = data[f1++];

		while (f2 <= l2)
			temp[i++] = data[f2++];

		i = 0;

		for (int j = f; j <= l; i++, j++)
			data[j] = temp[i];

	}

	// base case is to do nothing when the number of elements is 0 or 1
	// recursive case is when there are 2+ elements in indexes lo to hi

	private void mergesort(int lo, int hi) {

		if (lo < hi) {

			int pivot = (lo + hi) / 2; // getting the middle index

			mergesort(lo, pivot); // sorting the left half
			mergesort(pivot + 1, hi); // sorting the right half

			merge(lo, pivot, hi); // merging the two halves

		}
		
	}

	public void display() {

		System.out.print("[");

		for (int i = 0; i < data.length - 1; i++)
			System.out.print(data[i] + ",");

		System.out.println(data[data.length - 1] + "]");

	}

	void display(int n) {

		System.out.print("[");

		for (int i = 0; i < n; i++)
			System.out.print(data[i] + ",");

		System.out.print(" ... ");

		for (int i = data.length - 1 - n; i < data.length; i++)
			System.out.print(data[i] + ",");

		System.out.println(data[data.length - 1] + "]");
	}

	public void bubbleSort() {
		
		// for each loop, we compare adjacent elements and swap them if they are out of order
		// this process is repeated until the array is sorted (inefficient, but simple)

		for (int i = 0; i < data.length - 1; i++) {

			for (int j = 0; j < data.length - 1 - i; j++) {

				if (data[j] > data[j + 1]) { // element is greater than the next

					swap(j, j + 1);

				}

			}

		}

	}

	void swap(int m, int n) {
		
		int tempEl = data[m];

		data[m] = data[n];
		data[n] = tempEl;
		
	}

	public int binarySearch(int key) {

		int low = 0;
		int high = data.length - 1;

		while (low <= high) {

			int mid = (low + high) / 2; // getting the middle index

			if (data[mid] == key) {

				return mid; // done

			} else if (data[mid] < key) {

				low = mid + 1; // searching the right half

			} else {

				high = mid - 1; // searching the left half

			}

		}

		return -1; // not found

	}

}