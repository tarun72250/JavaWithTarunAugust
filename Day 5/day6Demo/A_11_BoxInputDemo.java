package day6Demo;

import java.util.Scanner;

public class A_11_BoxInputDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Height size : ");
		int height = sc.nextInt();
		System.out.println("Enter Width size : ");
		int width = sc.nextInt();
		System.out.println("Enter Depth size : ");
		int depth = sc.nextInt();
		
		//1 way.
		A_11_BoxInput b =new A_11_BoxInput();//default cons
		int volume = b.calVolume();
		
		A_11_BoxInput b1 =new A_11_BoxInput(height, width,depth);//para cons
		int volume1 = b1.calVolume();
		
		if( volume > volume1)
		{
			System.out.println("default box volume is bigger");
		}
		else
		{
			System.out.println("para box volume is bigger");
		}
		 
	}
}
