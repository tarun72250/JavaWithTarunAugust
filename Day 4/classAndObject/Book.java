package classAndObject;

public class Book {

	//instance member method
	private String title;
	private String author;
	
	
	//dafult cons
	public Book()
	{
		this.title=null;
		this.author=null;
	}
	
	//parametrized cons
	public Book(String title, String author) 
	{
		this.title = title;
		this.author = author;
	}
	
	public void display()
	{
		System.out.println("Title :"+title);
		System.out.println("Author :"+author);
	}

	

}
