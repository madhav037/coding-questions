// WAP to demerge a doubly linked list into 2 list, one list will hold the odd
// numbers while another list will hold only even number.

class ListNode {
	int data;
	ListNode left;
	ListNode right;

	ListNode(int data) {
		this.data = data;
		left = right = null;
	}
}

public class _59 {

	static ListNode odd;
	static ListNode even;

	public static ListNode insertData(int[] elements, ListNode root) {
	    if (elements.length == 0) return root;

	    ListNode temp;
	    if (root == null) {
	        root = new ListNode(elements[0]);
	        temp = root;
	        for (int i = 1; i < elements.length; i++) {
	            ListNode newNode = new ListNode(elements[i]);
	            temp.right = newNode;
	            newNode.left = temp;
	            temp = newNode;
	        }
	    } else {
	        temp = root;

	        while (temp.right != null) {
	            temp = temp.right;
	        }

	        for (int i = 0; i < elements.length; i++) {
	            ListNode newNode = new ListNode(elements[i]);
	            temp.right = newNode;
	            newNode.left = temp;
	            temp = newNode;
	        }
	    }
	    return root;
	}

	public static void displayList(ListNode root) {
		if (root == null) return;

		ListNode temp = root;
		System.out.println("Node                  left              data         right");
		while (temp != null) {
			System.out.println(temp + " : [ " + (temp.left == null ? "null             " : temp.left) + " " + temp.data + "     " + (temp.right == null ? "null             " : temp.right) + " ]");
			temp = temp.right;
		}
	}

	public static void demerge(ListNode root) {
		if (root == null) return;

		ListNode temp = root;
		ListNode tempOdd = null;
		ListNode tempEven = null;

		while(temp != null) {
			if (temp.data % 2 == 0) {
				if (even == null) {
					even = new ListNode(temp.data);
					tempEven = even;
				}else {
					ListNode newNode = new ListNode(temp.data);
					tempEven.right = newNode;
					tempEven = tempEven.right;
				}
			}else {
				if (odd == null) {
					odd = new ListNode(temp.data);
					tempOdd = odd;
				}else {
					ListNode newNode = new ListNode(temp.data);
					tempOdd.right = newNode;
					tempOdd = tempOdd.right;
				}
			}
			temp = temp.right;
		}
	}


	public static void main(String[] args) {
		ListNode root = null;
		int[] elements = {1,2,3,4,5,6,7,8,9,10};
		root = insertData(elements, root);

		displayList(root);

		demerge(root);

		System.out.println("\n\n\n odd ");
		displayList(odd);
		System.out.println("\n\n\n even ");
		displayList(even);

	}
}