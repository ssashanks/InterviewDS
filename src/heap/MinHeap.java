package heap;
import java.util.Arrays;

public class MinHeap {
	int size = 0; 
	int[] array = new int[10];
	
	public void ensureSize() {
		if(array.length == size) {
			array = Arrays.copyOf(array, size * 2);
		}
	}
	
	public int getLeftChildIndex(int index) { return 2 * index +1; }
	public int getRightChildIndex(int index) { return 2 * index +2; }
	public int getParentIndex(int index) { return (index - 1)/2; }
	
	public boolean isLeftExists(int index) { return getLeftChildIndex(index) < size; }
	public boolean isRightExists(int index) { return getRightChildIndex(index) < size; }
	public boolean isParentExists(int index) { return getParentIndex(index) >= 0; }
	
	private void swap(int a, int b) {
//		array[a] = array[a] + array[b];
//		array[b] = array[a] - array[b];
//		array[a] = array[a] - array[b];
		int c = array[a];
		array[a] = array[b];
		array [b] = c;
	}
	
	public int peek() throws Exception {
		if(size == 0) {
			throw new Exception("Empty heap");
		}
		return array[0];
	}
	
	public int pop() throws Exception {
		int min = peek();
		array[0] = array[size-1];
		size = size - 1;
		siftDown(0);
		return min;
	}
	
	public void siftDown(int index) {
		if(isLeftExists(index)) {
			int left = getLeftChildIndex(index);
			if( array[index] > array [left]) {
				swap(index, left);
				siftDown(left);
			}
		}
		
		if(isRightExists(index)) {
			int right = getRightChildIndex(index);
			if( array[index] > array [right]) {
				swap(index, right);
				siftDown(right);
			}
		}
	}
	
	public void add(int value) {
		ensureSize();
		int newItem = size;
		array[newItem] = value;
		size ++;
		siftUp(newItem);
	}
	
	public void siftUp(int index) {
		if(isParentExists(index)) {
			int parent = getParentIndex(index);
			if(array[parent] > array[index]) {
				swap(parent, index);
				siftUp(parent);
			}
		}
	}
	
	public int getSize() {
		return size;
	}
	
	
}
