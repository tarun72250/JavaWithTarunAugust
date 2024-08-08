package day3_D_Operators;

public class A_02_Multiplication {

	public static void main(String[] args) {
		
		
		int a = 10  , b = 20;
		System.out.println(a*b);//200
		
		int result = a*b;
		System.out.println(result);//200
		
		int c =30;
		c *= 2; // c= c*2;
		System.out.println(c);//60
		
		
		int d;//declaration 
		d=90;//initilization
		d = 45;//re-assignement
		System.out.println(d);//45
		
		final int e;//declaration 
		e=90;//initilization
		//e = 45;//error because final variable decalred 
		System.out.println(e);//90
	}
}
