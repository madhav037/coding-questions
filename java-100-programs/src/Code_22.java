
// Print a following patterns
// 1
// AB
// 234
// CDEF
// *********
// *******
// *****
// ***
// *
// *********
// **** ****
// ***   ***
// **     **
// *       *
public class Code_22 {
    public static void main(String[] args) {
        int n = 1;
        char ch = 'A';
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(ch++);
                } else {
                    System.out.print(n++);
                }
            }
            System.out.println();
        }
        System.out.println("\n*********\n");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n*********\n");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
