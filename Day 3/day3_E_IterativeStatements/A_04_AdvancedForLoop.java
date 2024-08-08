package day3_E_IterativeStatements;

public class A_04_AdvancedForLoop {

	public static void main(String[] args) {
		
		int [] numbers = {1,2,3,4,5,};
		
		for(int i =0 ; i <= numbers.length ; i++)
		{
			System.out.println(i);
		}
		
		//advanced for loop 
		//for(typeOfArray variableName : ArrayName)
		for(int hrishabh:numbers)
		{
			System.out.println(hrishabh);
		}
	}
}
