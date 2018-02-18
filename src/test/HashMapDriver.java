package test;

public class HashMapDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> test = new HashMap<String, String>();
		test.put("test", "1");
		test.put("test2", "2");
		test.put("test3", "3");
		System.out.println(test.get("test"));
		System.out.println(test.get("test2"));
		System.out.println(test.get("test3"));
		
	}

}
