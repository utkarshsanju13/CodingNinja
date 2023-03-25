package binaryTree_1;

public class SumOfNodes {

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = BinaryTreeNode.createNode();
		
		System.out.println(getSum(root));
	}
	
	public static int getSum(BinaryTreeNode<Integer> root) {
		//Your code goes here.
        
        if(root == null)
            return 0;
        
        int leftSum = getSum(root.left);
        int rightSum = getSum(root.right);
        
        return root.data + leftSum + rightSum;
	}
}
