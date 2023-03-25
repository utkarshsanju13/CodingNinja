package binaryTree_1;

public class NodeWithoutSibling {

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = BinaryTreeNode.createNodeForNodeWithoutSibling();
		
		printNodesWithoutSibling(root);
		
	}
	
	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		//Your code goes here
        
        if(root == null)
            return;
        
        if(root.left!=null && root.right == null){
            System.out.print(root.left.data + " ");
        }
        
        if(root.left == null && root.right != null){
            System.out.print(root.right.data + " ");
        }
        
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
	}
}
