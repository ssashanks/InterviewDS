package hashmap;

public class MyHashMap {
	static final int SIZE = 256;
	Node[] bucket = new Node[SIZE];
	class Node {
		String key;
		String value;
		Node next;
		public Node(String key, String value) {
			this.key = key;
			this.value = value;
		}
	}
	
	public void put(String key, String value) {
		int hashcode = (int) key.hashCode() % SIZE;
		Node node = bucket[hashcode];
		
		if(node == null) {
			node = new Node(key, value);
			bucket[hashcode] = node;
		} else {
			boolean found = false;
			while(node.next != null) {
				if(node.value == value) {
					node.value = value;
					found = true;
					break;
				}
				node = node.next;
			}
			
			if(!found) {
				if(node.value == value) {
					node.value = value;
				} else {
					node.next = new Node(key, value);
				}
			}
		}
	}
	
	public String get(String key) {
		int hashcode = (int) key.hashCode() % SIZE;
		Node node = bucket[hashcode];
		if(node == null) {
			return null;
		} else {
			while(node != null) {
				if(node.key == key) {
					return node.value;
				}
				node = node.next;
			}
			return null;
		}
	}
	
}
