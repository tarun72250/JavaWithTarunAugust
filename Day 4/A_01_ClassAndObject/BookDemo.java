package A_01_ClassAndObject;

public class BookDemo {

	public static void main(String[] args) {
		Book b ; //refrence vafriable
		b = new Book();//defult cons calling
		b.display();
		
		System.out.println("\n--------------------------------");
		Book b1 ;// refrence var
		b1= new Book("James" , "Alex");
		b1.display();
	}
}
