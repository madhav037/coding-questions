// WAP to find a total odd and total even digit of a given number.
public class Code_8 {
    public static void main(String[] args) {
        int n = 12345;
        int odd = 0;
        int even = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 == 0) {
                even += digit;
            } else {
                odd += digit;
            }
            temp /= 10;
        }
        System.out.println("Odd: " + odd);
        System.out.println("Even: " + even);
    }
}
