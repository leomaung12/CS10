package Assignments;
/*Program: ${Assignment17}.java          Date: ${5/11/2022}
Author: Leo Thein Maung
School: CHHS
Course: Computer Science 10

*/
import java.util.Scanner;
public class Assignment17 
{

	public static void main(String[] args) 
	{
		try (Scanner userinput = new Scanner(System.in)) 
		{
			double input = 0 ;
				
			while (input != -1)
			{
				System.out.print("Please enter your gpa. If you want to quit the program, type -1: "); // asks user for gpa
				input = userinput.nextDouble();
				
				if (input >= 3.8) // if else statements declaring gpa
				{
					System.out.print("summa cum laude.	\r\r");
				}
				
				else if ((input >= 3.65)&&(input < 3.8))
				{
					System.out.print("magna cum laude. \r\r");
				}
				
				else if ((input >= 3.5)&&(input < 3.65))
				{
					System.out.print("cum laude.	\r\r");
				}
				
				else if (input != -1)
				{
					System.out.print("Sorry, you didn't qualify for an honors .		\r\r");
				}
			}
			
			System.out.print("Thanks for using the program."); //  if user types -1
		}
		
		catch (Exception error) // prints error if there is error
		{ 
			System.out.println("error");
		} 
	}

}

/* Screen Dump
Please enter your gpa. If you want to quit the program, type -1: -1
Thanks for using the program.

Please enter your gpa. If you want to quit the program, type -1: 3.8
summa cum laude.	

Please enter your gpa. If you want to quit the program, type -1: 
	

Please enter your gpa. If you want to quit the program, type -1: 3.5000001
cum laude.	

Please enter your gpa. If you want to quit the program, type -1: 

  */