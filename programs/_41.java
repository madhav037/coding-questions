// You are given an integer num. Rearrange the digits of num such that its
// value is minimized and it does not contain any leading zeros. Return the
// rearranged number with minimal value. Note that the sign of the number
// does not change after rearranging the digits. Input: num = 310 Output: 103
// Explanation: The possible arrangements for the digits of 310 are 013, 031,
// 103, 130, 301, 310. The arrangement with the smallest value that does not
// contain any leading zeros is 103.


public class _41 {
	public static void main(String[] args) {
		int n = 310, count = 0;
		int temp = n;
		while (temp > 0) {
			count++;
			temp /= 10;
		}

		int[] arr = new int[count];
		temp = n;
		while(temp > 0) {
			arr[--count] = temp % 10;
			temp /= 10;
		}


		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;

			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j-=1;
			}
			arr[j+1] = key;
		}

		if (arr[0] == 0) {
			int i = 0;
			while(arr[i] == 0) {
				i++;
			}
			temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
		}

		int res = 0;
		for(int i = 0; i < arr.length; i++) {
			res += arr[i]*Math.pow(10, arr.length-i-1);
		}

		System.out.print(res);
	}
}
