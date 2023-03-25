package binaryTree_2;

import binaryTree_1.BinaryTreeNode;

public class RemoveLeafNode {

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = BinaryTreeNode.createNode();
		removeLeaf(root);
		
		BinaryTreeNode.printTreeDetailed(root);
		
	}
	
	private static BinaryTreeNode<Integer> removeLeaf(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return null;
		}
		
		if(root.left == null && root.right == null) {
			return null;
		}
		
		root.left = removeLeaf(root.left);
		root.right = removeLeaf(root.right);
		
		return root;
	}
}
