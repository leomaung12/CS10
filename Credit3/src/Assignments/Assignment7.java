package Assignments;
/*

Program: ${Assignment7}.java          Date: ${4/14/2022}


Author: Leo Thein Maung
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) 
	{

		
		@SuppressWarnings("resource")
		Scanner userinput = new Scanner(System.in); //Scanner class for keyboard input
		
		System.out.println("Enter the change in cents: ");//prompting user to input value
	
		int change = userinput.nextInt();
		
		int quarters = change / 25; //dividing input by quarters (25)
		
		int dimes =  ((change % 25)/10); // using modulo to find amount in dimes
		
		int nickels = ((change % 25)%10)/5;// using modulo to find amount in nickels
		
		int pennys = ((change % 25)%10)%5/1 ;// using modulo to find amount in pennys
		
		// printing out values
		
		System.out.println("The change you provided is : "  + change );
		
		System.out.println("Quarters : " + quarters);
		
		System.out.println("Dimes : " + dimes);
		
		System.out.println("Nickels : " + nickels);
		
		System.out.println("Pennys : " + pennys);

	
	}

}

/* Screen Dump
Enter the change in cents: 
515
The change you provided is : 515
Quarters : 20
Dimes : 1
Nickels : 1
Pennys : 0

Enter the change in cents: 
10000
The change you provided is : 10000
Quarters : 400
Dimes : 0
Nickels : 0
Pennys : 0

Enter the change in cents: 
4078
The change you provided is : 4078
Quarters : 163
Dimes : 0
Nickels : 0
Pennys : 3

*/