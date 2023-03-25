package binaryTree_2;

import binaryTree_1.BinaryTreeNode;

//Time Complexity is O(n)
public class IsBalancedBetter {

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = BinaryTreeNode.createNode();
		BinaryTreeNode<Integer> root1 = BinaryTreeNode.createUnbalancedTree();
		
		BalanceTreeReturn ans = isBalancedBetter(root);
		System.out.println(ans.isBalanced);
		
		BalanceTreeReturn ans1 = isBalancedBetter(root1);
		System.out.println(ans1.isBalanced);
		
	}
	
	public static BalanceTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			int height = 0;
			boolean isBal = true;
			BalanceTreeReturn ans = new BalanceTreeReturn();
			ans.height = height;
			ans.isBalanced = isBal;
			return ans;
		}
		
		BalanceTreeReturn leftOutput = isBalancedBetter(root.left);
		BalanceTreeReturn rightOutput = isBalancedBetter(root.right);

		int height = 1 + Math.max(leftOutput.height, rightOutput.height);
		boolean isBal = true;
		
		
		if(Math.abs(leftOutput.height - rightOutput.height) > 1) {
			isBal = false;
		}
		
		if(!leftOutput.isBalanced || !rightOutput.isBalanced) {
			isBal = false;
		}
		
		BalanceTreeReturn ans = new BalanceTreeReturn();
		ans.height = height;
		ans.isBalanced = isBal;
		
		return ans;
		
	}
}
