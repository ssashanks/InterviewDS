package test;

public class MergeSort {
	
	static void mergesort(int []arr) {
		mergesort(arr, 0, arr.length-1, new int[arr.length]);
	}
	
	private static void mergesort(int[] arr, int left, int right, int[] temp) {
		if(left >=right) {
			return;
		}
		int mid = (left+right)/2;
		mergesort(arr, left, mid, temp);
		mergesort(arr, mid+1, right, temp);
		mergeHalves(arr, left, right, temp);
	}
	

	private static void mergeHalves(int[] arr, int left, int right, int[] temp) {
		if(left >=right) {
			return;
		}
		int mid = (left+right)/2;
		int i = left;
		int j = mid+1;
		int idx = left;
		while( i <= mid && j <= right) {
			if(arr[i] < arr[j]) {
				temp[idx] = arr[i];
				i++;
			} else {
				temp[idx] = arr[j];
				j++;
			}
			idx++;
		}
		while(i<=mid) {
			temp[idx++] = arr[i++];
		}
		while(j<=right) {
			temp[idx++] = arr[j++];
		}
		for(int k = left; k <= right; k++) {
			arr[k] = temp[k];
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
		int[] arr= { 1, 2, 7, 3, 4};
		mergesort(arr);
		for(int i: arr) {
			System.out.println(i);
		}
	}
}
