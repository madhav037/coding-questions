// WAP to find a Factor of a given number (iterative and recursive)
public class Code_3 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Iterative: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Recursive: ");
        findFactor(n, 1);
    }
    
    public static void findFactor(int n, int i) {
        if (i > n) {
            return;
        }
        if (n % i == 0) {
            System.out.println(i);
        }
        findFactor(n, i + 1);
    }
}
