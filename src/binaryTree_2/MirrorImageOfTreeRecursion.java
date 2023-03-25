package binaryTree_2;

import binaryTree_1.BinaryTreeNode;

public class MirrorImageOfTreeRecursion {

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = BinaryTreeNode.createNode();
//		Printing the level order before the mirroring the tree
		LevelOrderRecursion.LevelOrder(root);
		mirrorImage(root);
		System.out.println();
		//Printing the level order after the mirroring the tree
		LevelOrderRecursion.LevelOrder(root);
		
	}
	
	public static BinaryTreeNode<Integer> mirrorImage(BinaryTreeNode<Integer> root) {
		
		if(root == null)
			return root;
		
		BinaryTreeNode<Integer> leftSide = mirrorImage(root.left);
		BinaryTreeNode<Integer> rightSide = mirrorImage(root.right);
		
		root.right = leftSide;
		root.left = rightSide;
		
		return root;
	}
}
