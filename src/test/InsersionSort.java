package test;

public class InsersionSort {
	
	static void insersionsort(int []arr) {
		for(int i=0; i< arr.length; i ++) {
			int j = i-1;
			int val = arr[i];
			while(j >= 0) {
				if(arr[j] > val) {
					swap(arr, j, j+1);
					j--;
				} else {
					break;
				}
			}
			if(j>=0) {
				arr[j] = val;
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
		int[] arr= { 10, -1, 7, 3, 4, 19, 9};
		insersionsort(arr);
		for(int i: arr) {
			System.out.println(i);
		}
	}
}
