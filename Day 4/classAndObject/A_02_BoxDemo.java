package classAndObject;

public class A_02_BoxDemo {

	public static void main(String[] args) {
		
		A_02_Box b ; // refrence variable
		b = new A_02_Box(); //object creation // default cons
		b.calVolume();//method calling 
		
		System.out.println("\n-----------------------------");
		A_02_Box b1 ;// refrence variable
		b1 = new A_02_Box(2,3,4);//parametrized cons calling
		b1.calVolume();
		
		
		System.out.println("\n-----------------------------");
		A_02_Box b2; //refrence variable
		b2 = new A_02_Box(5,6);//partially parametrized cons
		b2.calVolume();
		
		System.out.println("\n------------------------------");
		//Here we check refrence equality
		A_02_Box b3; // refrence variable
		b3 =b2;//in heap they refer same object values.
		b3.calVolume();
		
		System.out.println("\n------------------------------");
		A_02_Box b4; // refrence variable
		b4 =new A_02_Box(b2);//in heap they refer different object but same values.
		b4.calVolume();
		
		System.out.println("\n------------------------------");
		A_02_Box b5;//refrence variable
		b5 = new A_02_Box();
		int res = b5.calVolumePara(2,3,4);
		System.out.println("Volume of result is :"+res);
		
		
		System.out.println("\n------------------------------");
		A_02_Box b6;//refrence variable
		b6 = new A_02_Box();
		System.out.println("Volume of result is :"+b6.calVolumePara(1,2,3));
		
	}
}
