package binaryTree_2;


import binaryTree_1.BinaryTreeNode;


//Approach
/*1) We first find the last node in post[]. The last node is “1”, we know this value is root as the root always appears at the end of postorder traversal.
2) We search “1” in in[] to find the left and right subtrees of the root. Everything on the left of “1” in in[] is in the left subtree and everything on right is in the right subtree. 

         1
       /    \
[4, 8, 2, 5]   [6, 3, 7]
3) We recur the above process for the following two. 
….b) Recur for in[] = {6, 3, 7} and post[] = {6, 7, 3} 
…….Make the created tree as right child of root. 
….a) Recur for in[] = {4, 8, 2, 5} and post[] = {8, 4, 5, 2}. 
…….Make the created tree as left child of root.
Below is the implementation of the above idea. One important observation is, that we recursively call for the right subtree before the left subtree as we decrease the index of the postorder index whenever we create a new node. 
*/

/*Point to remeber int that there is small change as compareto CompareTreeUsingPreAndInOrder is that
while passing the post end and start index in Tnode.left and Tnode. right 

because in post order the root is at the last place.*/

public class ContructTreeUsingPostOrderAndPreOrder {
	
	public static void main(String[] args) {
		
		int post[] = { 4,5,2,9,7,8,1};
		int in[] = {4,2,5,1,9,8,7};
		
		BinaryTreeNode<Integer> root = buildTreehelp(post, in , 0, in.length - 1, 0, post.length - 1);
		
		BinaryTreeNode.printTreeDetailed(root);
		BinaryTreeNode.print2D(root);
	}
	
	public static BinaryTreeNode<Integer> buildTreehelp(int[] post, int[] in, int inStart, int inEnd, int postStart, int postEnd){

		if(inStart > inEnd)
		return null;

		BinaryTreeNode<Integer> tNode = new BinaryTreeNode<Integer>(post[postEnd]);

		if(inStart == inEnd)
			return tNode;

		int iIndex = search(in, inStart, inEnd, tNode.data);

		tNode.left = buildTreehelp(post, in, inStart,iIndex -1, postStart, postEnd - inEnd + iIndex -1);
		tNode.right = buildTreehelp(post, in, iIndex + 1,inEnd, postStart - inStart + iIndex, postEnd - 1);

		return tNode;
	}

	public static int search(int[] in, int inStart, int inEnd, int value){
		int i;
		for(i = inStart; i <= inEnd; i++){
			if(in[i] == value)
				break;
		}

		return i;
	}
}
