package day6Demo;

public class A_13_StudentPercentageDemo {

	public static void main(String[] args) {
		
		
		A_13_StudentPercentage [] students;
		students = new A_13_StudentPercentage[2];
		
		//Student 1
		int[] marks = {98,65,87,78,93};
		students[0] = new A_13_StudentPercentage(101,"Rishabh Patel", 5,marks);
		
		//Student 
		int[] marks1 = {60,60,80,70,90};
		students[1] = new A_13_StudentPercentage(102,"Kanchan Patel", 5,marks1);
		
		
		
		//dispaly details of all students
		for(A_13_StudentPercentage stu : students)
		{
			stu.display();
			System.out.println("\n=========================\n");
		}
	}
}
