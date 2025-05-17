// WAP to implement a sliding window problem. You are given an array of
// integers nums, there is a sliding window of size k which is moving from
// the very left of the array to the very right. You can only see the k
// numbers in the window. Each time the sliding window moves right by one
// position. Input: nums = [1,3, -1, -3,5,3,6,7], k = 3 Output:
// [3,3,5,5,6,7] Explanation:
// Window position      Max
// ---------------     -----
// [1 3 -1] -3 5 3 6 7   3
// 1 [3 -1 -3] 5 3 6 7   3
// 1 3 [-1 -3 5] 3 6 7   5
// 1 3 -1 [-3 5 3] 6 7   5
// 1 3 -1 -3 [5 3 6] 7   6
// 1 3 -1 -3 5 [3 6 7]   7

public class _42 {
	public static void main(String[] args) {
		int[] arr = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		int[] max_arr = new int[arr.length - k + 1];

		for (int i = 0; i < arr.length - k + 1; i++) {
			int j = k, max_int = Integer.MIN_VALUE;
			while (j > 0) {
				if (max_int < arr[j+i-1]){
					max_int = arr[j+i-1];
				}
				j--;
			}
			max_arr[i] = max_int;
		}

		for (int i : max_arr) {
			System.out.print(i + " ");
		}
	}
}