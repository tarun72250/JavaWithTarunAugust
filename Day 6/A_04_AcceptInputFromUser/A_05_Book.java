package day6Demo;

public class A_05_Book {

	private int bookid;
	private String title;
	private A_05_Publisher publisher;
	
	//default cons
	public A_05_Book()
	{
		this.bookid=0;
		this.title=null;
		//1 way of prevention
		this.publisher = new A_05_Publisher();
	}
	
	//para cons
	public A_05_Book(int bookid , String title , int pubid , String pub_name , String pub_loc)
	{
		this.bookid=bookid;
		this.title=title;
		this.publisher = new A_05_Publisher(pubid, pub_name , pub_loc);
	}
	
	//instance member method
	public void display()
	{
		System.out.println("Book id :"+bookid);
		System.out.println("Title :"+title);
		publisher.display();
	}
}
