package day3_E_IterativeStatements;

public class A_16_CheckIsSymetric {

	public static void main(String[] args) {
		 int[][] matrix = {
		            {1, 2, 3},
		            {2, 4, 5},
		            {3, 5, 6}
		        };

		        boolean isSymmetric = true;
		        int rows = matrix.length;
		        int columns = matrix[0].length;

		        if (rows != columns) {
		            isSymmetric = false;
		        } else {
		            for (int i = 0; i < rows; i++) {
		                for (int j = 0; j < i; j++) {
		                    if (matrix[i][j] != matrix[j][i]) 
		        {
		                        isSymmetric = false;
		                        break;
		                    }
		                }
		            }
		        }

		        if (isSymmetric) {
		            System.out.println("The matrix is symmetric.");
		        } else {
		            System.out.println("The matrix is not symmetric.");
		        }

	}
}
