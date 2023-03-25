package binaryTree_1;

public class NumberOfNodeInTree {

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = BinaryTreeNode.createNode();
		System.out.println(numberOfNodes (root));
	}

	private static int numberOfNodes(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		
		if(root == null)
			return 0;
		
		int leftNode = numberOfNodes(root.left);
		int rightNode = numberOfNodes(root.right);
		
		return 1 + leftNode + rightNode;
		
		
	}
	
	
}
