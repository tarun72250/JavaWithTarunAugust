package day3_E_IterativeStatements;
//Question: Write a do...while loop to implement a simple menu-driven program.
import java.util.Scanner;

public class MenuDrivenProgram {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int choice;
     do {
         System.out.println("Menu:");
         System.out.println("1. Add");
         System.out.println("2. Subtract");
         System.out.println("3. Multiply");
         System.out.println("4. Divide");
         System.out.println("5. Exit");
         System.out.print("Enter your choice: ");
         choice = scanner.nextInt();
         switch (choice) {
             case 1:
                 System.out.print("Enter two numbers: ");
                 int a = scanner.nextInt();
                 int b = scanner.nextInt();
                 System.out.println("Result: " + (a + b));
                 break;
             case 2:
                 System.out.print("Enter two numbers: ");
                 int c = scanner.nextInt();
                 int d = scanner.nextInt();
                 System.out.println("Result: " + (c - d));
                 break;
             case 3:
                 System.out.print("Enter two numbers: ");
                 int e = scanner.nextInt();
                 int f = scanner.nextInt();
                 System.out.println("Result: " + (e * f));
                 break;
             case 4:
                 System.out.print("Enter two numbers: ");
                 int g = scanner.nextInt();
                 int h = scanner.nextInt();
                 if (h != 0) {
                     System.out.println("Result: " + ((double) g / h));
                 } else {
                     System.out.println("Cannot divide by zero.");
                 }
                 break;
             case 5:
                 System.out.println("Exiting...");
                 break;
             default:
                 System.out.println("Invalid choice. Please try again.");
         }
     } while (choice != 5);
 }
}
