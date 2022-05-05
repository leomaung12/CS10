package Assignments;
/*Program: ${Assignment15}.java          Date: ${5/5/2022}
Author: Leo Thein Maung
School: CHHS
Course: Computer Science 10

*/
import java.util.Scanner;

public class Assignment15 {

	public static void main(String[] args) {
		
		int frn = (int) (Math.random()*5); //
		int srn = 1 + (int) (Math.random()*10); 
		
		Scanner userinput = new Scanner(System.in);
		System.out.println("What is  " + frn + " * " + srn);
		int input = userinput.nextInt();
				if ( input == frn * srn)
				{
					System.out.println("You got it right! Congratulations!!" );
				}
				else 
				{
					Scanner userinput1 = new Scanner(System.in);
					System.out.println("You got it wrong. Please Try again." );
					int input1 = userinput.nextInt();
					
					if (input1 == frn * srn)
					{
						System.out.println("You got it right! Congratulations!!" );

					}
					
					else 
					{
						System.out.println("You got it wrong." );
					}

				}
	}

}
/* Screen Dump
What is  4 * 10
40
You got it right! Congratulations!!

What is  4 * 3
123
You got it wrong. Please Try again.
123
You got it wrong.



  */