package day5;

public class A_07_StudentClassDemo {

	public static void main(String[] args) {
		
		A_07_StudentClass s;//refrence variable
		s = new A_07_StudentClass(101,90.0f);
		s.displayGrade();//excellent
		
		A_07_StudentClass s2 = new A_07_StudentClass(103 , 89.0f);
		s2.displayGrade();//Very Good
		
		A_07_StudentClass s1 = new A_07_StudentClass(102,79.0f);
		s1.displayGrade();//Good
		
		
		
		
	}
}
