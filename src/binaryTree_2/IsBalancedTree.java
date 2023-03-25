package binaryTree_2;

import binaryTree_1.BinaryTreeNode;

public class IsBalancedTree {

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = BinaryTreeNode.createNode();
		BinaryTreeNode<Integer> root1 = BinaryTreeNode.createUnbalancedTree();
		
//		System.out.println(heightOfTree(root));
		System.out.println(balancedTree(root));
		System.out.println(balancedTree(root1));
		
		
	}
	
	public static boolean balancedTree(BinaryTreeNode<Integer> root) {
		
		int diff = 0;
		if(root == null)
			return true;
		
		int leftSubTreeHeight = heightOfTree(root.left);
		int rightSubTreeHeight = heightOfTree(root.right);
		
		if(leftSubTreeHeight >= rightSubTreeHeight) {
			diff = leftSubTreeHeight - rightSubTreeHeight;
		}else {
			diff = rightSubTreeHeight - leftSubTreeHeight;
		}
		
		if(diff > 1)
			return false;
		
		boolean isLeftBalanced = balancedTree(root.left);
		boolean isRightBalanced = balancedTree(root.right);
		
		return isLeftBalanced && isRightBalanced;	
	}
	
	public static int heightOfTree(BinaryTreeNode<Integer> root) {
		
		if(root == null)
			return 0;
		
		int leftHeight = heightOfTree(root.left);
		int rightHeight = heightOfTree(root.right);
		
		if(leftHeight >= rightHeight)
			return leftHeight + 1;
		
		return rightHeight + 1;
		
		
	}
}
