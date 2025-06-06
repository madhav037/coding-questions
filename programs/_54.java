// You have n super washing machines on a line. Initially, each washing
// machine has some dresses or is empty. For each move, you could choose any
// m (1 <= m <= n) washing machines, and pass one dress of each washing
// machine to one of its adjacent washing machines at the same time. Given an
// integer array machine representing the number of dresses in each washing
// machine from left to right on the line, return the minimum number of moves
// to make all the washing machines have the same number of dresses. If it is
// not possible to do it, return -1. Input: machines = [1,0,5] Output: 3
// Explanation:
// 1st move: 1 0 <-- 5 => 1 1 4
// 2nd move: 1 <-- 1 <-- 4 => 2 1 3
// 3rd move: 2 1 <-- 3 => 2 2 2
// Input: machines = [0,3,0]
// Output: 2
// Explanation:
// 1st move: 0 <-- 3 0 => 1 2 0
// 2nd move: 1 2 --> 0 => 1 1 1

public class _54 {

    static public int findMinMoves(int[] machines) {
        int total = 0, n = machines.length;

        for (int dress : machines) total += dress;
        if (total % n != 0) return -1;

        int target = total / n;
        int maxMoves = 0;
        int load = 0;

        for (int i = 0; i < n; i++) {
            int diff = machines[i] - target;
            load += diff;
            maxMoves = Math.max(maxMoves, Math.max(Math.abs(load), diff));
        }

        return maxMoves;
    }

    public static void main(String[] args) {

        System.out.println(findMinMoves(new int[]{1, 0, 5}));
        System.out.println(findMinMoves(new int[]{0, 3, 0}));
        System.out.println(findMinMoves(new int[]{0, 2, 0}));
    }
}
