// WAP to implement a BFS traversal technique in a Graph.

import java.util.*;

public class _48 {

	public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
		int v = adj.size();
		ArrayList<Integer> res = new ArrayList<>();
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[v];
		int source = 0;

		visited[source] = true;
		queue.add(source);

		while (!queue.isEmpty()) {
			int curr = queue.poll();
			res.add(curr);

			for (int x : adj.get(curr)){
				if (!visited[x]) {
					visited[x] = true;
					queue.add(x);
				}
			}
		}
		return res;
	}


	public static void main(String[] args) {
		// [[1,2], [0,2,3], [0,1,4], [1,4], [2,3]]
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		adj.add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.add(new ArrayList<>(Arrays.asList(0, 2, 3)));
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));
        adj.add(new ArrayList<>(Arrays.asList(1,4)));
        adj.add(new ArrayList<>(Arrays.asList(2,3)));

		ArrayList<Integer> ans = bfs(adj);

		for(int i : ans) {
			System.out.print(i + " ");
		}
	}
}