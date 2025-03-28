package Classwork.Examples.Traversal;

import java.util.Vector;
 
public class TreeNode {
	 
	protected int key;
	protected Vector<TreeNode> child = new Vector<>();

	protected TreeNode(int key) {
		
		this.key = key;
		
	}
		
}