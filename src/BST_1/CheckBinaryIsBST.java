package BST_1;

import binaryTree_1.BinaryTreeNode;

public class CheckBinaryIsBST {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreeNode.createBST();
		BinaryTreeNode<Integer> rootNonBST = BinaryTreeNode.createNode();
		
//		BinaryTreeNode.print2DUtil(root, 0);
		
		System.out.println(CheckBST(root));
		System.out.println(CheckBST(rootNonBST));

	}

	private static boolean CheckBST(BinaryTreeNode<Integer> root) {
	
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private static boolean isBST(BinaryTreeNode<Integer> root, int minValue, int maxValue) {
	
		if(root == null)
			return true;
		
		if(root.data <= minValue || root.data >= maxValue)
			return false;
		
		return isBST(root.left, minValue, root.data) && isBST(root.right, root.data, maxValue);
		
	}

}
