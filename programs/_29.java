// WAP to find a quotient and reminder of 2 number (bigger number should be
// divided by lower number) and you are not allowed to use a division and
// quotient operator.

public class _29 {
	public static void main(String[] args) {
		int a = 45;
		int b = 5;
		int q = 1, rem = 0;

		if (a < b ) {
			int temp = a;
			a = b;
			b = temp;
		}

		while(true) {
			if (q*b == a){
				System.out.print("q = " + q + " r = " + 0 );
				break;
			}
			else if (q*b < a) {
				rem = a - q*b;
				q++;
			}
			else {
				System.out.print("q = " + (q-1) + " r = " + rem);
				break;
			}
		}
	}
}