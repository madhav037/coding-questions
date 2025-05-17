// WAP to find a summation of a digit of a given number. (Iterative and recursive)

public class _5 {
	public static void main(String[] args) {
		int n = 456;

		System.out.println("itterative");
		System.out.println(itterative(n));

		System.out.println("recursive");
		System.out.println(recursive(n));
	}

	private static int itterative(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}
		return sum;
	}

	private static int recursive(int n) {
		if ( n == 0 ) {
			return 0;
		}
		int rem = n % 10;
		n/= 10;
		return rem + recursive(n);
	}
}