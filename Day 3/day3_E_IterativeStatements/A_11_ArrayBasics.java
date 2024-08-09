package day3_E_IterativeStatements;

public class A_11_ArrayBasics {

	public static void main(String[] args) {
		
		
		//declaration of array
		int [] arr;// refrence variable of array
		
		//initilization of array
		arr = new int [5];
		
		//shortcut for declaration and initiolization
		//int [] a = new int [5];
		
		
		//instantation of array :- values providing
		arr[0]=111;
		arr[1]=222;
		arr[2]=333;
		arr[3]=444;
		arr[4]=555;
		

		//this is the simple way to access array elements
//		System.out.println(arr[0]); //1
//		System.out.println(arr[1]); //2
//		System.out.println(arr[2]); //3
//		System.out.println(arr[3]); //4
//		System.out.println(arr[4]); //5
		
		//System.out.println(arr[5]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//		for(int i =0 ; i<=arr.length-1 ; i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		
		//if we print output in same line
		for(int i =0 ; i<=arr.length-1 ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		//Declaration and instantiation:-
		int arr1 [] = {101,102,103,104,105};
		
		
		
	}
}
