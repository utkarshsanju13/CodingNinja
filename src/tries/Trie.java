package tries;

import java.util.ArrayList;

public class Trie {

	private TrieNode root;
	private int numWord;

	public Trie() {
		root = new TrieNode('\0');
		numWord = 0;
	}

	private void addHelper(TrieNode root, String word) {

		if (word.length() == 0) {
			root.isTerminal = true;
			return;
		}

		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.children[childIndex];
		if (child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}

		addHelper(child, word.substring(1));
	}

	public void add(String word) {

		addHelper(root, word);
		numWord++;
	}

	private boolean searchHelper(TrieNode root, String word) {

		if (word.length() == 0) {
			return root.isTerminal;
		}
		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.children[childIndex];

		if (child == null) {
			return false;
		}
		return searchHelper(child, word.substring(1));

	}

	public boolean search(String word) {
		return searchHelper(root, word);
	}
	
	//There we only make the last letter of word the notTerminal by making isTerminal false
	private void removeHelpher(TrieNode root, String word) {
		if(word.length() == 0) {
			root.isTerminal = false;
			return;
		}
		int childIndex = word.charAt(0)- 'A';
		TrieNode child = root.children[childIndex];
		
		if(child == null) {
			return;
		}
		
		removeHelpher(child, word.substring(1));
		if(!child.isTerminal && child.childCount == 0) {
			root.children[childIndex] = null;
			root.childCount--;
		}
	}
	
	//But the advance is that the we delete the node of each letter that are not useful 
	private void removeHelpherAdvance(TrieNode root, String word) {
		if(word.length() == 0) {
			root.isTerminal = false;
			return;
		}
		int childIndex = word.charAt(0)- 'A';
		TrieNode child = root.children[childIndex];
		
		if(child == null) {
			return;
		}
		
		removeHelpher(child, word.substring(1));
		
	}

	public void remove(String word) {
		removeHelpher(root, word);
//		removeHelpherAdvance(root,word);
		numWord--;
	}
	
	public int countWords() {
		return numWord;
	}
	
	private void print(TrieNode root, String word) {
		if (root == null) {
			return;
		}
		
		if (root.isTerminal) {
			System.out.println(word);
		}
		
		for (TrieNode child : root.children) {
			if (child == null) {
				continue;
			}
			String fwd = word + child.data;
			print(child, fwd);
		}
	}
	
	public void print() {
		print(this.root, "");
	}
}
