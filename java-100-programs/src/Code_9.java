// WAP to find whether a number is Odd or Even without using a % operator.
public class Code_9 {
    public static void main(String[] args) {
        int n = 5;
        if ((n & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
