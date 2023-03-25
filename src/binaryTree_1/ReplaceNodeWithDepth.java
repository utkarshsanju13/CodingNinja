package binaryTree_1;

public class ReplaceNodeWithDepth {

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = BinaryTreeNode.createNode();
		
		changeToDepthTree(root);
		BinaryTreeNode.printTreeDetailed(root);
	}
	
	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	    //Your code goes here
        
        if(root == null)
            return;
        
        root.data = 0;
        change(root,0);
	}
    
    public static void change(BinaryTreeNode<Integer> root, int k){
        
         if(root == null)
            return;
        
        change(root.left, k+1);
        change(root.right, k+1);
	
        root.data = k;
    }

}
