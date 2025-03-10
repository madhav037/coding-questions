// WAP to delete an element from array specified by user. if element is not found print a message “Element is not found” (do not take a new array).
public class Code_24 {
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        int element = 12;
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                for (int j = i; j < n - 1; j++) {
                    arr[i] = arr[i + 1];
                }
                n--;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
