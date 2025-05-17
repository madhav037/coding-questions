// You are given several boxes with different colors represented by different
// positive numbers. You may experience several rounds to remove boxes until
// there is no box left. Each time you can choose some continuous boxes with
// the same color (i.e., composed of k boxes, k >= 1), remove them and get
// k * k points. Return the maximum points you can get. Input: boxes =
// [1,3,2,2,2,3,4,3,1] Output: 23 Explanation:[1, 3, 2, 2, 2, 3, 4, 3, 1]
// ----> [1, 3, 3, 4, 3, 1] (3*3=9 points)
// ----> [1, 3, 3, 3, 1] (1*1=1 points)
// ----> [1, 1] (3*3=9 points)
// ----> [] (2*2=4 points)

public class _55_dp_hard {

	private static int[][][] dp;

	public static int removeBoxes(int[] boxes) {
		int n = boxes.length;
		dp = new int[n][n][n];
		return dfs(boxes, 0, n-1, 0);
	}

	private static int dfs(int[] boxes, int l, int r, int k) {
		if (l > r) return 0;
		if (dp[l][r][k] != 0) return dp[l][r][k];

		while (r > l && boxes[r] == boxes[r - 1]) {
            r--;
            k++;
        }

		// Option 1: Remove boxes[r] and its k same-color extra boxes now
        dp[l][r][k] = dfs(boxes, l, r - 1, 0) + (k + 1) * (k + 1);

        // Option 2: Try to merge boxes of the same color earlier
        for (int i = l; i < r; i++) {
            if (boxes[i] == boxes[r]) {
                dp[l][r][k] = Math.max(
                    dp[l][r][k],
                    dfs(boxes, l, i, k + 1) + dfs(boxes, i + 1, r - 1, 0)
                );
            }
        }

        return dp[l][r][k];
	}

	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 2, 2, 3, 4, 3, 1};

		System.out.print(removeBoxes(arr));
	}
}