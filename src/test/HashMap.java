package test;

public class HashMap<K, V> {
	class Node<S, T> {
		S key;
		T value;
		Node<S, T> next;
		public Node(S key, T value) {
			this.key = key;
			this.value = value;
			this.next = null;
		}
		
	}
	
	static final int SIZE = 256;
	@SuppressWarnings("unchecked")
	Node<K, V>[] array = new Node[SIZE];
	
	
	public void put(K key, V value) {
		if(key == null) {
			return;
		}
		Node<K,V> newNode = new Node<K, V>(key, value);
		int hash = key.hashCode() % SIZE;
		if(array[hash] == null) {
			array[hash] = newNode;
		} else {
			Node<K, V> head = array[hash];
			Node<K, V> previous = null;
			while (head != null) {
				if(head.key.equals(key)) {
					head.value = value;
					break;
				}
				previous = head;
				head = head.next;
			}
			
			if(head == null) {
				previous.next = newNode;
			}
		}
	}
	
	public V get(K key) {
		if(key == null) {
			return null;
		}
		int hash = key.hashCode() % SIZE;
		if(array[hash] != null) {
			Node<K, V> head = array[hash];
			while (head != null) {
				if(head.key.equals(key)) {
					return head.value;
				}
				head = head.next;
			}
		}
		return null;
	}
	
	public boolean containsKey(K key) {
		if(get(key) != null) {
			return true;
		}
		return false;
	}
}
