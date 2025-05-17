// WAP to find whether string is palindrome or not.

public class _2 {
	public static void main(String[] args) {
		String s1 = "abc1cba";
		String s2 = "abccba";
		String s3 = "abcabca";
		String s = s3;
		int start = 0;
		int end = s.length()-1;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)){
				System.out.println("False");
				return;
			}
			start++;
			end--;
		}
		System.out.println("True");
	}
}