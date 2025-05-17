// pattern

public class _22 {
    public static void main(String[] args) {
        int n = 1;
        char ch = 'A';
        for (int i = 1; i <= 4; i++) {

        	for (int k = 4-i; k > 0; k--) {
        		System.out.print(" ");
        	}

            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(ch++ + " ");
                } else {
                    System.out.print(n++ + " ");
                }
            }

            System.out.println();
        }


        System.out.println("\n*********\n");

        for (int i = 5; i >= 1; i--) {
        	for (int k = 1; k < 5-i+1; k++) {
        		System.out.print(" ");
        	}

            for (int j = 1; j < (2 * i-1) + 1; j++) {
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
