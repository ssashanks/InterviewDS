package test;

import java.util.HashMap;

public class Trie {
	HashMap<String, Trie> map = new HashMap<String, Trie>();
	int size = 0;
	boolean isCompleteWord = false;
	
	public void add(String str) {
		add(str, 0);
	}
	
	public int check(String str) {
		return check(str, 0);
	}
	
	public boolean isCompleteWord(String str) {
		return isCompleteWord(str, 0);
	}
	
	private void add(String str, int index) {
		size++;
		if(str.length() == index) {
			return;
		}
		char c = str.charAt(index);
		Trie childNode = map.get(c+"");
		if(childNode == null) {
			childNode = new Trie();
			map.put(c+"", childNode);
		}
		if(index +1 == str.length()) {
			isCompleteWord = true;
		}
		childNode.add(str, index+1);
	}
	
	private int check(String str, int index) {
		if(str.length() == index) {
			return size;
		}
		char c = str.charAt(index);
		Trie childNode = map.get(c+"");
		if(childNode == null) {
			return -1;
		}
		return childNode.check(str, index+1);
	}
	
	private boolean isCompleteWord(String str, int index) {
		if(str.length()-1 == index) {
			return isCompleteWord;
		}
		char c = str.charAt(index);
		Trie childNode = map.get(c+"");
		if(childNode == null) {
			return false;
		}
		return childNode.isCompleteWord(str, index+1);
	}
	
}
