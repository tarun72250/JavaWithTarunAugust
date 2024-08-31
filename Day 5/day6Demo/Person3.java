package day6Demo;

public class Person3 {

	//instance refrence variable
			String name ;
			Date bdate;//refrence instance variabel
			
			//default cons
			public Person3()
			{
				
			}
			
			//parametrized cons
			public Person3(String name , int dd , int mm , int yy)
			{
				this.name=name;
				this.bdate= new Date(dd,mm,yy);
			}
			
			public void display()
			{
				System.out.println("Name :"+name);
				//2 way to not getting error at runtime.
				if(bdate == null)
				{
					System.out.println("Birthdate is null");
				}
				else
				{
					bdate.showDate();
				}
			}
}
