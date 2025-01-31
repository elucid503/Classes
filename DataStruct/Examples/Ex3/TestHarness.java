package Examples.Ex3;

public class TestHarness {

	public static void main(String[] args) {

		SelSortBinSearch SelSortBinSearch = new SelSortBinSearch();
		SelSortBinSearch.initValues();
		SelSortBinSearch.printValues();
		System.out.println("values is sorted: " + SelSortBinSearch.isSorted());
		System.out.println();

		TEST_SelectionSort(SelSortBinSearch);
		TEST_BinarySearch(SelSortBinSearch);
	}

	public static void TEST_SelectionSort(SelSortBinSearch tester) {

		tester.selectionSort();
		tester.printValues();
		System.out.println("values is sorted: " + tester.isSorted());
		System.out.println();
	}

	public static void TEST_BinarySearch(SelSortBinSearch tester) {
		System.out.println("Binary Search:");
		System.out.println("0 is in array: " + tester.binarySearch(0, 0, SelSortBinSearch.SIZE - 1));
		System.out.println("1 is in array: " + tester.binarySearch(1, 0, SelSortBinSearch.SIZE - 1));

		for (int i = (SelSortBinSearch.SIZE / 2 - 2); i <= (SelSortBinSearch.SIZE / 2 + 2); i++)
			System.out.println(i + " is in array: " + tester.binarySearch(i, 0, SelSortBinSearch.SIZE - 1));

		System.out.println(SelSortBinSearch.SIZE - 1 + " is in array: "
				+ tester.binarySearch(SelSortBinSearch.SIZE - 1, 0, SelSortBinSearch.SIZE - 1));
		System.out.println(SelSortBinSearch.SIZE + " is in array: "
				+ tester.binarySearch(SelSortBinSearch.SIZE, 0, SelSortBinSearch.SIZE - 1));
		System.out.println();

	}

}
