package binaryTree_2;

import java.util.ArrayList;

import binaryTree_1.BinaryTreeNode;


//Solution is from Link: https://www.youtube.com/watch?v=B89In5BctFA&t=627s
public class PrintAllNodeAtDistanceKFromGivenNode {

	static ArrayList<BinaryTreeNode<Integer>> path;
	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = BinaryTreeNode.createNode();

		printAllNodeAtDistanceKFromGivenNode(root, 2, 1);
	}

	
	public static void printAllNodeAtDistanceKFromGivenNode(BinaryTreeNode<Integer> root, int target, int k) {
		
		//finding the path of root to that target node
		//the logic is same as nodeToRootPath in binaryTree_1 package
		path = new ArrayList<BinaryTreeNode<Integer>>();
		nodeToRootPath(root, target);
		
		for(int i = 0; i < path.size() && i <=k ;i++) {
//			Then here let element in path we printitng the element by decresing the k(k distance)
			//And a blocker is also passed in third argument not to print the extra unneccesary node
			printElementAtKDepth(path.get(i), k - i, i == 0?null: path.get(i-1));
		}
	}

	public static boolean nodeToRootPath(BinaryTreeNode<Integer> root, int value) {

		if (root == null)
			return false;

		if (root.data == value) {
			path.add(root);
			return true;
		}

		boolean findInLeftSide = nodeToRootPath(root.left, value);
		if (findInLeftSide) {
			path.add(root);
			return true;
		}

		boolean findInRightSide = nodeToRootPath(root.right, value);
		if (findInRightSide) {
			path.add(root);
			return true;
		}

		return false;
	}

	//passed a blocker so that the ELEMENT ONLY PRINT ONE SIDE ANOTHER SIDE IS BLOCK 
	private static void printElementAtKDepth(BinaryTreeNode<Integer> root, int k, BinaryTreeNode<Integer> blocker) {

		if (root == null || k < 0 || root == blocker)
			return;

		if (k == 0) {
			System.out.print(root.data + " ");
		}

		printElementAtKDepth(root.left, k - 1, blocker);
		printElementAtKDepth(root.right, k - 1, blocker);
	}

}
