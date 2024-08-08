package day3_E_IterativeStatements;

import java.util.Scanner;

public class A_06_FunctionDemo {


//---------------------------------------------------------------------------
	public static void main(String[] args) 
	{

		// i will take input from user 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer value..");
		int num = sc.nextInt();
		// i will pASS THIS input from static method
		printTable(num);
		System.out.println();
		printFactorial(num);
		System.out.println();
		printSquarePattern(num);
		System.out.println();
		printRightAngledPattern(num);

	}
	

//---------------------------------------------------------------------------
	//static method:- no need of creating object
	public static void printTable(int num)
	{
		
		for(int i=1 ; i <= num ; i++)
		{
			for(int j=1 ; j <= 10 ; j++)
			{
				System.out.println(i + " * "+ j+ " = "+(i*j));
				
			}
			System.out.println();
		}
	}
//---------------------------------------------------------------------------	
	public static void printFactorial(int num)
	{
		int fact =1;
		for(int i = 1 ; i <=num ; i++)
		{
			fact = fact * i; 
		}
		System.out.println("Factorail of "+num+" is :"+fact);
	}
//---------------------------------------------------------------------------
	public static void printSquarePattern(int num)
	{
		//column
		for(int i =1;i<=num ;i++)
		{
			for(int j = 1 ; j<=num ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
//---------------------------------------------------------------------------
	public static void printRightAngledPattern(int num)
	{
		for(int i =1 ; i <=num ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
