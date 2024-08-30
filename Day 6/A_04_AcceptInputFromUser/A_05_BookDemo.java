package day6Demo;

import java.util.Scanner;

public class A_05_BookDemo {

	public static void main(String[] args) {
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("Enter Book id :");
		int bookId = sc.nextInt();
		
		System.out.println("Enter title of Book :");
		String title = sc.next();
		
		System.out.println("Enter Publisher id :");
		int pubid = sc.nextInt();
		
		System.out.println("Enter Publisher Name :");
		String pub_name = sc.next();
		
		System.out.println("Enter Publisher Location :");
		String pub_loc = sc.next();
		 
		A_05_Book b ;
		b  = new A_05_Book(bookId,title,pubid,pub_name,pub_loc);//para cons calling
		b.display();
		
		System.out.println("====================\n");
		A_05_Book b1 ;
		b1 = new A_05_Book();//default cons calling
		b1.display();
		
	}
}
