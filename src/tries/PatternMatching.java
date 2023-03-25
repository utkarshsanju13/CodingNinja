package tries;

import java.util.ArrayList;

public class PatternMatching {
	
	private TrieNode root;
	private int numWord;

	public PatternMatching() {
		root = new TrieNode('\0');
		numWord = 0;
	}

	private void add(TrieNode root, String word) {
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
		add(child, word.substring(1));

	}

	public void add(String word) {
		add(root, word);
	}

	public boolean search(String word){
		return search(root, word);
	}

	private boolean search(TrieNode root, String word) {
		if(word.length() == 0){
			return true;
		}
		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.children[childIndex];
		if(child == null){
			return false;
		}
		return search(child, word.substring(1));
	}

	
	public static boolean patternMatching(ArrayList<String> vect, String pattern) {
        // Write your code here
			for(String s: vect) {
						Trie t = new Trie();
						int sLen = s.length();
						for(int i = 0 ;i < sLen; i++) {
//							System.out.println(s.substring(i));
							t.add(s.substring(i));
			            }
					
					if(t.search(pattern)) {
						return true;
					}
				}
				
				return false;
	}


	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("ABC");
		arr.add("DEF");
		System.out.println(PatternMatching.patternMatching(arr, "ABC"));
	} 
	
}
