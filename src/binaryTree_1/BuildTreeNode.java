package binaryTree_1;

import java.util.Scanner;

public class BuildTreeNode {
	
	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = taketreeInputBetter(true,0,true);
		BinaryTreeNode.printTreeDetailed(root);
	}
	
	public static BinaryTreeNode<Integer> takeTreeInput(){
		
		System.out.println("enter the root data");
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeTreeInput();
		BinaryTreeNode<Integer> rightChild = takeTreeInput();
		
		root.left = leftChild;
		root.right = rightChild;
		
		return root;	
	}
	
	public static BinaryTreeNode<Integer> taketreeInputBetter(boolean isRoot, int parentNode, boolean isLeft){
		
		
		if(isRoot) {
			System.out.println("Enter the root Node");
		}else {
			if(isLeft) {
				System.out.println("Enter the left Child of " + parentNode);
			}
			if(!isLeft) {
				System.out.println("Enter the right Child of " + parentNode);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = taketreeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = taketreeInputBetter(false, rootData, false);
		
		root.left = leftChild;
		root.right = rightChild;
		
		return root;
	}
	
	
}
