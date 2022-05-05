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
			System.out.println("Please Enter your age" );
			int age = userinput.nextInt();
			
			if ( age > 18)
			{
				System.out.println("Adult" );

			}
			
			else if ( age >= 12)
			{
				System.out.println("Teen" );

			}
			
			else if ( age >= 10)
			{
				System.out.println("Preteen" );

			}
			
			else if ( age >= 5)
			{
				System.out.println("Child" );

			}
			
			else if ( age >= 0)
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