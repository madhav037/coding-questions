// WAP to convert a Decimal number to BCD.
public class Code_15 {
    public static void main(String[] args) {
        String[] bcd = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001"};
        int num = 1234;
        String bcdString = "";
        while (num > 0) {
            int rem = num % 10;
            bcdString = bcd[rem] + " " + bcdString;
            num = num / 10;
        }
        System.out.println("The BCD of the given number is: " + bcdString);
    }
}
