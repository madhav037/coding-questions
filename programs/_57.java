// Write a Function that returns either 1 or 0 based on following condition if
// the array is in ascending order and occurrence of that number at least 3
// then it should return 1 otherwise it should return 0. e.g. if A=
// [1,1,1,2,2] it should return 0 if A=[1,1,1,3,3,3,3] it should return 1 if
// A=[2,2,2,1,1,1] it should return 0

public class _57 {

	public static boolean checkConditions(int[] arr) {
		int curr = arr[0], occurence = 1;
		for (int i = 1; i < arr.length; i++) {
			if (curr == arr[i]) {
				occurence++;
			}
			else if (curr > arr[i]) {
				return false;
			}
			else if (curr < arr[i]) {
				if (occurence < 3) return false;
				occurence = 1;
				curr = arr[i];
			}
		}
		return occurence < 3 ? false : true;
	}

	public static void main(String[] args) {
		int[] arr = {2,2,2,1,1,1};

		System.out.print(checkConditions(arr));
	}
}