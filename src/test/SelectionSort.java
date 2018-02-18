package test;

public class SelectionSort {
	
	static void selectionsort(int []arr) {
		for(int i=0; i< arr.length; i ++) {
			int min = arr[i];
			int minIndex = i;
			for (int j = i+1; j < arr.length; j ++) {
				if(arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			swap(arr, i, minIndex);
		}
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
		int[] arr= { 10, -1, 7, 3, 4, 19, 9};
		selectionsort(arr);
		for(int i: arr) {
			System.out.println(i);
		}
	}
}
