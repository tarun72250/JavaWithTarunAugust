package day3_E_IterativeStatements;

public class A_10_ReturnClass {

	
	public static void main(String[] args) 
	{
		A_10_ReturnClass r = new A_10_ReturnClass();
		int result = r.add(3,6);//non-static method call
		System.out.println("result of addition :"+result);
		System.out.println("------------------------\n");
		System.out.println("result of subtraction :"+r.subtract(10,5));//non-static method call
		
		//static method call
		swapNumber(2,3);
		System.out.println("------------------------\n");
		//static method call
		swapNumberWithoutThirdvar(4,5);
		
	}
	
	
	//non-static method declared 
	public int add(int a , int b)
	{
		return a+b;
	}
	
	//non-static method declared 
	public int subtract(int a ,int b)
	{
		int result = a-b;
		return result;
	}
	
	//static method declared
	public static void swapNumber(int a , int b)
	{
		System.out.println("before Swapping"+a+" "+b);
		int temp;
		temp = a;
		a= b;
		b=temp;
		System.out.println("After Swapping :"+a+" "+b);
	}
	
	//static method declared
	public static void swapNumberWithoutThirdvar(int a , int b)
	{
		System.out.println("before Swapping"+a+" "+b);
		a = a+b;//4+5 =9
		b = a-b;//9-5=4
		a = a-b;//9-4=5
		System.out.println("After Swapping :"+a+" "+b);

	}
}
