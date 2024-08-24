package classAndObject;

public class A_04_Calculater {

	//instance dm
	private int n1 , n2;
	
	//default cons
	public A_04_Calculater()
	{
		
	}
	
	//para cons
	public A_04_Calculater(int n1 , int n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	
	// instance member method
	public void add() {
		System.out.println("Addition :"+(n1+n2));
	}
	
	public void sub() {
		System.out.println("Subtraction :"+(n1-n2));
	}
	
	public void mul() {
		System.out.println("Multiplication :"+(n1*n2));
	}
	
	public void div() {
		System.out.println("Division :"+(n1/n2));
	}
	
	
	
	
}
