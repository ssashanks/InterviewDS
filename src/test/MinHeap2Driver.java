package test;

public class MinHeap2Driver {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinHeap2 test = new MinHeap2();
		test.add(5);
		System.out.println(test.peek());
		test.add(1);
		test.add(0);
		test.add(-1);
		System.out.println(test.peek());
		System.out.println(test.poll());
		System.out.println(test.poll());
		System.out.println(test.peek());
		
		
	}



}
