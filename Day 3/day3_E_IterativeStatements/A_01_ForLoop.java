package day3_E_IterativeStatements;

public class A_01_ForLoop {

	public static void main(String[] args) {
		
		//for(initilization , condition , updataion){}
//				for(int i=0 ; i <= 10 ; i++)
//				{
//					System.out.println(i);
//				}
//				
//
//				for(char i='a' ; i<='z' ; i++)
//				{
//					System.out.println(i);
//				}
//				
//				for(char i='A' ; i <='Z' ; i++)
//				{
//					System.out.print(i+"--");
//				}
				
				//print table till range 
				for(int i=1 ; i <= 5 ; i++)
				{
					for(int j=1 ; j <= 10 ; j++)
					{
						System.out.println(i + " * "+ j+ " = "+(i*j));
					}
				}
				
	}
}
