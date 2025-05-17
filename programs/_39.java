// Given an array, rotate the array to the right by k steps, where k is non-negative.
// Example 1:
// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 step to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]

public class _39 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;
		int[] newArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArr[( i + k ) % arr.length] = arr[i];
		}

		for(int i = 0; i < arr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}
}

/* in-place
public class _39 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = arr.length;

        k = k % n; // In case k > n
        int count = 0;

        for (int start = 0; count < n; start++) {
            int current = start;
            int prev = arr[start];

            do {
                int next = (current + k) % n;
                int temp = arr[next];
                arr[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }

        // Print rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
*/