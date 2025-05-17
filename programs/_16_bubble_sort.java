// WAP to sort an Array using Bubble sort.

public class _16_bubble_sort {
	public static void main(String[] args) {
		int[] arr = {1,3,7,2,9,50,1,6,34,6};

		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}