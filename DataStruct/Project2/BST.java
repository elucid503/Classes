package Project2;
 
public class BST<T extends Comparable<T>> implements iBST<T> {

	private BSTNode<T> root;

	public BST() {

		root = null;

	}

	public void inOrder() {

		// wraps result of private function with [ ]

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

		if (this.root == null) {

			// nothing in the tree.... we will add the new node and connect it to the root

			this.root = new BSTNode<T>(data);
			return true;

		}

		// tree not empty... search for a parent to connect to

		BSTNode<T> parent = search(data); 
		BSTNode<T> cur = this.root;

		if (parent == null) {

			// this means that the data already exists in the tree, and we will ignore it
			
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

					// also a duplicate case

					return false;

				}

			}

		}

		return false; // some other dreadful thing happened

	}

	// Searches for an element and returns its parent

	public BSTNode<T> search(T data) {

		BSTNode<T> cur = root;
		BSTNode<T> parent = null; // parent node

		while (cur != null) {

			if (data.compareTo(cur.data) < 0) {

				parent = cur; // set parent to current node
				cur = cur.left; // go left

			} else if (data.compareTo(cur.data) > 0) {

				parent = cur; // set parent to current node
				cur = cur.right; // go right

			} else {

				// the key already exists (since == 0)
				// no duplicates, so null

				return null;

			}

		}
		
		return parent; // return the parent node

	}
	
	// Enhanced search function to return parent and current node

	private BSTNode<T>[] enhancedSearch(T data) {

		BSTNode<T>[] resultTupleLikeArr = new BSTNode[2]; // [parent, current]

		BSTNode<T> cur = root;
		BSTNode<T> parent = null;

		while (cur != null) {

			// same thing as above, but with some extra logic to keep track of the parent
			// ideally, the original search method could be like this, but the interface disagrees
			// this is useful internally, though

			if (data.compareTo(cur.data) < 0) {

				parent = cur; 
				cur = cur.left;

			} else if (data.compareTo(cur.data) > 0) {

				parent = cur; 
				cur = cur.right;

			} else {

				// duplicate. important not to return here, since we might already have what we need

				break;

			}

		}

		resultTupleLikeArr[0] = parent;
		resultTupleLikeArr[1] = cur; 

		return resultTupleLikeArr;

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

		BSTNode<T>[] searchResults = enhancedSearch(data);

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