// Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.
// e.g.
// Input:
// N = 4, K = 6
// arr[] = {1, 5, 7, 1}
// Output: 2
// Explanation:
// arr[0] + arr[1] = 1 + 5 = 6
// and arr[1] + arr[3] = 5 + 1 = 6.

import java.util.Set;
import java.util.HashSet;

public class _43 {
	public static void main(String[] args) {
		int[] arr = {1,5,7,1};
		int k = 6, count = 0;
		Set<Integer> seen = new HashSet<>();

		for (int i = 0; i < arr.length; i++){
			int element = arr[i];
			int comp = Math.abs(k - element);
			if (seen.contains(element) && seen.contains(comp)) {
				count++;
			}
			seen.add(element);
			seen.add(comp);
		}
		System.out.print(count);
	}
}