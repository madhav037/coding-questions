// WAP to find a summation of a digit of a given number. (Iterative and recursive)
public class Code_5 {
    public static void main(String[] args) {
        int n = 12345;
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Iterative: " + sum);
        System.out.println("Recursive: " + findSum(n));
    }

    public static int findSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + findSum(n / 10);
    }
}
