package Assignments;
/*Program: ${Assignment12}.java          Date: ${5/4/2022}
Author: Leo Thein Maung
School: CHHS
Course: Computer Science 10

*/
import java.util.Scanner;

public class Assignment12 {

	public static void main(String[] args) {
		  Scanner userinput = new Scanner(System.in);

		  System.out.println("Enter your grade percentage : ");
		  
			int gp = userinput.nextInt();
			
			if (gp >= 90)
			{ 
			System.out.println("The corresponding letter grade is: A+");
			}
			
			else if ( gp >= 80)
			{ 
			System.out.println("The corresponding letter grade is: A");
			}
			
			else if ( gp >= 75)
			{ 
			System.out.println("The corresponding letter grade is: B+");
			}
			
			else if ( gp >= 70)
			{ 
			System.out.println("The corresponding letter grade is: B");
			}
			else if ( gp >= 65)
			{ 
			System.out.println("The corresponding letter grade is: C+");
			}
			else if ( gp >= 60)
			{ 
			System.out.println("The corresponding letter grade is: C");
			}
			else if ( gp >= 55)
			{ 
			System.out.println("The corresponding letter grade is: D+");
			}
			else if ( gp >= 50)
			{ 
			System.out.println("The corresponding letter grade is: D");
			}
			else 
			{
				System.out.println("The corresponding letter grade is: F");

			}

	}

}

/* Screen Dump
Enter your grade percentage : 
99
The corresponding letter grade is: A+

Enter your grade percentage : 
67
The corresponding letter grade is: C+


  */
