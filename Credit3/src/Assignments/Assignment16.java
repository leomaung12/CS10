package Assignments;
/*Program: ${Assignment16}.java          Date: ${5/5/2022}
Author: Leo Thein Maung
School: CHHS
Course: Computer Science 10

*/
import java.util.Scanner;

public class Assignment16 {

	public static void main(String[] args) {
		
		int srn = 1 + (int) (Math.random()*20); // random number generated
		
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 20:");
		int input = userinput.nextInt(); //  user enters random number
		
		System.out.println("Computer's Number : " + srn); //  prints computers number
		System.out.println("Your Number : " + input); //  prints your number

				if ( input ==  srn)
				{
					System.out.println("You got it right! Congratulations!!" ); //  if they got it right
				}
				else 
				{
					Scanner userinput1 = new Scanner(System.in);
					System.out.println("Better luck next time."); // if they get it wrong
				
				}
	}

}
/* Screen Dump

Enter a number between 1 and 20:
19
Computer's Number : 19
Your Number : 19
You got it right! Congratulations!!

Enter a number between 1 and 20:
7
Computer's Number : 14
Your Number : 7
Better luck next time.
	

  */