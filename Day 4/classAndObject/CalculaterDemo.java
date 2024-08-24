package classAndObject;

public class CalculaterDemo {

	public static void main(String[] args) {
		
		Calculater c;
		c = new Calculater(12,3);
		c.addition();
		c.subtraction();
		c.multiplication();
		c.division();
		
		System.out.println("--------------------------\n");
		Calculater c1;
		c1 = new Calculater(12,3);
		c1.addition(1,2,3);
		
		
	}
}
