package binaryTree_2;

import java.util.LinkedList;
import java.util.Queue;

import binaryTree_1.BinaryTreeNode;

public class LevelOrderUsingQueue {

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = BinaryTreeNode.createNode();
		//Print in 2D form
//		BinaryTreeNode.print2D(root);
		levelOrder(root);
	}
	
	public static void levelOrder(BinaryTreeNode<Integer> root) {
		
		if(root == null)
			return;
		
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			
			BinaryTreeNode<Integer> temp = q.poll();
			System.out.print(temp.data + " ");
			
			if(temp.left != null) {
				q.add(temp.left);
			}
			
			if(temp.right != null) {
				q.add(temp.right);
			}
		}
	}
	
}
