// WAP to enter an element at specific position into array. (Do not take a new array)

public class _23 {
	public static void main(String[] args) {
		int[] arr = {2,5,7,8,9,10,12, 0};
		int pos = 4;
		int element = 1, temp = 0;

		pos-=1;

		for (int i = 0; i < arr.length; i++) {
			if (i < pos) continue;
			else if(i == pos) {
				temp = arr[pos];
				arr[pos] = element;
			}
			else {
				int temp_2 = arr[i];
				arr[i] = temp;
				temp = temp_2;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}