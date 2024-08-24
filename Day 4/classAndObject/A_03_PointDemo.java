package classAndObject;

public class A_03_PointDemo {

	public static void main(String[] args) {
		
		A_03_Point p ; //refrence variable
		p = new A_03_Point();//p object is created and default cons called
		//p.display();
		
		A_03_Point p1;//refrence variable
		p1 = new A_03_Point(10,20);//p1 object is created and parametrized cons called
		p1.display();
	}
}
