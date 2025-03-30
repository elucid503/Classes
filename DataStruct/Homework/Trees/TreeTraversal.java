package Homework.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal implements iTreeTraversal {
 
    @Override
    public void inorder(TreeNode TreeNode) {

        // assuming the tree is a binary tree, 
        // inorder simply needs to traverse the left subtree, then the right subtree
        // and print the root node in between

        // we can also make use of recursion to make everything simpler

        if (TreeNode == null) {

            return;

        }

        inorder(TreeNode.left); // traverse left until we hit a null node

        System.out.print(TreeNode.data + " "); // print the root node

        inorder(TreeNode.right); // traverse right until we hit a null node

    }

    @Override
    public void preorder(TreeNode TreeNode) {

        // difference here is we print root first,
        // not worrying about the left or right subtrees for order

        if (TreeNode == null) {

            return;

        }

        // same concept as above, just switched lines

        System.out.print(TreeNode.data + " ");
        preorder(TreeNode.left);
        preorder(TreeNode.right);

    }   

    @Override
    public void postorder(TreeNode TreeNode) {

        // here, we will print root *last*,
        // not worrying about the left or right subtrees for order

        if (TreeNode == null) {

            return;

        }

        // again... same concept

        postorder(TreeNode.left);
        postorder(TreeNode.right);
        System.out.print(TreeNode.data + " ");

    }
    
    @Override
    public void printLevelOrder(TreeNode TreeNode) {

        // we will use a queue to keep track of the nodes
        // prints the root first, then the left and right children, and so on
        // this uses an iterative approach instead of recursion

        if (TreeNode == null) {

            return;

        }

        Queue<TreeNode> nodeQueue = new LinkedList<>(); // linkedList will implement queue here
        nodeQueue.add(TreeNode);

        while (!nodeQueue.isEmpty()) {

            TreeNode current = nodeQueue.poll(); // gets the first element
            System.out.print(current.data + " "); // and prints it

            // enqueue the respective children 

            if (current.left != null) {

                nodeQueue.add(current.left);

            }

            if (current.right != null) {

                nodeQueue.add(current.right);

            }

        }

    }
	
}