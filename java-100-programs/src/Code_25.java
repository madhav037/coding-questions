// WAP to check weather number is present in array or not (using recursion only) and the function’s syntax is given below
// Int isInArray(int a[],int m);
// Where int a[] is Array of integer and m is element to be searched.
public class Code_25 {
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        int ans = isInArray(arr,25);
        if (ans == 1) {
            System.out.println("Element is present in the array");
        }else {
            System.out.println("Element is not present in the array");
        }
    }

    public static int isInArray(int a[], int m) {
        return isInArrayHelper(a, m, 0);
    }
    public static int isInArrayHelper(int a[], int m, int i) {
        if (a[i] == m) {
            return 1;
        }
        else if (i >= a.length-1) {
            return 0;
        }
        else {
            return isInArrayHelper(a, m, i+1);
        }
    }
}
