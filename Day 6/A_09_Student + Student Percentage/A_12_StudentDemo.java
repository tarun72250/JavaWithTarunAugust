package day6Demo;

public class A_12_StudentDemo {

	
	public static void main(String[] args) {
		
		A_12_Student [] students = new A_12_Student[2];
		
		
		int[]marks = {90,86,91,82,80};
		students[0] = new A_12_Student(101,"Rishabh Patel",5,marks);
		

		int[]marks1 = {90,86,91};
		students[1] = new A_12_Student(102,"Kanchan Patel",3,marks1);
		
		//advanced for loop
		for(A_12_Student stu:students)
		{
			stu.display();
			System.out.println("\n=======================================\n");
		}
		
	}
}
