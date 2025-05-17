// WAP to convert a Binary to Decimal.

public class _26 {
	public static void main(String[] args) {
		int bin = 1010;
		int deci = 0, count = 0;
		while (bin > 0) {
			int rem = bin % 10;
			deci += rem * Math.pow(2, count);
			count++;
			bin /= 10;
		}
		System.out.print(deci);
	}
}