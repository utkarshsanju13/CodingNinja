package binaryTree_1;

public class NumberOfLeaveNodeRecursion {

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = BinaryTreeNode.createNode();
		System.out.println("Number Of Leave Node : " + leafNode(root));
	}

	private static int leafNode(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return 0;
		}
		
		if(root.left == null && root.right == null) {
			return 1;
		}
		
		int leftLeaf = leafNode(root.left);
		int rightLeaf = leafNode(root.right);
		
		return leftLeaf + rightLeaf;
				
	}
}
