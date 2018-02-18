package test;

public class BubbleSort {
	
	static void bubblesort(int []arr) {
		for(int i=0; i< arr.length; i ++) {
			for (int j = 0; j < arr.length-i-1; j ++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
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
		int[] arr= { 1, 2, 7, 3, 4, 19, 9};
		bubblesort(arr);
		for(int i: arr) {
			System.out.println(i);
		}
	}
}
