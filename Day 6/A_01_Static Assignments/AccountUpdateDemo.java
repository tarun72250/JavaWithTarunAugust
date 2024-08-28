package day6;

public class AccountUpdateDemo {

	public static void main(String[] args) {
		
		AccountUpdate u;
		u = new AccountUpdate(1001,30000.0f);
		u.calBalance(); // non-static method call
		
		System.out.println("-------------------------------\n");
		AccountUpdate.updateRate(5.5f);
		
		AccountUpdate u1;
		u1 = new AccountUpdate(1001,30000.0f);
		u1.calBalance(); // non-static method call
		
		
	}
}
