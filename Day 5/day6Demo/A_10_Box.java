package day6Demo;

public class A_10_Box {

	//instance dm
	private int height, depth , width;
	
	//default cons
	public A_10_Box()
	{
		
	}
	
	//para cons
	public A_10_Box(int h , int d , int w)
	{
		height = h;
		depth = d;
		width = w;
	}
	
	public A_10_Box(A_10_Box a)
	{
		height = a.height;
		width = a.width;
		depth = a.depth;
	}
	
	//instance member method
	public void calVolume()
	{
		int volume = height * width * depth;
		System.out.println("Volume of Box is : "+volume);
	}
	
	
	public static void main(String[] args) {
		
		
		A_10_Box [] barr;
		barr = new A_10_Box[3];
		
		barr[0]= new A_10_Box();//default cons calling
		barr[1]= new A_10_Box(2,3,4);//para cons calling
		barr[2]= new A_10_Box(barr[1]);//copy cons calling

		
		
		for(int i=0; i<barr.length ; i++)
		{
			barr[i].calVolume();
			System.out.println("=======\n");
		}
	}
}
