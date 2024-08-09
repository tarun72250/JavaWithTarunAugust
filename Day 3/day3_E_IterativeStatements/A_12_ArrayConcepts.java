package day3_E_IterativeStatements;

import java.util.Scanner;

public class A_12_ArrayConcepts {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr [];
		arr = new int [5];
		
		System.out.println("Enter 5 value of Array...");
		
		for(int i = 0 ;i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("----------------\n");
		for(int i =0 ; i <= arr.length-1 ; i++)
		{
			System.out.print(arr[i]+"-------");
		}
	}
}
