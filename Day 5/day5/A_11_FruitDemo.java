package day5;

import java.util.Scanner;

public class A_11_FruitDemo {
	public static void main(String[] args) {
		
		//if ill accept input from user 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The fruit name :");
		String fruit = sc.next();
		
		System.out.println("Fruit is sedded or not (true or false) :");
		boolean seeded = sc.nextBoolean();
		
		
		System.out.println("Enter The Vitamin Contained:");
		char vitamin = sc.next().charAt(0);
		
		A_11_Fruit f ; 
		f = new A_11_Fruit(fruit,seeded,vitamin);
		f.display();
		
		A_11_Fruit f1 ; 
		f1 = new A_11_Fruit("Gauva",true,'A');
		f1.display();
		
	}
}
