// WAP to find a factorial of a given integer (iterative and recursive)

public class _4 {
	public static void main(String[] args) {
		int n = 6;

		System.out.println("itterative");
		System.out.println(itterative(n));

		System.out.println("recursive");
		System.out.println(recursive(n));
	}

	private static int itterative(int n) {
		int fac = 1;
		for (int i = 1; i <= n; i++) {
			fac *= i;
		}
		return fac;
	}

	private static int recursive(int n) {
		if (n == 1) {
			return 1;
		}
		return n * recursive(n-1);
	}
}