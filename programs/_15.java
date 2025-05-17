// WAP to convert a Decimal number to BCD.

public class _15 {
	public static void main(String[] args) {
		int deci = 45;
		String bcd = "";
		while (deci > 0) {
			int rem = deci % 10;
			bcd += binary(rem);
			bcd += " ";
			deci /= 10;
		}
		bcd = new StringBuilder(bcd).reverse().toString();
		System.out.print(bcd);
	}

	private static String binary(int n) {
		String s = "";
		while(n > 0) {
			int rem = n % 2;
			s += rem;
			n /= 2;
		}
		return s;
	}
}