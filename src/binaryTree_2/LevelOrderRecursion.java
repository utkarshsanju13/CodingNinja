package binaryTree_2;

import binaryTree_1.BinaryTreeNode;
import binaryTree_1.HeightOfTreeRecursion;

public class LevelOrderRecursion {

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = BinaryTreeNode.createNode();
		LevelOrder(root);
	}

	public static void LevelOrder(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		
		if(root == null)
			return;
		
		int height = HeightOfTreeRecursion.height(root);
		for(int i = 1; i <= height; i++) {
			printCurrentLevel(root,i);
		}
	}

	private static void printCurrentLevel(BinaryTreeNode<Integer> root, int level) {
		// TODO Auto-generated method stub
		
		if(root == null)
			return;
		
		if(level == 1)
			System.out.print(root.data+ " ");
		
		printCurrentLevel(root.left, level - 1);
		printCurrentLevel(root.right, level - 1);
		
	}
	
	
}
