package binaryTree_2;

import binaryTree_1.BinaryTreeNode;

//There are 2 approach
public class DiameterOfTree {

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = BinaryTreeNode.createNode();
		
		System.out.println(diameterOfTree(root));
	}

	//Complexity is O(n2) because there are 4 recursive call 
	// 2 is the height each of O(n) and another is the diameter recursive call
	//so it will make O(n2)
	private static int diameterOfTree(BinaryTreeNode<Integer> root) {
		 
		if(root == null)
			return 0;
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		int leftDiameter = diameterOfTree(root.left);
		int rightDiamter = diameterOfTree(root.right);
		
		return Math.max(leftHeight+ rightHeight + 1, Math.max(leftDiameter, rightDiamter));
	}

	private static int height(BinaryTreeNode<Integer> root) {
		
		if(root == null)
			return 0;
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		return 1+ Math.max(leftHeight, rightHeight);
		
	}
}
