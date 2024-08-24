package classAndObject;

public class A_03_Point {

	//instance data members
	private int x , y;
	
	//default cons
	public A_03_Point()
	{
		
	}
	
	//parametrized cons
	public A_03_Point(int x , int y)
	{	//if any user passes some value through object
		//then these values initialzed in instance data members
		this.x=x;
		this.y=y;
	}
	
	//instance member method
	public void display()
	{
		System.out.println("["+x+","+y+"]");
		//[10,20]
	}
	
}
