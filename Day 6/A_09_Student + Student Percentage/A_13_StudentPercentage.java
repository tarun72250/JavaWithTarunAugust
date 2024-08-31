package day6Demo;

public class A_13_StudentPercentage {

	//instance dm
		private int rollNumber;
		private String name;
		private int numSubjects;
		private int[] marks;
		
		//parametrized cons
		public A_13_StudentPercentage(int rollNumber , String name , int numSubjects , int[] marks )
		{
			this.rollNumber=rollNumber;
			this.name=name;
			this.numSubjects=numSubjects;
			this.marks = new int[numSubjects];
			for(int i =0 ; i < numSubjects ; i++)
			{	
				this.marks[i] = marks[i];
			}
		}
		
		//instance member methods
		public void display()
		{
			System.out.println("Student Name :"+name);
			double totalMarks = 0;
			for(int i =0 ; i < numSubjects ; i++)
			{
				totalMarks = totalMarks +marks[i];
			}
			double percentage = (totalMarks /(numSubjects *100))* 100;
			System.out.println("Percentage : "+percentage +"%");
		}
}
