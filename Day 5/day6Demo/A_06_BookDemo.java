package day6Demo;

import java.util.Scanner;

public class A_06_BookDemo {

public static void main(String[] args) {
		
		
		A_06_Book b1 ;
		b1 = new A_06_Book(111,"Alex",101,"Mario","Pune");//Para cons calling
		b1.display();
		
		System.out.println("====================\n");

		int bookid = b1.getBookId();//getter method calling
		System.out.println("Book id by getBookId():"+bookid);
		
		System.out.println("====================\n");
		b1.setBookId(112);//setter method 
		b1.display();
	}
}
