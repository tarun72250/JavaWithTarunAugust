package classAndObject;

public class Date2 {

	// instance data meber , state , property , dm , attribute
			private int dd;
			private int mm;
			private int yy;
			
			//default cons
			public Date2()
			{
				//this cons is always present
				dd=00;
				mm=00;
				yy=00;
			}
			
			//parametrized cons
			public Date2(int dd , int mm , int yy)
			{
				this.dd=dd;
				this.mm=mm;
				this.yy=yy;
			}
			
			
			//copy cons
			public Date2(Date2 d)
			{
				this.dd=d.dd;
				this.mm=d.mm;
				this.yy=d.yy;
			}
			
			
			//instance member method , behaviour , function 
			public void showDate()
			{
				System.out.println(dd+" "+mm+" "+yy);
			}
}
