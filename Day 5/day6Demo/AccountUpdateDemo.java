package day6Demo;

public class AccountUpdateDemo {

	public static void main(String[] args) {
		
		
		AccountUpdate a ;//refrence variable
		a = new AccountUpdate(101,30000.0f);
		a.calBalance();

		System.out.println("-------------------------------\n");
		
		AccountUpdate.updateRate(5.5f);
		
		System.out.println("-------------------------------\n");
		
		AccountUpdate a1;
		a1 = new AccountUpdate(102,40000.0f);
		a1.calBalance();
	}
}
