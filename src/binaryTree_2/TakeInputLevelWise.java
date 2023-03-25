package binaryTree_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import binaryTree_1.BinaryTreeNode;

public class TakeInputLevelWise {

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		BinaryTreeNode.printTreeDetailed(root);
		BinaryTreeNode.print2D(root);
		
		
	}
	
	public static BinaryTreeNode<Integer> takeInputLevelWise(){
		
		Scanner sc = new Scanner(System.in);
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
		System.out.println("Enter the root");
		int rootData = sc.nextInt();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		q.add(root);
		
		while(!q.isEmpty()) {
			BinaryTreeNode<Integer> front = q.poll();
			
			System.out.println("Enter the left of" + front.data);
			int left = sc.nextInt();
			if(left!=-1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
				front.left = leftChild;
				q.add(leftChild);
			}
			
			System.out.println("Enter the right of" + front.data);
			int right = sc.nextInt();
			if(right!=-1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
				front.right = rightChild;
				q.add(rightChild);
			}
		}
		
		return root;
	}
}
