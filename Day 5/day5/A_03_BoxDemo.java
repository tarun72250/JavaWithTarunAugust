package day5;

public class A_03_BoxDemo {

	public static void main(String[] args) {
		
		A_03_Box b ; //refrence variable
		b = new A_03_Box();//default cons called
		b.calVolume();
		
		A_03_Box b1 ; //refrence variable
		b1 = new A_03_Box(2,3,4);//parametrized cons called
		b1.calVolume();
	}
}
