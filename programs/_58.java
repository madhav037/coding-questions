// Write a program to check weather number is happy number is not, happy
// number are those number whose digit’s square summation eventually reaches
// to 1, if the sequence start repeating then it is not a happy number, to
// store this sequence, use a dynamic data structure. E.g., 49 is a happy
// number whose sequence is 49 97 130 10 1 E.g., 50 is not a happy number
// whose sequence is 50 25 29 85 89 145 42 20 4 16 37 58 89 it should stop
// when 89 is detected 2nd time and print 50 is not a happy number.

import java.util.Set;
import java.util.HashSet;

public class _58 {
	static Set<Integer> set;
	public static boolean happyNumber(int n) {
		int sum = 0;
		while(n > 0) {
			int rem = n % 10;
			sum += rem*rem;
			n /= 10;
		}

		if (set.contains(sum)){
			return false;
		}else {
			set.add(sum);
		}

		if (sum == 1) {
			return true;
		}
		return happyNumber(sum);
	}

	public static void main(String[] args) {
		int num = 49, num2 = 50;
		set = new HashSet<>();
		set.add(num);
		if (happyNumber(num)) {
			System.out.print(num + " is a happy number");
		}else {
			System.out.print(num  + " is not a happy number");
		}
	}
}