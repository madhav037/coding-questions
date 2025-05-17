// WAP to sort an Array using Selection sort.

public class _18_selection_sort {
	public static void main(String[] args) {
		int[] arr = {1,3,7,2,9,50,1,6,34,6};

		for (int i = 0; i < arr.length; i++){
			int min_index = i;

			for(int j = i+1; j < arr.length; j++) {
				if (arr[min_index] > arr[j]) {
					min_index = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}

		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}