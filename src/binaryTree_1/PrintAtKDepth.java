package binaryTree_1;

public class PrintAtKDepth {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreeNode.createNode();
		
		printElementAtKDepth(root, 1);
	}

	private static void printElementAtKDepth(BinaryTreeNode<Integer> root, int k) {
		
		if(root == null)
			return;

		if(k == 0) {
			System.out.print(root.data + " ");
		}
		
		printElementAtKDepth(root.left, k-1);
		printElementAtKDepth(root.right, k-1);
	}
}
