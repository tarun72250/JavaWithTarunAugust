package day6Demo;

public class A_14_Book {

	//static dm
	private static int bkNo ;
	//instance dm
	private int bookId;
	private A_14_Author author;
	private float price;
	
	private int quantity;
	
	//static block 
	static{
		bkNo = 1000;
	}
	
	//default cons
	public A_14_Book()
	{
		
	}
	
	//fully parametrized cons
	public A_14_Book(A_14_Author a , float price , int qty)
	{
		this.bookId = bkNo++;
		author=a;
		this.price = price;
		this.quantity= qty;
	}

	//getter and setter 
	public static int getBkNo() {
		return bkNo;
	}

	public static void setBkNo(int bkNo) {
		A_14_Book.bkNo = bkNo;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public A_14_Author getAuthor() {
		return author;
	}

	public void setAuthor(A_14_Author author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "A_14_Book [bookId=" + bookId + ", author=" + author + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
	
	
	//toString() methodd
	
	
}
