package day6Demo;

public class A_09_DateCount {

	
	private int dd;
	private int mm;
	private int yy;
	
	static int count;
	
	static {
		count =0;
	}
	
	
	public A_09_DateCount() {
		count++;
	}


	public A_09_DateCount(int dd, int mm, int yy) {
		count++;
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public void display()
	{
		System.out.println("Count of Dates :"+count +"-------->"+dd+" "+mm+" "+yy);
	}

	
}
