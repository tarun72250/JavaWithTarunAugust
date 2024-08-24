package classAndObject;

public class Date2Demo {
	public static void main(String[] args) {

		
		Date2 d ; //refrence variable 
		d = new Date2();// creating object and calling default cons
		d.showDate();
		
		Date2 d1;
		d1 = new Date2(11,12,2024);//parametrized cons called
		d1.showDate();
		
		Date2 d2;
		d2 = new Date2(d1);//copy cons called
		d1.showDate();
		
		Date2 d3;
		d3 = d2;
		
		//Refrence Equality Check
		if(d == d1)//different
			System.out.println("same");
			else
			System.out.println("different");
		
		if(d1 == d2)//different
			System.out.println("same");
			else
			System.out.println("different");
			
		if(d2 == d3)//same
			System.out.println("same");
			else
			System.out.println("different");
			
			
	}
}
