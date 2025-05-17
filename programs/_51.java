// In a Given BST (Binary) search tree find the 2nd min value.

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class _51 {

 	static Integer secondMin = null;
 	static int count = 0;

	public static void findSecondMin(Node root) {
		inorder(root);
		if (secondMin == null) {
			System.out.print("make tree big please!");
			return;
		}
		System.out.print(secondMin);
		return;
	}

	private static void inorder(Node root) {
		if (root == null || secondMin != null) return;

		inorder(root.left);

		count++;
		if (count == 2) {
			secondMin = root.data;
			return;
		}

		inorder(root.right);
	}

	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);

        findSecondMin(root);
	}
}