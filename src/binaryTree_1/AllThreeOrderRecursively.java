package binaryTree_1;

public class AllThreeOrderRecursively {

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = BinaryTreeNode.createNode();
		
		System.out.print("PRE ORDER : ");
		preOrder(root);
		System.out.println();
		System.out.print("POST ORDER : ");
		postOrder(root);
		System.out.println();
		System.out.print("IN ORDER : ");
		inOrder(root);
		
	}
	
	public static void postOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null)
            return;
        
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

	}

	public static void preOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null)
            return;
        
        System.out.print(root.data + " ");
        postOrder(root.left);
        postOrder(root.right);
       

	}

	public static void inOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null)
            return;
        
        postOrder(root.left);
        System.out.print(root.data + " ");
        postOrder(root.right);
        

	}

}
