package Assignments;
/*Program: ${Assignment14}.java          Date: ${5/4/2022}
Author: Leo Thein Maung
School: CHHS
Course: Computer Science 10

*/
import java.util.Scanner;

public class Assignment14 {

	public static void main(String[] args) {
		  Scanner userinput = new Scanner(System.in);
			System.out.println("Please Enter your age" ); // asks user age
			int age = userinput.nextInt(); //  stores user age
			
			if ( age > 18)	
			{
				System.out.println("Adult" );

			}
			
			else if ( age >= 12)
			{
				System.out.println("Teen" ); //  if age is less than 18 or equal to 12 than it is a teen.

			}
			
			else if ( age >= 10) // if age is less than 12 or equal to 10 than it is preteen. 
			{
				System.out.println("Preteen" );

			}
			
			else if ( age >= 5) // if age is less than 10 or equal to 5 than it is a child.
			{
				System.out.println("Child" );

			}
			
			else if ( age >= 0) // if age is less than 5 or equal to 0 than it is a toddler.
			{
				System.out.println("Toddler" );

			}


	}

}
/* Screen Dump
Please Enter your age
7
Child

Please Enter your age
18
Teen

Please Enter your age
4
Toddler

  */