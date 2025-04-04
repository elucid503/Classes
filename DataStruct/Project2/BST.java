package Project2;
 
public class BST<T extends Comparable<T>> implements iBST<T> {

	private BSTNode<T> root;

	public BST() {

		root = null;

	}

	public void inOrder() {

		// public to wrap result of private function with [ ]

		System.out.print("[ ");
		inOrder(root);
		System.out.println("]");

		System.out.println();

	}

	private void inOrder(BSTNode<T> cur) {

		if (cur != null) {

			inOrder(cur.left); // traverse left

			System.out.print(cur.data + " "); // root/current goes in middle

			inOrder(cur.right); // traverse right

		}

	}

	public boolean insert(T data) {

		// nothing in the tree.... we will add the new node and connect it to the root

		if (this.root == null) {

			this.root = new BSTNode<T>(data);
			return true;

		}

		// tree not empty... search for a parent to connect to

		BSTNode<T> parent = search(data)[0];
		BSTNode<T> cur = this.root;

		if (parent == null) {

			System.out.println( "Returning false, parent is null for data: " + data);

			return false;

		} else {

			// now we have to search down the tree to find a place to add the new value

			while (cur != null) { // this operates in a while loop b/c we need to get to the point where cur is finally found

				if (data.compareTo(cur.data) < 0) {

					// new value is less than current, so go left
					// if left is null, then we can add the new value here

					if (cur.left == null) {

						cur.setLeft(new BSTNode<T>(data));
						return true;

					} else {

						cur = cur.left;

					}

				} else if (data.compareTo(cur.data) > 0) {

					// new value is greater than current, so go right
					// if right is null, then we can add the new value here

					if (cur.right == null) {

						cur.setRight(new BSTNode<T>(data));
						return true;

					} else {

						cur = cur.right;

					}

				} else {

					// new value is equal to current, so we have a duplicate

					return false;

				}

			}

		}

		return false; // some other dreadful thing happened

	}

	// Enhanced Search function which returns both the found node and its parent
	// simple change made to the interface to account for the tuple-like return value 

	public BSTNode<T>[] search(T data) {

		BSTNode<T> parent = null;
		BSTNode<T> cur = root;

		while (cur != null) {

			if (data.compareTo(cur.data) < 0) {

				parent = cur;
				cur = cur.left;

			} else if (data.compareTo(cur.data) > 0) {

				parent = cur;
				cur = cur.right;

			} else {

				break;

			}

		}

		BSTNode<T>[] result = new BSTNode[2];
		
		result[0] = parent;
		result[1] = cur;

		return result;

	}

	// Helper function to find minimum value node in the subtree rooted at `cur`

	public BSTNode<T> inOrderSuccessor(BSTNode<T> cur) {

		if (cur == null) {

			return null;

		}

		// Traverse the left subtree to find the minimum value node

		while (cur.left != null) {

			cur = cur.left;

		}

		return cur;

	}

	public boolean remove(T data) {

		BSTNode<T>[] searchResults = search(data);

		BSTNode<T> parent = searchResults[0];
		BSTNode<T> cur = searchResults[1];

		// we dont need the compareTo here since search() will find the parent regardless

		if (cur == null) {

			return false; // not found

		}

		// no children

		if (cur.left == null && cur.right == null) {

			if (parent == null) { // deleting the root node

				root = null;

			} else if (parent.left == cur) {

				parent.left = null;

			} else {

				parent.right = null;

			}

		}

		// two children

		else if (cur.left != null && cur.right != null) {

			BSTNode<T> successor = inOrderSuccessor(cur.right);

			T successorData = successor.getData();

			remove(successorData);

			cur.data = successorData;

		}

		// one child
		
		else { 

			BSTNode<T> child = (cur.left != null) ? cur.left : cur.right; // ternary to get the correct child

			if (parent == null) { // deleting the root node

				root = child;

			} else if (parent.left == cur) {

				parent.left = child;

			} else {

				parent.right = child;

			}

		}

		return true; // deletion successful

	}

}