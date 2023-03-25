package binaryTree_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import binaryTree_1.BinaryTreeNode;

public class PrintAllNodeAtDistanceKFromGivenNode2 {

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = BinaryTreeNode.createNode();
		
		List<Integer> list = printAllNodeAtDistanceKFromGivenNode2(root, root.left, 1);
		System.out.println(list);
	}

	public static List<Integer> printAllNodeAtDistanceKFromGivenNode2(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> target, int k) {
	    
		Map<BinaryTreeNode<Integer>, BinaryTreeNode<Integer>> parent_track = new HashMap<>();
	        markParents(root, parent_track, root); 


	        Map<BinaryTreeNode<Integer>, Boolean> visited = new HashMap<>(); 
	        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();
	        queue.offer(target);
	        
	        visited.put(target, true);
	        int curr_level = 0;
	        
	        while(!queue.isEmpty()) {
	            int size = queue.size();
	            if(curr_level == k) break;
	            curr_level++;
	            for(int i=0; i<size; i++) {
	            	BinaryTreeNode<Integer> current = queue.poll(); 
	                if(current.left != null && visited.get(current.left) == null) {
	                	
	                    queue.offer(current.left);
	                    visited.put(current.left, true);
	                }
	                if(current.right != null && visited.get(current.right) == null ) {
	                	
	                    queue.offer(current.right);
	                    visited.put(current.right, true);
	                }
	                if(parent_track.get(current) != null && visited.get(parent_track.get(current)) == null) {
	                	
	                    queue.offer(parent_track.get(current));
	                    visited.put(parent_track.get(current), true);
	                }
	            }
	        }
	        
	        List<Integer> result = new ArrayList<>(); 
	        while(!queue.isEmpty()) {
	        	BinaryTreeNode<Integer> current = queue.poll(); 
	            result.add(current.data);
	        }
	        return result;
	    }
	
	 private static void markParents(BinaryTreeNode<Integer> root, Map<BinaryTreeNode<Integer>, BinaryTreeNode<Integer>> parent_track, BinaryTreeNode<Integer> target) {
	        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();
	        queue.offer(root);
	        while(!queue.isEmpty()) { 
	        	BinaryTreeNode<Integer> current = queue.poll(); 
	            if(current.left != null) {
	                parent_track.put(current.left, current);
	                queue.offer(current.left);
	            }
	            if(current.right != null) {
	                parent_track.put(current.right, current);
	                queue.offer(current.right);
	            }
	        }
	    }
	 
//		private static List<Integer> printAllNodeAtDistanceKFromGivenNode2(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> target, int k) {
//		
//		HashMap<BinaryTreeNode<Integer>,BinaryTreeNode<Integer>> parent_track = new HashMap<>();
//		markParents(root,parent_track, target);
//		System.out.println(parent_track);
//		
//		Map<BinaryTreeNode<Integer>,Boolean> visited = new HashMap<>();
//		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
//		queue.offer(target);
//		visited.put(target, true);
//		int curr_level = 0;
//		
//		while(!queue.isEmpty()) {
//			
//			int size = queue.size();
//			
//			for(int i = 0 ; i < size; i++) {
//				BinaryTreeNode<Integer> current = queue.poll();
//				curr_level++;
//				
//				if(current.left!=null && visited.get(current.left) == null) {
//					queue.offer(current.left);
//					visited.put(current.left, true);
//				}
//				
//				if(current.right!=null && visited.get(current.right) == null) {
//					queue.offer(current.right);
//					visited.put(current.right, true);
//				}
//				
//				if(parent_track.get(current) !=null && visited.get(parent_track.get(current)) == null) {
//					queue.offer(parent_track.get(current));
//					visited.put(parent_track.get(current), true);
//				}
//			}
//		}
//		
//		List<Integer> result = new ArrayList<>();
//		System.out.println(queue);
//		while(!queue.isEmpty()) {
//			BinaryTreeNode<Integer> current = queue.poll();
//			result.add(current.data);
//		}
//		
//		return result;
//	}

//	private static void markParent(BinaryTreeNode<Integer> root,
//			Map<BinaryTreeNode<Integer>, BinaryTreeNode<Integer>> parent_track, BinaryTreeNode<Integer> target) {
//			
//		Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
//		q.offer(root);
//		parent_track.put(root, null);
//		while(!q.isEmpty()) {
//			BinaryTreeNode<Integer> current = q.poll();
//			
//			if(current.left!=null) {
//				parent_track.put(current.left, current);
//				q.offer(current.left);
//			}
//			
//			if(current.right != null) {
//				parent_track.put(current.right, current);
//				q.offer(current.right);
//			}	
//		}
//	}
	 
}
