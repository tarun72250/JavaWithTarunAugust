package day6Demo;

public class A_06_Book {

	private int bookid;//112
	private String title;
	private A_05_Publisher publisher;
	
	//default cons
	public A_06_Book()
	{
		this.bookid=0;
		this.title=null;
		//1 way of prevention
		this.publisher = new A_05_Publisher();
	}
	
	//para cons
	public A_06_Book(int bookid , String title , int pubid , String pub_name , String pub_loc)
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
	
	//getter and setter methods :- 
	//need :- if we want to get instance dm which ill declared in class as private .
	//Getter Method
	public int getBookId()
	{
		return bookid;
	}
	
	//Setter Method
	public void setBookId(int bookid)//112
	{
		// This keyword refers to current instance bookid;
		this.bookid=bookid; 
		//111=112;
	}
}
