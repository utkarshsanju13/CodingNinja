package binaryTree_2;

import binaryTree_1.BinaryTreeNode;

//Question: Construct the tree using the preOrder and inOrder given
//Solution Approach:
/* 1: Pick an element from Preorder. Increment a Preorder Index Variable (preIndex in below code) to pick the
next element in the next recursive call. 
2: Create a new tree node tNode with the data as the picked element. 
3: Find the picked element’s index in Inorder. Let the index be inIndex. 
4: Call buildTree for elements before inIndex and make the built tree as a left subtree of tNode. 
5: Call buildTree for elements after inIndex and make the built tree as a right subtree of tNode. 
6: return tNode.*/


/*Efficient Approach : 

We can optimize the above solution using hashing (unordered_map in C++ or HashMap in Java). 
We store indexes of inorder traversal in a hash table. So that search can be done O(1) time.*/ 

public class ConstructTreeUsinPreOrderAndInOrder {
	
	BinaryTreeNode<Integer> root;
	static int preIndex = 0;
	public static void main(String[] args) {
		
		int pre[] = {1,2,4,5,8,9,7};
		int in[] = {4,2,5,1,9,8,7};
		int inOrderLen = in.length;
		BinaryTreeNode<Integer> root = buildTree(pre, in, 0, inOrderLen -1);
		BinaryTreeNode.printTreeDetailed(root);
		BinaryTreeNode.print2D(root);
		
		
	}

	public static BinaryTreeNode<Integer> buildTree(int[] pre, int[]in, int inStart, int inEnd){

		if(inStart > inEnd)
			return null;

		BinaryTreeNode<Integer> tNode = new BinaryTreeNode<Integer>(pre[preIndex++]);

		if(inStart == inEnd)
			return tNode;

		int inIndex = search(in, inStart, inEnd, tNode.data);	

		tNode.left = buildTree(pre, in, inStart, inIndex -1);
		tNode.right = buildTree(pre,in, inIndex + 1, inEnd);

			return tNode;
	}

	public static int search( int[] in, int inStart, int inEnd, int value){
		int i;

		for(i = inStart; i <=inEnd; i++){
			if(in[i] == value){
				return i;
			}
		}
		return i;
	}
}
