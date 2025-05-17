// WAP to find a Factor of a given number (iterative and recursive)

public class _3 {
	public static void main(String[] args) {
		int n = 6;

		System.out.println("itterative");
		itterative(n);

		System.out.println("recursive");
		recursive(n, 1);
	}

	private static void itterative(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		return;
	}

	private static void recursive(int n, int i) {
		if (n+1 == i) {
			return;
		}
		if (n % i == 0){
			System.out.println(i);
		}
		recursive(n, i+1);
	}
}