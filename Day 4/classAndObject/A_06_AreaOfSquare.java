package classAndObject;

public class A_06_AreaOfSquare {

	//instance dm
	private int area;
	
	//default cons
	public A_06_AreaOfSquare()
	{
		
	}
	
	//para cons
	public A_06_AreaOfSquare(int area)
	{
		this.area=area;
	}
	
	//instance member method
	public void display() {
		System.out.println("Area of Square :"+(area*area));
	}
	
	
}
