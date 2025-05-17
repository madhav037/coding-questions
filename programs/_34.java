// Print a Leaf Nodes in Binary search tree.

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class _34 {
    Node root;

    Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (data < node.data)
            node.left = insert(node.left, data);
        else
            node.right = insert(node.right, data);

        return node;
    }

    void printLeafNodes(Node node) {
        if (node == null)
            return;

        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
            return;
        }

        printLeafNodes(node.left);
        printLeafNodes(node.right);
    }

    public static void main(String[] args) {
        _34 tree = new _34();
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }

        System.out.print("Leaf nodes: ");
        tree.printLeafNodes(tree.root);
    }
}
