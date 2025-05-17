// Given the root of a binary search tree (BST) with duplicates, return all
// the node(s) (i.e., the most frequently occurred element) in it
// input = [1, null, 2, 2]
// output = [2]

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class _61 {

    private static Node createBST(Integer[] arr) {
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                root = insert(root, arr[i]);
            }
        }
        return root;
    }

    private static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static ArrayList<Integer> mostFrequent(Node root) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        traverse(root, freqMap);

        int maxFreq = 0;
        for (int freq : freqMap.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        ArrayList<Integer> output = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                output.add(entry.getKey());
            }
        }

        return output;
    }

    private static void traverse(Node root, HashMap<Integer, Integer> freqMap) {
        if (root == null) return;

        freqMap.put(root.data, freqMap.getOrDefault(root.data, 0) + 1);

        traverse(root.left, freqMap);
        traverse(root.right, freqMap);
    }

    public static void main(String[] args) {
        Integer[] arr = {1, null, 3, 2, 3, 2, 4 };
        Node root = createBST(arr);

        ArrayList<Integer> output = mostFrequent(root);
        System.out.print("Most frequent values: ");
        for (int i : output) {
            System.out.print(i + " ");
        }
    }
}
