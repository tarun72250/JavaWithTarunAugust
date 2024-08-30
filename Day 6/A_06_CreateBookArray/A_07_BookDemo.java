package day6Demo;

public class A_07_BookDemo {

	public static void main(String[] args) {
		
		//primitive datatype array
//		int [] arr ;
//		arr = new int [3];
//		arr[0]=1;
//		arr[1]=2;
//		arr[2]=3;
//		
//		for(int i =0; i < arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		//Custome Class Book Array created 
		A_07_Book [] barr ;//refrence variable of class
		barr = new A_07_Book[3];//barr create the three size of book array
		
		barr[0] = new A_07_Book();//default cons 
		barr[1] = new A_07_Book(111,"Alex",101,"Mario","Pune");//para cons calling
		barr[2] = new A_07_Book(222,"Jahin",202,"Priyanka","Mumbai");//para cons calling
		
		for(int i =0 ; i< barr.length;i++)
		{
			barr[i].display();//barr[1].display();
			System.out.println("-------\n");
		}
		
		System.out.println("=====================================\nPrinting the book info which bookid :333");
		
		for(int i =0 ; i< barr.length;i++)
		{
			if(barr[i].getBookId()  == 333)
			{
				barr[i].display();
			}
			else
			{
				System.out.println("Bookid 333 is not available");
				break;
			}
		}
		
	}
}
