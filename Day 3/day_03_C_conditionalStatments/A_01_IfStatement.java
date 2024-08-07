package day_03_C_conditionalStatments;

public class A_01_IfStatement {

	public static void main(String[] args) {
		
		//1.
		int a = 20;
		int b = 40;
		
		if(a < b)
		{
			System.out.println("a is bigger");
		}
		
		//2
		String str = "Sourabh";
		String str1 = "Gautam";
		
		if(str == str1)
		{
			System.out.println("Names are same");
		}

		//3.
		boolean var = true;
		boolean var1 = true;
		
		if(var == var1)
		{
			System.out.println("Same");
		}

		//---------------------------------------------------------------------------------------------------
//Write a program that checks if a person is old enough to drive. If the person's age is 18 or older, print "You are old enough to drive." If the person is under 18, print how many years are left until they can drive.

		int age = 30;  // Replace with any age value
        if (age >= 18)
		{
            System.out.println("You are old enough to drive.");
        } 
		else 
		{
            System.out.println("You are left with " + (18 - age) + " years to drive.");
        }

      //---------------------------------------------------------------------------------------------------
//Write a program that compares your age with another person's age and prints who is older.

        int myAge = 25;  // Replace with your age
        int yourAge = 30;  // Replace with the other person's age
        
        if (yourAge > myAge) {
            System.out.println("You are " + (yourAge - myAge) + " years older than me.");
        } else if (yourAge < myAge) {
            System.out.println("I am " + (myAge - yourAge) + " years older than you.");
        } else {
            System.out.println("We are the same age.");
        }

      //---------------------------------------------------------------------------------------------------
//Write a program that compares two integer values using if-else and ternary operator.

        int a1 = 4;
        int b1 = 3;
        
        // Using if-else
        if (a1 > b1) 
		{
            System.out.println(a1 + " is greater than " + b1);
        } 
		else
		{
            System.out.println(a1 + " is less than " + b1);
        }

      //---------------------------------------------------------------------------------------------------
        // Using ternary operator
        String result = (a1 > b1) ? (a1 + " is greater than " + b1) : (a1 + " is less than " + b1);
        System.out.println(result);
// Write a program that checks if a given number is even or odd.
      int number = 9;  // Replace with any number
        
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

      //---------------------------------------------------------------------------------------------------
//Write a program that assigns a grade based on the given score using both if-else-if ladder and switch case.
 int score = 85;  // Replace with any score
        
        // Using if-else-if ladder
        if (score >= 80 && score <= 100) {
            System.out.println("A");
        } else if (score >= 70 && score <= 79) {
            System.out.println("B");
        } else if (score >= 60 && score <= 69) {
            System.out.println("C");
        } else if (score >= 50 && score <= 59) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }


      //---------------------------------------------------------------------------------------------------
		 // Using switch case
        switch (score / 10) {
            case 10:
            case 9:
            case 8:
                System.out.println("A");
                break;
            case 7:
                System.out.println("B");
                break;
            case 6:
                System.out.println("C");
                break;
            case 5:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }

      //---------------------------------------------------------------------------------------------------
//Write a program that checks the season based on the given month.
 String month = "October";  // Replace with any month
        
        switch (month.toLowerCase())
		 {
            case "september":
            case "october":
            case "november":
                System.out.println("Autumn");
                break;
            case "december":
            case "january":
            case "february":
                System.out.println("Winter");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("Spring");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("Summer");
                break;
            default:
                System.out.println("Invalid month.");
        }

      //---------------------------------------------------------------------------------------------------
//Write a program that checks if a given day is a weekend or a working day using both if-else-if ladder and switch case.
 // Using if-else-if ladder
 String day = "SaturDay";  // Replace with any day
        if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
            System.out.println(day + " is a weekend.");
        } else {
            System.out.println(day + " is a working day.");
        }
        
        // Using switch case
        switch (day.toLowerCase()) {
            case "saturday":
            case "sunday":
                System.out.println(day + " is a weekend.");
                break;
            default:
                System.out.println(day + " is a working day.");
        }

      //---------------------------------------------------------------------------------------------------

//Write a program that prints the number of days in a given month.
String month1 = "February";  // Replace with any month
        
        switch (month1.toLowerCase()) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println(month1 + " has 31 days.");
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println(month1 + " has 30 days.");
                break;
            case "february":
                System.out.println(month1 + " has 28 days.");
                break;
            default:
                System.out.println("Invalid month.");
        }

      //---------------------------------------------------------------------------------------------------
// /Days in a Month (Leap Year)

//Write a program that prints the number of days in a given month, considering leap years.
String month2 = "February";  // Replace with any month
        boolean isLeapYear = true;  // Replace with leap year check
        
        switch (month2.toLowerCase()) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println(month2 + " has 31 days.");
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println(month2 + " has 30 days.");
                break;
            case "february":
                if (isLeapYear) {
                    System.out.println(month2 + " has 29 days.");
                } else {
                    System.out.println(month2 + " has 28 days.");
                }
                break;
            default:
                System.out.println("Invalid month.");
        }

      //---------------------------------------------------------------------------------------------------
//Write a program that calculates the area of a rectangle given its length and breadth.
  double length = 5.0;  // Replace with any length
        double breadth = 3.0;  // Replace with any breadth
        
        double area = length * breadth;
        System.out.println("The area of the rectangle is: " + area);


      //---------------------------------------------------------------------------------------------------
//Write a program that finds the largest integer among two given integers.
 int num1 = 10;  // Replace with first number
        int num2 = 15;  // Replace with second number
        
        if (num1 > num2) {
            System.out.println(num1 + " is the largest integer.");
        } else {
            System.out.println(num2 + " is the largest integer.");
        }


      //---------------------------------------------------------------------------------------------------
//Write a program that assigns a grade based on given marks.
 int marks = 75;  // Replace with marks
        
        if (marks < 60) {
            System.out.println("F");
        } else if (marks < 70) {
            System.out.println("D");
        } else if (marks < 80) {
            System.out.println("C");
        } else if (marks < 90) {
            System.out.println("B");
        } else if (marks < 100) {
            System.out.println("A");
        }

      //---------------------------------------------------------------------------------------------------
//Write a program that assigns a branch based on given marks.
int marks2 = 85;  // Replace with marks
        
        String branch;
        if (marks2 > 90) {
            branch = "CS Branch";
        } else if (marks2 > 80) {
            branch = "Mechanical Branch";
        } else if (marks2 > 70) {
            branch = "Chemical Engineering";
        } else if (marks2 > 50) {
            branch = "Civil Engineering";
        } else {
            branch = "Bio Technology";
        }
        System.out.println("The student's branch is: " + branch);

        
//---------------------------------------------------------------------------------------------------
//Write a program that prints a message based on the weather condition and temperature.
String weather = "sunny";  // Replace with weather condition
        int temperature = 30;  // Replace with temperature
        
        if ("sunny".equalsIgnoreCase(weather)) {
            if (temperature > 30) {
                System.out.println("It's a hot sunny day.");
            } 
			else if 
			(temperature > 20) {
                System.out.println("It's a warm sunny day.");
            } 
			else 
			{
                System.out.println("It's a cool sunny day.");
            }
        } 
		else 
		{
            System.out.println("The weather is not sunny.");
		}
        
        
        
  	}
}
