package sort;

public class SelectionSort {

	private static void swap(int[] arr, int a, int b) {
		arr[a] = arr[a] + arr[b];
		arr[b] = arr[a] - arr[b];
		arr[a] = arr[a] - arr[b];
	}
	
	public static void selectionsort(int[] arr) {
		int index = 0;
		for(int i = 0; i < arr.length-1; i++) {
			int min = Integer.MAX_VALUE;
			int minIndex = i;
			for(int j = i; j < arr.length-1; j++) {
				if(min > arr[j]) {
					min = arr[j];
					minIndex = j;
				}
			}
			//System.out.println(min +"-" + minIndex);
			if(i != minIndex) {
				swap(arr, i, minIndex);
			}
			
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 6, 5, 4, 3, 2, 7};
		selectionsort(arr);
		for(int i: arr) {
			System.out.println(i);
		}
	}

}
