package day3_E_IterativeStatements;
//Question: Write a do...while loop to implement a simple menu-driven program.
import java.util.Scanner;

public class A_07_MenuDrivenProgram 
{
 public static void main(String[] args)
 {
	 //This will take input from user 
     Scanner scanner = new Scanner(System.in);
     
     int ch ;
     do {
    	 System.out.println("Menu:");
         System.out.println("1. Add");
         System.out.println("2. Subtract");
         System.out.println("3. Multiply");
         System.out.println("4. Divide");
         System.out.println("5. Exit");

         System.out.print("Enter your choice: ");
    	 ch = scanner.nextInt();
    	 
    	 switch(ch)
    	 {
    	 case 1 :
    		 System.out.print("Enter two numbers for Addition: ");
             int a = scanner.nextInt();
             int b = scanner.nextInt();
             System.out.println("Result: " + (a + b));
             System.out.println("----------------------------------------\n");
             break;

    	 case 2 :
    		 System.out.print("Enter two numbers for Subtraction: ");
             int c = scanner.nextInt();
             int d = scanner.nextInt();
             System.out.println("Result: " + (c - d));
             System.out.println("----------------------------------------\n");

             break;
             
    	 case 3 :
    		 System.out.print("Enter two numbers for multiplication: ");
             int e = scanner.nextInt();
             int f = scanner.nextInt();
             System.out.println("Result: " + (e * f));
             System.out.println("----------------------------------------\n");

             break;
    		 
    	 case 4 :
    		 System.out.print("Enter two numbers for Divide : ");
             int g = scanner.nextInt();
             int h = scanner.nextInt();
             if(h!=0)
             {
            	 System.out.println("Result :"+((double)g/h));
                 System.out.println("----------------------------------------\n");
             }
             else
             {
            	 System.out.println("Cannot divide by zero....!");
             }
             break;
    	 case 5 :
    		 System.out.println("Existing....!");
    		 break;
    	default:
    			 System.out.println("Invalid choice , Please try again...!");
    	 }
    	 
     }while(ch!=5);
 }
}
