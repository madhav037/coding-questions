// WAP to Convert a Decimal to Hexa-decimal and vice versa.

import java.util.HashMap;

public class _47 {
	static HashMap<Character,String> table = new HashMap<>();
	static HashMap<String,Character> revTable = new HashMap<>();
	static {
		table.put('0', "0000"); table.put('9', "1001");
		table.put('1', "0001"); table.put('A', "1010");
		table.put('2', "0010"); table.put('B', "1011");
		table.put('3', "0011"); table.put('C', "1100");
		table.put('4', "0100"); table.put('D', "1101");
		table.put('5', "0101"); table.put('E', "1110");
		table.put('6', "0110"); table.put('F', "1111");
		table.put('7', "0111"); table.put('8', "1000");

		revTable.put("0000", '0'); revTable.put("1001", '9');
		revTable.put("0001", '1'); revTable.put("1010", 'A');
		revTable.put("0010", '2'); revTable.put("1011", 'B');
		revTable.put("0011", '3'); revTable.put("1100", 'C');
		revTable.put("0100", '4'); revTable.put("1101", 'D');
		revTable.put("0101", '5'); revTable.put("1110", 'E');
		revTable.put("0110", '6'); revTable.put("1111", 'F');
		revTable.put("0111", '7'); revTable.put("1000", '8');
	}

	public static String deciToHexa(int deci) {
		String hexa = "";
		String bin = "";
		while (deci > 0) {
			int rem = deci % 2;
			bin += rem;
			deci /= 2;
		}
		bin = new StringBuilder(bin).reverse().toString();

		if (bin.length() % 4 != 0) {
			int padding = bin.length() % 4;
			bin = "0".repeat(padding) + bin;
		}

		for (int i = 0; i < bin.length(); i += 4) {
			String sub = bin.substring(i, i+4);
			hexa += revTable.get(sub);
		}
		return hexa;
	}

	public static int hexaToDeci(String hexa) {
		int deci = 0;
		String bin = new String();
		for (char ch : hexa.toCharArray()) {
			bin += table.get(ch);
		}

		int power = 0;
		for (int i = bin.length()-1; i >= 0; i--) {
			int digit = bin.charAt(i) - '0';
			deci += digit * Math.pow(2,power++);
		}

		return deci;
	}

	public static void main(String[] args) {
		int deci = 45;
		System.out.println(deciToHexa(deci));
		System.out.println(hexaToDeci(deciToHexa(deci)));
	}
}