// WAP to Convert a Decimal to Octal and Vice versa.

public class _46 {

	public static String deciToOctal(int deci) {
		String oct = "";

		while(deci > 0) {
			int rem = deci % 8;
			oct += rem;
			deci /= 8;
		}

		return oct;
	}

	public static int OctalToDeci(String oct) {
		int deci = 0;
		int power = 0;
		for (int i = oct.length()-1; i >= 0; i--){
			char ch = oct.charAt(i);
			int digit = ch - '0';
			deci += digit * Math.pow(8,power++);
		}
		return deci;
	}

	public static void main(String[] args) {
		int deci = 9;
		System.out.println(deciToOctal(deci));
		System.out.println(OctalToDeci(deciToOctal(deci)));
	}
}