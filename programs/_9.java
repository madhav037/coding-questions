// WAP to find whether a number is Odd or Even without using a % operator.

public class _9 {
	public static void main(String[] args) {
		int n = 40;
		if ((n & 1) == 1) {
			System.out.print("Odd");
		}else {
			System.out.print("Even");
		}
	}
}


/*
0 	0
1 	1
10  2
11  3
100 4
101 5
110 6
111 7
*/