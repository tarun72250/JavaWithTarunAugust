package day5;

public class A_07_StudentClass {

		//instance data member
		int id;
		float per;
		
		//default cons 
		public A_07_StudentClass()
		{
			
		}
		
		//parametrized constructor
		public A_07_StudentClass(int i , float p)
		{
			this.id=i;
			this.per=p;
		}
		
		public void displayGrade() {
			if(per >= 90)
			{
				System.out.println("Student id :-"+id);
				System.out.println("Student Grade :"+per+"(Excellent)");
			}
			else if(per >= 80 && per < 90)
			{
				System.out.println("Student id :-"+id);
				System.out.println("Student Grade :"+per+"(Very Good)");
			}
			else if(per >= 70 && per < 80)
			{
				System.out.println("Student id :-"+id);
				System.out.println("Student Grade :"+per+"(Good)");
			}
			else if(per >= 60 && per < 70)
			{
				System.out.println("Student id :-"+id);
				System.out.println("Student Grade :"+per+"(Average)");
			}
			else if(per >= 40 && per < 60)
			{
				System.out.println("Student id :-"+id);
				System.out.println("Student Grade :"+per+"(Pass)");
			}
			else if( per < 40)
			{
				System.out.println("Student id :-"+id);
				System.out.println("Student Grade :"+per+"(Fail)");
			}
		}
}
