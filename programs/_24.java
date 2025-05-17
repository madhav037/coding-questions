// WAP to delete an element from array specified by user. if element is not
// found print a message “Element is not found” (do not take a new array).

public class _24 {
	public static void main(String[] args) {
		int[] arr = {2,3,4,6,7,8,9,1};
		int element = 10;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element){
				flag = true;
				continue;
			}
			if (flag) {
				arr[i-1] = arr[i];
			}
		}
		arr[arr.length-1] = 0;

		if (!flag) {
			System.out.print("Element not found");
		}else {
			for (int i = 0; i < arr.length-1; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}