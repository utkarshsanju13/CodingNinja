package binaryTree_2;

import java.util.LinkedList;
import java.util.Queue;

import binaryTree_1.BinaryTreeNode;

public class MirrorImageUsingQueue {

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = BinaryTreeNode.createNode();
		LevelOrderRecursion.LevelOrder(root);
		mirrorBinaryTree(root);
		System.out.println();
		LevelOrderRecursion.LevelOrder(root);
	}

	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
        if(root == null)
            return;
        
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();
        q.add(root);
        
        while(q.size() > 0){
            
            BinaryTreeNode<Integer> curr = q.poll();
            
            BinaryTreeNode<Integer> temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;
            
            if(curr.left!=null)
                q.add(curr.left);
            
            if(curr.right!=null)
                q.add(curr.right);
            
        }
       
	}
}
