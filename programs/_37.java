// WAP to sort a number in ascending order in singly linked list.

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class _37 {

    public static Node insert(int arr[], Node head) {
        Node root = head;
        for (int i = 0; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            root.next = newNode;
            root = root.next;
        }
        return head;
    }

    public static void traverse(Node head) {
        Node root = head.next;
        while (root != null) {
            System.out.print(root.data + " ");
            root = root.next;
        }
        System.out.println();
    }

    public static Node mergeSort(Node head) {
        if (head == null || head.next == null)
            return head;

        Node mid = getMiddle(head);
        Node nextToMid = mid.next;
        mid.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(nextToMid);

        return merge(left, right);
    }

    public static Node merge(Node a, Node b) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        tail.next = (a != null) ? a : b;
        return dummy.next;
    }

    public static Node getMiddle(Node head) {
        if (head == null)
            return head;

        Node slow = head, fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3, 6, 5, 8, 7, 9, 6};
        Node head = new Node(0);
        head = insert(arr, head);

        System.out.print("Original List: ");
        traverse(head);

        head.next = mergeSort(head.next);

        System.out.print("Sorted List: ");
        traverse(head);
    }
}
