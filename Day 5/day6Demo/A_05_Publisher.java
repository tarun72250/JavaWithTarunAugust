package day6Demo;

public class A_05_Publisher {

	private int pubid;
	private String pub_name;
	private String pub_loc;
	
	//default cons
	public A_05_Publisher()
	{
//		this.pubid=0;
//		this.pub_name=null;
//		this.pub_loc= null;
	}
	
	//para cons
	public A_05_Publisher(int pubid , String pub_name , String pub_loc)
	{
		this.pubid=pubid;
		this.pub_name=pub_name;
		this.pub_loc=pub_loc;
	}
	
	//instance member method
	public void display()
	{
		System.out.println("Pubid :"+pubid);
		System.out.println("Pubulisher Name :"+pub_name);
		System.out.println("Pubulisher Location :"+pub_loc);
		
	}
	
}
