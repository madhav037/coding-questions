// WAP to find a Fibonacci series up to n terms (n is entered by user) (iterative and recursive)
import java.util.Scanner;

public class _7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("itterative");
		itterative(n);

		System.out.println("\nrecursive");
		System.out.print(0 + " " + 1 + " ");
		recursive(n, 0, 1);
	}

	private static void itterative(int n) {
		int l = 0;
		int sl = 1;
		System.out.print(l + " " + sl + " ");
		while(n > 0) {
			int tl = l + sl;
			System.out.print(tl + " ");
			l = sl;
			sl = tl;
			n--;
		}
	}

	private static void recursive(int n, int l, int sl) {
		if ( n == 0){
			return;
		}
		int tl = l + sl;
		System.out.print(tl + " ");
		n-=1;
		recursive(n, sl, tl);
	}
}