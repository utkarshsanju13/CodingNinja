package binaryTree_1;

public class IsNodePresent {

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = BinaryTreeNode.createNode();
		
		System.out.println(isNodePresent(root,3));
		System.out.println(isNodePresent(root,13));
	}
	
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
        
        if(root == null){
            return false;
        }
        
        if(root.data == x)
            return true;
        
        boolean leftCheck = isNodePresent(root.left,x);
        boolean rightCheck = isNodePresent(root.right, x);
        
        
    	if(leftCheck == true|| rightCheck == true)
                return true;
        
        return false;
        
	}
}
