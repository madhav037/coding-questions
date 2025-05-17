// Write a program to take 2 numbers from user and find out the distance between them.
// (How to compute distance: If number is 10 and 18 then 10 in binary 1010 and 18
// in binary is 10010 and distance is 2 means total number of bits that needs to
// be changed when 10 is converted into 18 or 18 is converted into 10, do not
// convert the number into binary)

import java.util.Scanner;

public class _53 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		int c = a ^ b;
		while (c > 0) {
			if ((c&1) == 1) count++;
			c = c>>1;
		}
		System.out.print(count);

	}
}