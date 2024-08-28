package day6Demo;

public class Date {

			// instance data meber , state , property , dm , attribute
			private int dd;
			private int mm;
			private int yy;
			
			//default cons
			public Date()
			{
				//this cons is always present
				dd=00;
				mm=00;
				yy=00;
			}
			
			//parametrized cons
			public Date(int rish , int mm , int yy)
			{
				this.dd=rish;
				this.mm=mm;
				this.yy=yy;
			}
			
			//instance member method , behaviour , function 
			public void showDate()
			{
				System.out.println(dd+" "+mm+" "+yy);
			}
			
		
}
