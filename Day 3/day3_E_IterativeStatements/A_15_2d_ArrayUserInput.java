package day3_E_IterativeStatements;

import java.util.Scanner;

public class A_15_2d_ArrayUserInput {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dimensions for rows :-");
		int rows = sc.nextInt();
		System.out.println("Enter dimensions for columns :-");
		int columns = sc.nextInt();
		
		int [] [] matrix = new int [rows] [columns];
		
		System.out.println("Enter the "+(rows*columns) +" Values :-");
        // Taking input for each element of the array
		for(int i =0 ; i < rows ; i++)
		{
			for(int j =0 ; j<columns; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		
//	    // Printing the 2D array
//        System.out.println("The 2D array is:");
//        for (int i = 0; i < rows; i++) 
//        {
//            for (int j = 0; j < columns; j++) 
//            {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }

//        //2D array sum
//		int sum = 0 ;
//       
//        for (int i = 0; i < rows; i++) 
//        {
//            for (int j = 0; j < columns; j++) 
//            {
//                sum = matrix[i][j] + sum ;
//            }
//            System.out.println();
//        }
//        System.out.println("The sum of 2D array is: "+sum);
        
//      //find the max element in 2D array
//		int max = matrix[0][0];
//		 for (int i = 0; i < matrix.length; i++) 
//	        {
//	            for (int j = 0; j < matrix[i].length; j++) 
//	            {
//	                if(matrix [i][j] > max)
//	                {
//	                	max = matrix[i][j];
//	                }
//	            }
//	            System.out.println();
//	        }
//	        System.out.println("The max element of 2D array is: "+max);
	        
		//find the min element in 2D array
				int min = matrix[0][0];
				 for (int i = 0; i < matrix.length; i++) 
			        {
			            for (int j = 0; j < matrix[i].length; j++) 
			            {
			                if(matrix [i][j] < min)
			                {
			                	min = matrix[i][j];
			                }
			            }
			            System.out.println();
			        }
			        System.out.println("The min element of 2D array is: "+min);

		
	}
}
