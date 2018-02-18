package sort;

public class MergeSort {
	
	public static void mergesort(int[] arr) {
		mergesort(arr, new int[arr.length], 0, arr.length -1);
	}
	
	static void mergesort(int[] arr, int[] temp, int leftStart, int rightEnd) {
		if(leftStart >= rightEnd) {
			return;
		}
		int mid = (leftStart+rightEnd)/2;
		mergesort(arr, temp, leftStart, mid );
		mergesort(arr, temp, mid+1, rightEnd);
		mergeHalves(arr, temp, leftStart, rightEnd);
	}
	
	static void mergeHalves(int[] arr, int[] temp, int leftStart, int rightEnd) {
		int mid = (leftStart+rightEnd)/2;
		int leftEnd = mid;
		int rightStart = mid+1;
		int i= leftStart;
		int left = leftStart;
		int right = rightStart;
		while(left <= leftEnd && right <= rightEnd ) {
			if(arr[left] < arr[right]) {
				temp[i++] = arr[left++];
			} else {
				temp[i++] = arr[right++];
			}
		}
		
		while(left <= leftEnd) {
			temp[i++] = arr[left++];
		}
		while(right <= rightEnd) {
			temp[i++] = arr[right++];
		}
		for(int n = leftStart; n <= i-1; n++) {
			arr[n] = temp[n];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 5, 5, 4, 3, 2, 1};
		mergesort(array);
		for(int i: array)
		System.out.println(i);
	}

}
