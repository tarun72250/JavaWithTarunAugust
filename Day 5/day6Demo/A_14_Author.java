package day6Demo;

public class A_14_Author {

	private String name;
	private String email;
	private long mobileNo;
	
	//default cons
	public A_14_Author()
	{
		
	}
	
	//para conss
	public A_14_Author(String name , String email , long mobileNo)
	{
		this.name=name;
		this.email=email;
		this.mobileNo=mobileNo;
	}
	//Getter and Setter 
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}


	
	//Override toString() method
	@Override
	public String toString() {
		return "A_14_Author [name=" + name + ", email=" + email + ", mobileNo=" + mobileNo + "]";
	}
}
