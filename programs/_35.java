// Given two integer arrays nums1 and nums2, return an array of their
// intersection. Each element in the result must appear as many times as it
// shows in both arrays and you may return the result in sorted order.

public class _35 {
	public static int[] sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j-=1;
			}
			arr[j+1] = key;
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] nums1 = {2,4,1,6,3,8,0,6};
		int[] nums2 = {2,6,0,6};

		nums1 = sort(nums1);
		nums2 = sort(nums2);

		int i = 0, j = 0;
		while(i < nums1.length && j < nums2.length) {
			if (nums1[i] == nums2[j]) {
				System.out.print(nums1[i] + " ");
				i++;
				j++;
			}
			else if (nums1[i] < nums2[j]) {
				i++;
			}else {
				j++;
			}
		}
	}
}