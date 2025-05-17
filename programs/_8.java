// WAP to find a total odd and total even digit of a given number.

public class _8 {
	public static void main(String[] args) {
		int n = 1234567890;
		int count_odd = 0, count_even = 0;
		while ( n > 0) {
			int rem = n % 10;
			if (rem % 2 == 0) {
				count_even++;
			}else{
				count_odd++;
			}
			n /= 10;
		}
		System.out.println("Odd : " + count_odd);
		System.out.println("even : " + count_even);
	}
}