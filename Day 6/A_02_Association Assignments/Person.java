package day6Demo;

public class Person {

	
	//instance refrence variable
	String name ;
	Date bdate;
	
	
	//parametrized cons
	public Person(String name , int dd , int mm , int yy)
	{
		this.name=name;
		this.bdate= new Date(dd,mm,yy);
	}
	
	public void display()
	{
		System.out.println("Name :"+name);
		bdate.showDate();
	}
	
}
