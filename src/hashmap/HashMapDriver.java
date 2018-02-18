package hashmap;

public class HashMapDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashMap test = new MyHashMap();
		test.put("Test", "va");
		test.put("Test333", "va333");
		System.out.println(test.get("Test333"));
		System.out.println(test.get("Test"));
		System.out.println(test.get("Test"));
		
		
	}

}
