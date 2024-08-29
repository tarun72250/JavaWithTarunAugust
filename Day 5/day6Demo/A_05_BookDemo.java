package day6Demo;

public class A_05_BookDemo {

	public static void main(String[] args) {
		
		A_05_Book b ;
		b  = new A_05_Book(101,"AAA",1001,"Aman","Paris");//para cons calling
		b.display();
		
		System.out.println("====================\n");
		A_05_Book b1 ;
		b1 = new A_05_Book();//default cons calling
		b1.display();
		
	}
}
