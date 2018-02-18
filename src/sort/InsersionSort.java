package sort;

public class InsersionSort {

	
	public static void insersionSort(int[] arr) {
		
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
			
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 6, 5, 4, 3, 2, 7};
		insersionSort(arr);
		for(int i: arr) {
			System.out.println(i);
		}
	}

}
