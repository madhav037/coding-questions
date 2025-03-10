// WAP to find a sum of even number into 1D array.

import java.util.ArrayList;
import java.util.Scanner;

public class Code_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int sum = 0;

        System.out.println("To end enter -1");
        while (true) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            arr.add(n);
        }

        for (Integer i : arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of even numbers: " + sum);

        sc.close();
    }
}
