// WAP to convert a Decimal to Binary.

public class _30 {
	public static void main(String[] args) {
		int deci = 10;
		String bin = "";
		while(deci > 0) {
			int rem = deci % 2;
			bin += rem;
			deci /= 2;
		}
		bin = new StringBuilder(bin).reverse().toString();
		System.out.print(bin);
	}
}