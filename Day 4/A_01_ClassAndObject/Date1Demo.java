package A_01_ClassAndObject;

public class Date1Demo {

	public static void main(String[] args) {
		
		Date1 d;// refrence variable
		d = new Date1();//default cons calling
		d.showDate();
		
		System.out.println("\n----------------------");
		Date1 d1 ;
		d1= new Date1(01,06,2002);//parametrized cons
		d1.showDate();
		
		System.out.println("\n----------------------");
		Date1 d2; //refrence var
		d2 = new Date1(12,8);//The constructor Date1(int, int) is undefined
		d2.showDate();
		
		System.out.println("\n----------------------");
		Date1 d3 ;
		d3 = new Date1(2003);
		d3.showDate();
	}
}
