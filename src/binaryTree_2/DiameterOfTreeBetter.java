package binaryTree_2;

import binaryTree_1.BinaryTreeNode;

//LINK:https://www.geeksforgeeks.org/diameter-of-a-binary-tree-in-on-a-new-method/#:~:text=The%20diameter%20of%20a%20tree,two%20leaves%20in%20the%20tree.
class Answer{
	static int ans = Integer.MIN_VALUE;
}

//Complexity is O(n)
//make a answer variable ans and during height calculation at each node we also calculate 
//leftHeight + rightHeight+1 and update the Answer.ans at each node 
//and choose the maximum between them
public class DiameterOfTreeBetter {

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = BinaryTreeNode.createNode();

		System.out.println(diameterOfTreeBetter(root));
	}

	
	private static int diameterOfTreeBetter(BinaryTreeNode<Integer> root) {
		
		if(root == null)
			return 0;
		Answer a = new Answer();
		int result = height(root,a);
		
		return a.ans;
		
	}

	private static int height(BinaryTreeNode<Integer> root, Answer a) {
		
		if(root == null)
			return 0;
		
		int leftHeight = height(root.left,a);
		int rightHeight = height(root.right,a);
		
		a.ans = Math.max(a.ans, leftHeight+ rightHeight+1);
		
		return 1 + Math.max(leftHeight, rightHeight);
	}
}
