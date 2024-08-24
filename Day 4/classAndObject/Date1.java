package classAndObject;

public class Date1 {

		// instance data meber , state , property , dm , attribute
		private int dd;
		private int mm;
		private int yy;
		
		//default cons
		public Date1()
		{
			//this cons is always present
			dd=00;
			mm=00;
			yy=00;
		}
		
		//parametrized cons
		public Date1(int rish , int mm , int yy)
		{
			this.dd=rish;
			this.mm=mm;
			this.yy=yy;
		}
		
		
		//partially parametrized cons
		public Date1(int dd , int mm)
		{
			this.dd=dd;
			this.mm=mm;
		}
		
		
		//partially paratemrized cons
		public Date1(int yy)
		{
			this.yy=yy;
		}
		
		
		//Method Overloading :-
		//instance member method , behaviour , function 
		public void showDate()
		{
			System.out.println(dd+" "+mm+" "+yy);
		}
		
		public void showDate(char ch)
		{
			System.out.println(dd+" "+ch+mm+ch+" "+yy);
		}
}
