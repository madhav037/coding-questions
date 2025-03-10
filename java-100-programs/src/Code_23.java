// WAP to enter an element at specific position into array. (Do not take a new array)

import java.util.ArrayList;

public class Code_23 {
    public static void main(String[] args) {
        int[] arr1 = new int[8];
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(64);
        arr.add(34);
        arr.add(25);
        arr.add(12);
        arr.add(22);
        arr.add(11);
        arr.add(90);
        int pos = 3;
        int element = 100;
        
        for (int i = 0; i < 7; i++) {
            arr1[i] = arr.get(i);
        }
        
        arr.add(pos-1, element); 
        System.out.println(arr);

        int n = arr1.length;
        int prev = 0;
        for (int i = 0; i < n; i++) {
            if (i == pos-1) {
                prev = arr1[i];
                arr1[i] = element;
            }
            if (i > pos-1) {
                int temp = arr1[i];
                arr1[i] = prev;
                prev = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}