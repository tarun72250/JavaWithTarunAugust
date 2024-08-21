package day3_E_IterativeStatements;

public class A_14_2dArrayBasics {

	public static void main(String[] args) {
		
		
		//1-D Array
		 int [] arr1 = {10,20,30,40,50};
		 
		 
		//2-D Array Declaration + Initilization + Instantiation 
		 int [][] arr = {
				 {1,2,3},{4,5,6},{7,8,9}
		 };
		 
		 // Accessing elements in the 2D array
//		 System.out.println(arr[0][0]);//1
//		 System.out.println(arr[0][1]);//2
//		 System.out.println(arr[0][2]);//3
//		 System.out.println(arr[2][0]);//7
		 
		 // Iterating over the 2D array
		 for(int i = 0 ; i < arr.length ; i++)//i=0      i =1      i=2
		 {
			 for(int j = 0 ; j < arr[i].length ; j++)//0<3     0<3    0<3
			 {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
		 
		 
	}
}
