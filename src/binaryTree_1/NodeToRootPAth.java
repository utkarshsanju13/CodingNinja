package binaryTree_1;

import java.util.*;

public class NodeToRootPAth {
	
	static ArrayList<Integer> path = new ArrayList<>();;
	
	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = BinaryTreeNode.createNode();
		boolean found = nodeToRootPath(root, 6);
		
		 System.out.println(found);
		 System.out.println(path);
		
	}

	public static boolean nodeToRootPath(BinaryTreeNode<Integer> root, int value) {
		
		if(root == null)
			return false;
		
		if(root.data == value) {
			path.add(root.data);
			return true;
		}
		
		boolean findInLeftSide = nodeToRootPath(root.left, value);
		if(findInLeftSide) {
			path.add(root.data);
			return  true;
		}
		
		boolean findInRightSide = nodeToRootPath(root.right, value);
		if(findInRightSide) {
			path.add(root.data);
			return  true;
		}
		
		return false;
		
	}

}
