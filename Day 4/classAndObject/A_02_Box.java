package classAndObject;

public class A_02_Box {

	//instance dm 
	private int height;
	private int width;
	private int depth;
	
	//-------------------------------------------
	
	//default cons
	public A_02_Box()
	{
		this.height=width=depth=10;
	}
	
	//parametrized constructor
	public A_02_Box(int height , int w , int d)
	{
		this.height = height;
		width = w;//here we did'nt need this keyword because local variable and instance variable names are different.
		depth = d ;
	}
	
	//partially parametrized cons
	public A_02_Box(int height, int j) {
		this.height= height;
		width = j;
	}

	//copy cons
	public A_02_Box(A_02_Box rishabh)
	{
		this.height = rishabh.height;
		this.width=rishabh.width;
		this.depth=rishabh.depth;
	}
	
	//---------------------------------------------
	
	//instance member method 
	//does not return anything
	public void calVolume()
	{
		int result = height*this.width*this.depth;
		System.out.println("Volume of Box is :"+result);
	}
	
	//instance member method 
	//int value return 
	public int calVolumePara(int h , int w , int d)
	{
		int res = h*w*d;
		return res;
	}
	
}
