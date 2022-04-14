package Assignments;
/*

Program: ${Assignment10}.java          Date: ${4/14/2022}


Author: Leo Thein Maung
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class Assignment10 {

	  public static void main(String args[])
	  {
		  
	    int number;
	    System.out.println("Enter an Integer number:");

	    Scanner input = new Scanner(System.in);
	    number = input.nextInt();

	   
	    if ( number % 2 == 0 )
	        System.out.println("The integer number " + number + " is even.");
	     else
	        System.out.println("The integer number " + number + " is odd.");
	  }
	}

/* Screen Dump
 Enter an Integer number:
197
The integer number 197 is odd.

Enter an Integer number:
2000
The integer number 2000 is even.

Enter an Integer number:
564564864
The integer number 564564864 is even.
 */
