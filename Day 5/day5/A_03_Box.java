package day5;


public class A_03_Box {

		//instance dm 
		private int height;
		private int width;
		private int depth;
		
		//-------------------------------------------
		
		//default cons
		public A_03_Box()
		{
			this.height=width=depth=10;
		}
		
		//parametrized constructor
		public A_03_Box(int height , int w , int d)
		{
			this.height = height;
			width = w;//here we did'nt need this keyword because local variable and instance variable names are different.
			depth = d ;
		}
		
		//partially parametrized cons
		public A_03_Box(int height, int j) {
			this.height= height;
			width = j;
		}
		
		//---------------------------------------------
		
		
		//instance member method 
		public void calVolume()
		{
			int result = height*this.width*this.depth;
			System.out.println("Volume of Box is :"+result);
		}
		
}
