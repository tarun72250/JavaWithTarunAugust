package classAndObject;

public class Complex {
	
	    //instance data member
		int real;
		int imaginary;
		
		
		//constructor - for initialize the object
		//Default constructor 
		public Complex()
		{
			this.real=3;
			this.imaginary=5;
		}
		
		//Parametrized costructor
		public Complex(int r , int i)
		{
			this.real=r;
			this.imaginary=i;
		}
		
		//instance member method
		public void display()
		{
			if( imaginary > 0 )
			{
				System.out.println(real+" + "+imaginary+"i");
			}
			else
			{									//-(-7)  => 7
				System.out.println(real+" + "+(-(imaginary))+"i");
			}
		}
}
