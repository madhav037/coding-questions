// WAP to find a factorial of a given integer (iterative and recursive)
public class Code_4 {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
        System.out.println("Recursive: ");
        System.out.println(findFactorial(n));
    }

    public static int findFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }
}