package heap;
public class Median {

	MinHeap minHeap = new MinHeap();
	MaxHeap maxHeap = new MaxHeap();
	
	public void add(int value) throws Exception {
		if(maxHeap.getSize() == 0 || value > maxHeap.peek()) {
			maxHeap.add(value);
		} else {
			minHeap.add(value);
		}
		rebalance();
	}
	
	void rebalance() throws Exception {
		int minSize = minHeap.getSize();
		int maxSize = maxHeap.getSize();
		int diff= minSize - maxSize;
		diff = diff < 0 ? diff * -1: diff;
		if (diff > 1) {
			int transferCount = diff/2;
			if(maxSize < minSize) {
				for(int i = 0; i < transferCount ; i++) {
					maxHeap.add(minHeap.pop());
				}
			} else {
				for(int i = 0; i < transferCount ; i++) {
					minHeap.add(maxHeap.pop());
				}
			}
		}
	}
	
	public double getMedian() throws Exception {
		if(minHeap.getSize() > maxHeap.getSize()) {
			return minHeap.peek();
		} else if(minHeap.getSize() < maxHeap.getSize()) {
			return maxHeap.peek();
		} else {
			if(minHeap.getSize() == 0) {
				return 0;
			} else {
				//System.out.println(minHeap.peek() + " "+ maxHeap.peek() );
				return (double)(minHeap.peek() +  maxHeap.peek())/2;
			}
			 
		}
	}

}
