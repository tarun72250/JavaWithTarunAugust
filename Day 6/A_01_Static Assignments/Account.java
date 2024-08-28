package day6;

public class Account {

	
	//instance dm - non-static dm - instance level information
	private int accno;
	private float balance;
	
	//static dm - class level information
	private static float int_rate;
	
	
	//static block
	//need :- to initialized static dm
	static {
		int_rate=4.5f;
		//this.accno=1;// cannot make a static refrence to the non-static feild accno.
	}
	
	
	//non-static dm are always initialized in constructor
	//need :- to initialized instance dm 
	public Account()
	{
		
	}
	
	public Account(int accno ,float balance)
	{
		this.accno=accno;
		this.balance=balance;
		//int_rate=i;
		//The static field Account.int_rate should be accessed in a static block or we shoulc always initialized in static block
	}
	
	//non-static method
	public void calBalance()
	{
		System.out.println("Account no :"+accno);
		System.out.println("Balance :"+balance);
		double bal =balance+(balance*int_rate/100);
		System.out.println("Balance with interest :"+bal);
	}
	
	
	
}
