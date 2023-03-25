package binaryTree_1;

public class HeightOfTreeRecursion {

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = BinaryTreeNode.createNode();
		System.out.println(height(root));
	}
	
	public static int height(BinaryTreeNode<Integer> root) {
		//Your code goes here
		
        if(root == null)
            return 0;
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        if(leftHeight > rightHeight)
            return 1 + leftHeight;
        
        return 1 + rightHeight;
	}
}
