package heap;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueMedian {
	
	public static void main(String args[]) throws Exception {
		PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
		heap.add(1);
		heap.add(2);
		heap.add(3);
		heap.add(-4);
		heap.add(10);
		System.out.println(heap.peek());
		
	}
}
