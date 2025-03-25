package Homework.Trees;

public class TreeTraversal implements iTreeTraversal{
 
    @Override
    public void inorder(TreeNode TreeNode) {

        // assuming the tree is a binary tree, 
        // in order simply needs to traverse the left subtree, then the right subtree
        // and print the root node in between

        // we can also make use of recursion to make everything simpler

        if (TreeNode == null) {

            return;

        }

        inorder(TreeNode.left);

        System.out.print(TreeNode.data + " ");

        inorder(TreeNode.right);

    }

    @Override
    public void preorder(TreeNode TreeNode) {

        // difference here is we print root first,
        // not worrying about the left or right subtrees for order

        if (TreeNode == null) {

            return;

        }

        System.out.print(TreeNode.data + " ");
        preorder(TreeNode.left);
        preorder(TreeNode.right);

    }   

    @Override
    public void postorder(TreeNode TreeNode) {


    }
    
    @Override
    public void printLevelOrder(TreeNode TreeNode) {


    }
	
}