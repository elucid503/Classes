package Project2;

import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		
		TEST_STRING_INSERTS();
		
		TEST_INT_INSERTS();
		
		TEST_REMOVE_CASE_1_AND_3();
		
		TEST_REMOVE_CASE_2();
		
	}

	public static void TEST_STRING_INSERTS() {
		
		System.out.println("TEST_STRING_INSERTS\n");
		
		BST<String> tree = new BST<>();
		
		// insert some strings

		tree.insert("hello");
		tree.insert("stan");
		tree.insert("cat");
		tree.insert("dog");
		tree.insert("grass");
		tree.insert("tree");
		tree.insert("abacus");
		tree.insert("zebra");
		tree.insert("doggie");
		
		// visit all the tree nodes

		tree.inOrder();
		
		tree.insert("house");
		tree.insert("television");
		tree.insert("grass");
		
		// visit all the tree nodes		

		tree.inOrder();
		
		/* 	 Expected Output:
		 *  
		 * 	[ abacus cat dog doggie grass hello stan tree zebra ]
		 *	[ abacus cat dog doggie grass hello house stan television tree zebra ]
		 */
		
	}
	
	public static void TEST_INT_INSERTS() {
		
		System.out.println("TEST_INT_INSERTS\n");
		
		Random random = new Random();
		
		BST<Integer> tree2 = new BST<>();
			
		// insert 50 random ints from 0 to 99
		// there may be duplicates, but that's a nice test case too

		for (int i = 0; i < 50; i++) {

			tree2.insert(random.nextInt(100));

		}
		
		tree2.inOrder(); // visit all the tree nodes

		// Expected Output:
	 	// [ 0 1 2 5 8 9 10 16 17 18 21 22 28 37 39 41 45 46 47 48 50 51 52 53 61 65 66 69 73 75 78 79 80 84 86 93 94 97 99 ]

	}

	public static void TEST_REMOVE_CASE_1_AND_3() {
		
		System.out.println("TEST_REMOVE_CASE_1_AND_3\n");
		
		BST<Integer> tree3 = new BST<>();
		
		tree3.insert(4);
		tree3.insert(2);
		tree3.insert(6);
		tree3.insert(1);
		tree3.insert(3);
		tree3.insert(5);
		tree3.insert(7);
		
		tree3.inOrder();
		 
		tree3.remove(1);
		
		tree3.inOrder();

		tree3.remove(2);
		tree3.inOrder();

		tree3.remove(5);
		tree3.inOrder();

		tree3.remove(6);
		tree3.inOrder();
		
		
		/*  Expected Output:
		
			[ 1 2 3 4 5 6 7 ]
		
			[ 2 3 4 5 6 7 ]
		
			[ 3 4 5 6 7 ]
		
			[ 3 4 6 7 ]
		
			[ 3 4 7 ]
		*/
	
	}
	
	public static void TEST_REMOVE_CASE_2() {

		System.out.println("TEST_REMOVE_CASE_2\n");

		BST<Integer> tree4 = new BST<>();

		tree4.insert(4);
		tree4.insert(2);
		tree4.insert(6);
		tree4.insert(1);
		tree4.insert(3);
		tree4.insert(5);
		tree4.insert(7);

		tree4.inOrder();

		//try delete w/ 2 children: from left..

		tree4.remove(2);
		tree4.inOrder();

		//try delete w/ 2 children: from right..

		tree4.remove(6);
		tree4.inOrder();

	}

}