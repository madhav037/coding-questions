// WAP to implement a DFS traversal technique in a Graph.
import java.util.*;

public class _49 {

	private static void dfsRec(ArrayList<ArrayList<Integer> > adj, boolean[] visited, int s, ArrayList<Integer> res) {
        visited[s] = true;
        res.add(s);

        for (int i : adj.get(s)) {
            if (!visited[i]) {
                dfsRec(adj, visited, i, res);
            }
        }
    }

	public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
		boolean[] visited = new boolean[adj.size()];
		ArrayList<Integer> res = new ArrayList<>();
		dfsRec(adj, visited, 0, res);
		return res;
	}

	public static void main(String[] args) {
		// [[2,3,1], [0], [0,4], [0], [2]]
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		adj.add(new ArrayList<>(Arrays.asList(2,3,1)));
		adj.add(new ArrayList<>(Arrays.asList(0)));
		adj.add(new ArrayList<>(Arrays.asList(0,4)));
		adj.add(new ArrayList<>(Arrays.asList(0)));
		adj.add(new ArrayList<>(Arrays.asList(2)));

		ArrayList<Integer> ans = dfs(adj);

		for(int i : ans) {
			System.out.print(i + " ");
		}
	}
}