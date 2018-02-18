package sort;

public class QuickSort {

	static void quicksort(int[] arr) {
		quicksort(arr, 0, arr.length-1);
	}
	
	static void quicksort(int arr[], int left, int right) {
		if(left >= right) {
			return;
		}
		int pivot = arr[(left+right)/2];
		int partition = partition(arr, left, right, pivot);
		quicksort(arr, left, partition-1);
		quicksort(arr, partition, right);
		
	}
	
	static void swap (int [] arr, int a, int b) {
		arr[a] = arr[a] + arr[b];
		arr[b] = arr[a] - arr[b];
		arr[a] = arr[a] - arr[b];
	}
	
	static int partition(int[] arr, int left, int right, int pivot) {
		while(left <= right) {
			while( arr[left] < pivot) {
				left++;
			}
			while( arr[right] > pivot) {
				right--;
			}
			if(left <= right) {
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		return left;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 15,5,6,7,8,9};
		quicksort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
