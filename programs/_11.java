// WAP to find weather given number is Armstrong number is not.

public class _11 {
	public static void main(String[] args) {
		int n = 1634, len = 0, check = 0;
		int temp = n;
		while(temp > 0) {
			len++;
			temp /= 10;
		}

		temp = n;
		while(temp > 0) {
			int rem = temp % 10;
			check += Math.pow(rem,len);
			temp /= 10;
		}

		if (n == check) {
			System.out.print("True");
		}else {
			System.out.print("False");
		}
	}
}