// WAP to find a power a^b (without using power and multiplication operation).
public class Code_20 {
    public static void main(String[] args) {
        int base = 4;
        int power = 3;
        int result = 0;
        for (int i = 0; i < base; i++) {
            result = result + base;
        }
        for (int i = 0; i < power - 2; i++) {
            int temp = result;
            for (int j = 0; j < base - 1; j++) {
                result = result + temp;
            }
        }
        System.out.println("Result: " + result);
    }
}
/*
 * Output: Result: 8
 * 2^3 = 2*2*2 = 8
 * 2+2 = 4 + 4 = 8
 * 2+2 2+2 
 * 
 * Output: Result: 27
 * 3^3 = 3*3*3 = 27
 * 3+3+3 = 9 + 9 + 9 = 27
 * 3+3+3 3+3+3 3+3+3
 * 
 * Output: Result: 16
 * 2^4 = 2*2*2*2 = 16
 * 2+2 = 4 + 4 = 8 + 8 = 16
 * 2+2 2+2 2+2 2+2 
 * 
 * Output: Result: 64
 * 4^3 = 4*4*4 = 64
 * 4+4+4+4 = 16 + 16 + 16 + 16 = 64
 * 4+4+4 4+4+4 4+4+4 4+4+4
 */
