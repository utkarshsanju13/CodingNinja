package binaryTree_1;

public class LargestAmongAllNodeRecursion {

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = BinaryTreeNode.createNode();
		
		System.out.println("Largest Among All Nodes is : " + largestAmongAll(root));
		
	}
	
	public static int largestAmongAll(BinaryTreeNode<Integer> root) {
		if(root == null)
			return 0;
		
		int leftLargest = largestAmongAll(root.left);
		int rightLargest = largestAmongAll(root.right);
		
		return Math.max(root.data , Math.max(leftLargest, rightLargest));
		
	}
}
