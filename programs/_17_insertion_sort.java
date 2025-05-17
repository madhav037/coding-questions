// WAP to sort an Array using insertion sort.

public class _17_insertion_sort {
	public static void main(String[] args) {
		int[] arr = {1,3,7,2,9,50,1,6,34,6};

		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i-1;

			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j -= 1;
			}
			arr[j+1] = key;
		}

		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}