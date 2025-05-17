// WAP to find a power a^b (without using power and multiplication operation).

public class _20 {
	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		int ans = 0;

		for (int i = 0; i < b; i++) {
			ans += a<<1;
		}

		System.out.print(ans);
	}
}