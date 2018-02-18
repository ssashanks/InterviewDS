package test;

public class TrieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie trie = new Trie();
		
		trie.add("catatonic");
		trie.add("catastrophic");
		System.out.println(trie.check("cat"));
		System.out.println(trie.isCompleteWord("catatonic"));
	}

}
