package test;
import java.util.Arrays;

public class MinHeap2 {
	int [] array = new int[10];
	int size = 0;
	
	int getLeftIndex(int index) {
		return 2 * index +1; 
	}
	
	int getRightIndex(int index) {
		return 2 * index +2; 
	}
	
	int getParentIndex(int index) {
		return (index-1)/2; 
	}
	
	boolean hasLeft(int index) {
		return getLeftIndex(index) < size; 
	}
	
	boolean hasRight(int index) {
		return getRightIndex(index) < size; 
	}
	
	boolean hasParent(int index) {
		return getParentIndex(index) >= 0; 
	}
	
	
	
	void ensureSize() {
		if(size!= 0 && size == array.length) {
			Arrays.copyOf(array, size * 2);
		}
	}
	
	public int peek() {
		return array[0]; 
	}
	
	public int poll() {
		if(size > 0) {
			int value = array[0];
			array[0] = array[size-1];
			siftDown(0);
			return value;
		}
		return -1;
	}
	
	void siftDown(int index) {
		if(index >= size) {
			return;
		}
		
		if(hasLeft(index)) {
			if(array[getLeftIndex(index)] < array[index]) {
				swap(getLeftIndex(index), index, array);
				siftDown(getLeftIndex(index));
			}
		}
		
		if(hasRight(index)) {
			if(array[getRightIndex(index)] < array[index]) {
				swap(getRightIndex(index), index, array);
				siftDown(getRightIndex(index));
			}
		}
	}
	
	public void add(int value) {
		ensureSize();
		array[size] = value;
		size++;
		siftUp(size-1);
	}
	
	void swap(int a, int b, int[] arr) {
		arr[a] = arr[a] + arr[b];
		arr[b] = arr[a] - arr[b];
		arr[a] = arr[a] - arr[b];
	}
	
	void siftUp(int index) {
		if(hasParent(index)) {
			int parentIdx = getParentIndex(index);
			if(array[parentIdx] > array[index]) {
				swap(parentIdx, index, array);
				siftUp(parentIdx);
			}
		}
	}
	
	
}
