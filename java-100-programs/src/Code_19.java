// WAP to sort an Array using Bucket sort.
public class Code_19 {
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        int[] bucket = new int[101];
        for (int i = 0; i < n; i++) {
            bucket[arr[i]]++;
        }
        System.out.println("Sorted array: ");
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }
}