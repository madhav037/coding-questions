// WAP to count the degree of each vertex in a directed Graph (where graph is
// created using edges means if user input 1 2 then there is a directed edge
// from node 1 to node 2 user enter -1 for stop entering the edge)

import java.util.*;

public class _50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> inDegree = new HashMap<>();
        Map<Integer, Integer> outDegree = new HashMap<>();

        System.out.println("Enter edges (from to). Enter -1 to stop:");

        while (true) {
            int from = sc.nextInt();
            if (from == -1) break;
            int to = sc.nextInt();

            outDegree.put(from, outDegree.getOrDefault(from, 0) + 1);
            inDegree.put(to, inDegree.getOrDefault(to, 0) + 1);

            inDegree.putIfAbsent(from, inDegree.getOrDefault(from, 0));
            outDegree.putIfAbsent(to, outDegree.getOrDefault(to, 0));
        }

        System.out.println("\nVertex\tIn-Degree\tOut-Degree");
        Set<Integer> allVertices = new HashSet<>();
        allVertices.addAll(inDegree.keySet());
        allVertices.addAll(outDegree.keySet());

        for (int vertex : allVertices) {
            System.out.println(vertex + "\t" + inDegree.get(vertex) + "\t\t" + outDegree.get(vertex));
        }
    }
}