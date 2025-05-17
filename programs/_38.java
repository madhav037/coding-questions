// WAP to add an element into already sorted singly linked list.

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class _38 {

     public static Node add(Node head, int element) {
        Node newNode = new Node(element);
        Node current = head;

        while (current.next != null && current.next.data < element) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        return head;
    }

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

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9};
        int element = 6;
        Node head = new Node(0);
        head = insert(arr, head);
        head = add(head, element);
        traverse(head);
    }
}
