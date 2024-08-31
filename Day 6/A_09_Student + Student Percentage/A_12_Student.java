package day6Demo;

public class A_12_Student {

	
	//instance dm
	private int rollNumber;
	private String name;
	private int numSubjects;
	private int[] marks;
	
	//parametrized cons
	public A_12_Student(int rollNumber , String name , int numSubjects , int[] marks )
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
		System.out.println("Roll Number : "+rollNumber);
		System.out.println("Student Name :"+name);
		System.out.println("Number of Subjects : "+numSubjects);
		System.out.println("Marks of each Subjects :");
		for(int i =0 ;i < numSubjects ; i++)
		{
			System.out.print(marks[i]+"   ");
		}
	}
}
