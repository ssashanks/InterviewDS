package test;

public class QuickSort {
	static void quicksort(int[] arr) {
		quicksort(arr, 0, arr.length-1);
	}
	
	private static void quicksort(int[] arr, int start, int end) {
		if(start >= end) {
			return;
		}
		int pivot = arr[(start+end)/2];
		int partition = partition(arr, start, end, pivot);
		quicksort(arr, start, partition-1);
		quicksort(arr, partition, end);
	}
	
	private static int partition(int[] arr, int left, int right, int pivot) {
		while(left <= right) {
			while(arr[left] < pivot) {left++;}
			while(arr[right] > pivot) {right--;}
			if(left <= right) {
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		return left;
	}
	
	static void swap(int[] arr, int a, int b) {
		if(a == b) {
			return;
		}
		arr[a] = arr[a] + arr[b];
		arr[b] = arr[a] - arr[b];
		arr[a] = arr[a] - arr[b];
	}
	
	public static void main(String args[]) throws Exception {
		int[] arr= { 1, 2, 5, 3, 4};
		quicksort(arr);
		for(int i: arr) {
			System.out.println(i);
		}
	}
}
