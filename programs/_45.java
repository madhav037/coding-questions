// WAP to convert a hexa-decimal to Octal.
import java.util.HashMap;

public class _45 {
	static HashMap<Character,String> table = new HashMap<>();
	static {
		table.put('0', "0000"); table.put('9',"1001");
		table.put('1', "0001"); table.put('A',"1010");
		table.put('2', "0010"); table.put('B',"1011");
		table.put('3', "0011"); table.put('C',"1100");
		table.put('4', "0100"); table.put('D',"1101");
		table.put('5', "0101"); table.put('E',"1110");
		table.put('6', "0110"); table.put('F',"1111");
		table.put('7', "0111");
		table.put('8', "1000");
	}

	public static String hexaToBin(String hexa) {
		String bin = "";

		for(int i = 0; i < hexa.length(); i++) {
			bin += table.get(hexa.charAt(i));
		}
		return bin;
	}

	public static String binToOct(String bin) {
        int len = bin.length();
        int padding = (3 - len % 3) % 3;
        bin = "0".repeat(padding) + bin;

        StringBuilder octal = new StringBuilder();
        for (int i = 0; i < bin.length(); i += 3) {
            String group = bin.substring(i, i+3);
            int octDigit = Integer.parseInt(group, 2);
            octal.append(octDigit);
        }

        return octal.toString().replaceFirst("^0*","");
    }


	public static void main(String[] args) {
		String hexa = "0E5";
		System.out.print(binToOct(hexaToBin(hexa)));
	}
}