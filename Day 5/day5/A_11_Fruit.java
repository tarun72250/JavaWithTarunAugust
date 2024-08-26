package day5;

public class A_11_Fruit {

	//instance data members
	private String fruitName;
	private boolean isSeeded;
	private char vitamin;
	
	//default cons
	public A_11_Fruit()
	{
		
	}
	
	//parametrized cons
	public A_11_Fruit(String fruitName , boolean isSeeded , char vitamin)
	{
		this.fruitName= fruitName;
		this.isSeeded=isSeeded;
		this.vitamin= vitamin;
	}
	
	public void display()
	{
		if(isSeeded == true)
		{
			System.out.println("Seeded Fruit "+fruitName+" contains Vitamin "+vitamin);
		}
		else
		{
			System.out.println("Seedless Fruit "+fruitName+" contains Vitamin "+vitamin);

		}
	}
	
}
