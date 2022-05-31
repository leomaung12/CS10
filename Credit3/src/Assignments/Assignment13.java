package Assignments;
/*Program: ${Assignment13}.java          Date: ${5/4/2022}
Author: Leo Thein Maung
School: CHHS
Course: Computer Science 10

*/
import java.util.Scanner;

public class Assignment13 {

	public static void main(String[] args) {
		
		  Scanner userinput = new Scanner(System.in);
		  
			System.out.println("Enter the number of copies to be printed: " ); //asks user how many copies to be printed
			int pc = userinput.nextInt(); // stores user input

		
			if (pc >= 1000) // if else statements.
			{ 
			System.out.println ("Price per copy is: $0.25" );
			System.out.println ( "Total cost is: $" + pc * 0.25);

			}
			
			else if (pc >= 750)
			{ 
			System.out.println ("Price per copy is: $0.26" );
			System.out.println ( "Total cost is: $" + pc * 0.26);

			}
			
			else if (pc >= 500)
			{ 
			System.out.println ("Price per copy is: $0.27" );
			System.out.println ( "Total cost is: $" + pc * 0.27);

			}
			
			else if (pc >= 100)
			{ 
			System.out.println ("Price per copy is: $0.28" );
			System.out.println ( "Total cost is: $" + pc * 0.28);

			}
			else if (pc >= 0)
			{ 
				System.out.println ( "Price per copy is: $0.30" );
				System.out.println ( "Total cost is: $" + pc * 0.3);

			}

		}
}

/* Screen Dump
Enter the number of copies to be printed: 
1011
Price per copy is: $0.25
Total cost is: $252.75

Enter the number of copies to be printed: 
147
Price per copy is: $0.28
Total cost is: $41.160000000000004

  */