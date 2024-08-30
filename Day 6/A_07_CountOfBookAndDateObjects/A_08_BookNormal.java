package day6Demo;

public class A_08_BookNormal {

	private float price;//non-static dm
	
	static int bookid;//static dm
	
	static{
		bookid=0;//1  2  3
	}
	
	//default cons
	public A_08_BookNormal()
	{
		bookid++;
		this.price=0;
	}
	
	//parametrized cons
	public A_08_BookNormal(float price)
	{
		bookid++;
		this.price=price;
	}
	
	public void display() {
		System.out.println("Book id :"+bookid + " price of the book is :"+price);
	}
}
