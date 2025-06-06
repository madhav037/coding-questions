// Given a non-negative integer x, compute and return the square root of x.
// Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
// Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

public class _52 {
	public static void main(String[] args) {
		int x = 9;
		int i = 1, ans = 0;
		while(true){
			if (i*i > x){
				ans = i-1;
				break;
			}
			i++;
		}
		System.out.print(ans);
	}
}