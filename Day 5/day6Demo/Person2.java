package day6Demo;

public class Person2 {

	//instance refrence variable
		String name ;
		Date bdate;
		
		//default cons
		public Person2()
		{
			this.name="not assigned";
			//1st way to not getting error at runtime
			this.bdate= new Date();
		}
		
		//parametrized cons
		public Person2(String name , int dd , int mm , int yy)
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
