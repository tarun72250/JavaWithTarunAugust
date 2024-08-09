package day3_E_IterativeStatements;


//if i did not want to add any odd number in my result , used with continue keyword
public class A_09_ContinueClass {

	public static void main(String[] args) {
		
		
		for(int i =0 ; i<=10 ; i++)//0  1  2  3  4  5
		{
			if(i%2 != 0)
				continue;
			
			System.out.println(i);
		}
	}
}
