// WAP to find Max, Min, Average of n numbers, n should be taken from user and
// all n value should be taken from user (Note that you are not allowed to
// use an array for this)
import java.util.Scanner;

public class _12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, count = n;
		float avg = 0.0f;
		while(n > 0) {
			int num = sc.nextInt();
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
			avg += num;
			n--;
		}
		avg = avg / count;
		System.out.println("min : " + min);
		System.out.println("max : " + max);
		System.out.println("avg : " + avg);
	}
}