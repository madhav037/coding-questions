// WAP to convert an Octal into hexa-decimal.

public class _44 {
	public static String octalToBinary(int octal) {
		String bin = "";
		while(octal > 0) {
			int rem = octal % 10;
			String digitBin = "";
			while(rem > 0) {
				int r = rem % 2;
				digitBin += r;
				rem /= 2;
			}
			if (digitBin.length() != 3) {
				while(digitBin.length() != 3) {
					digitBin += "0";
				}
			}
			bin += digitBin;
			octal /= 10;
		}

		return new StringBuilder(bin).reverse().toString();
	}

	public static String binaryToHexaDecimal(String bin) {
		String[] table = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
		String ans = "";
		if (bin.length() % 4 != 0){
			while (bin.length() % 4 != 0) {
				bin = "0" + bin;
			}
		}

		for (int i = 0; i < bin.length(); i+= 4) {
			String sub = bin.substring(i, i+4);
			ans += table[Integer.parseInt(sub,2)];
		}
		return ans;
	}

	public static void main(String[] args) {
		int octal = 345;
		System.out.print(binaryToHexaDecimal(octalToBinary(octal)));

	}
}