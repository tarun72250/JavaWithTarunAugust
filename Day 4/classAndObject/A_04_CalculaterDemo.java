package classAndObject;

public class A_04_CalculaterDemo {

	public static void main(String[] args) {
		
		A_04_Calculater c ;//refrence variable
		c = new A_04_Calculater(10,5);//para cons
		c.add();
		c.sub();
		c.mul();
		c.div();
		
		A_04_Calculater c1;	
		c1 = new A_04_Calculater(20,4);//c1 object creation
		c1.add();
		
	}
}
