package day6Demo;

public class A_11_BoxInput {

	//instance dm
		private int height, depth , width;
		
		//default cons
		public A_11_BoxInput()
		{
			height = 1;
			depth = 2;
			width = 3;
		}
		
		//para cons
		public A_11_BoxInput(int h , int d , int w)
		{
			height = h;
			depth = d;
			width = w;
		}
		
		public A_11_BoxInput(A_11_BoxInput a)
		{
			height = a.height;
			width = a.width;
			depth = a.depth;
		}
		
		//instance member method
		public int calVolume()
		{
			int volume = height * width * depth;
			return volume;
		}
		
}
