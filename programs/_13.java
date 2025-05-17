// WAP to find a Multiplication of 2 Matrix (dimension and value should be entered by user)
import java.util.Scanner;

public class _13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("matrix 1");
		System.out.print("row : ");
		int row_1 = sc.nextInt();
		System.out.print("col : ");
		int col_1 = sc.nextInt();

		System.out.println("matrix 2");
		System.out.print("row : ");
		int row_2 = sc.nextInt();
		System.out.print("col : ");
		int col_2 = sc.nextInt();

		if (col_1 != row_2) {
			System.out.print("Can't do matrix multiplication");
			return;
		}

		int[][] matrix_1 = new int[row_1][col_1];
		int[][] matrix_2 = new int[row_2][col_2];
		int[][] matrix = new int[row_1][col_2];

		System.out.println("matrix 1");
		for (int i = 0; i < row_1; i++) {
			for (int j = 0; j < col_1; j++) {
				System.out.print(i + " " + j + " : ");
				matrix_1[i][j] = sc.nextInt();
			}
		}

		System.out.println("matrix 2");
		for (int i = 0; i < row_2; i++) {
			for (int j = 0; j < col_2; j++) {
				System.out.print(i + " " + j + " : ");
				matrix_2[i][j] = sc.nextInt();
			}
		}


		for (int i = 0; i < row_1; i++) {
			for (int j = 0; j < col_2; j++) {
				for (int k = 0; k < col_1; k++) {
                	matrix[i][j] += matrix_1[i][k] * matrix_2[k][j];
            	}
			}
		}

		System.out.println("matrix multiplication");
		for (int i = 0; i < row_1; i++) {
			for (int j = 0; j < col_2; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}