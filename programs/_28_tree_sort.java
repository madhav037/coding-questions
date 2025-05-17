// WAP to sort an Array using Tree sort.

class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

public class _28_tree_sort {

    TreeNode root;

    // Insert a node into the BST
    TreeNode insert(TreeNode node, int data) {
        if (node == null) {
            return new TreeNode(data);
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }

        return node;
    }

    // In-order traversal to fill sorted array
    int index = 0;
    void inorder(TreeNode node, int[] arr) {
        if (node != null) {
            inorder(node.left, arr);
            arr[index++] = node.data;
            inorder(node.right, arr);
        }
    }

    // Tree sort function
    void treeSort(int[] arr) {
        root = null;
        for (int value : arr) {
            root = insert(root, value);
        }

        index = 0;
        inorder(root, arr);
    }

    // Main method to test
    public static void main(String[] args) {
        TreeSort ts = new TreeSort();
        int[] array = {5, 3, 7, 2, 8, 1, 4};

        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        ts.treeSort(array);

        System.out.println("\nSorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
