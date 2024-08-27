package day6;

public class AccountUpdate {

		//instance dm - non-static dm - instance level information
		private int accno;
		private float balance;
		
		//static dm - class level information
		private static float int_rate;
		
		
		//static block
		static {
			int_rate=4.5f;
			//this.accno=1;// cannot make a static refrence to the non-static feild accno.
		}
		
		//non-static dm are always initialized in constructor
		public AccountUpdate()
		{
			
		}
		
		public AccountUpdate(int accno ,float balance)
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
		
		//My need is to update static dm 
		public static void updateRate(float new_rate)
		{
			System.out.println("In updateRate static method");
			int_rate= new_rate;
		}
}
