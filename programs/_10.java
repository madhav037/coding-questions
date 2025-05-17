// WAP to find a prime number between range (range should be entered by user).
import java.util.Scanner;

public class _10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();

		for (int i = start; i <= end; i++) {
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0){
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(i);
			}
		}
	}
}