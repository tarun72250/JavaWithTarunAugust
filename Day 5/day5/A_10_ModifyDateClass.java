package day5;

public class A_10_ModifyDateClass {

	//instance data members
	private int dd , mm , yy ; 
	
	//default cons
	public A_10_ModifyDateClass()
	{
		
	}
	
	//parametrized cons
	public A_10_ModifyDateClass(int dd , int mm , int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public void showDate() {
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
	public void showDate(char ch)
	{
		System.out.println(dd+ch+" "+mm+" "+ch+yy);//11-11-2024
		
	}
}
