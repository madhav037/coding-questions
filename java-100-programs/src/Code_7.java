// WAP to find a Fibonacci series up to n terms (n is entered by user) (iterative and recursive)
public class Code_7 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Iterative: ");
        int last = 0, secondLast = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(last + " ");
            int c = last + secondLast;
            last = secondLast;
            secondLast = c;
        }

        System.out.println("\nRecursive: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(findFibonacci(i) + " ");
        }
    }

    public static int findFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
}
