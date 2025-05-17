// Write a program to implement job sequencing algorithm using greedy approach.

import java.util.*;

public class _60 {
	
    public static ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
	    int n = deadline.length;
	    int cnt = 0;
	    int totProfit = 0;

	    ArrayList<int[]> jobs = new ArrayList<>();
	    for (int i = 0; i < n; i++) {
	        jobs.add(new int[]{profit[i], deadline[i]});
	    }

	    jobs.sort((a, b) -> Integer.compare(b[0], a[0]));

	    int[] slot = new int[n];

	    for (int i = 0; i < n; i++) {
	        int start = Math.min(n, jobs.get(i)[1]) - 1;
	        for (int j = start; j >= 0; j--) {

	            if (slot[j] == 0) {
	                slot[j] = 1;
	                cnt++;
	                totProfit += jobs.get(i)[0];
	                break;
	            }
	        }
	    }

	    ArrayList<Integer> result = new ArrayList<>();
	    result.add(cnt);
	    result.add(totProfit);
	    return result;
    }

    public static void main(String[] args) {
        int[] deadline = {2, 1, 2, 1, 1};
        int[] profit = {100, 19, 27, 25, 15};

        ArrayList<Integer> ans = jobSequencing(deadline, profit);
        System.out.println(ans.get(0) + " " + ans.get(1));
    }
}