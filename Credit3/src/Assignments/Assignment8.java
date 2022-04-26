package Assignments;
/*

Program: ${Assignment8}.java          Date: ${4/14/2022}


Author: Leo Thein Maung
School: CHHS
Course: Computer Science 10
 

*/

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {

	@SuppressWarnings("resource")
	Scanner userinput = new Scanner(System.in);//Scanner class for keyboard input
		
		System.out.println("Enter a three digit number: ");//prompting user to input value
	
		int threeDigits = userinput.nextInt();
		
		int firstDigit = threeDigits / 100; // dividing input by 100 to find first digit
		
		int secondDigit =  (threeDigits % 100)/10; //using modulo to find second digit
		
		int thirdDigit =  (threeDigits % 100)%10; //using double modulo to find third digit

		
			//printing values
		System.out.println("The first digit is : "  + firstDigit);
		
		System.out.println("The second digit is : " + secondDigit);
		
		System.out.println("The third digit is : " + thirdDigit);




	}

}
/* Screen Dump

Enter a three digit number: 
743
The first digit is : 7
The second digit is : 4
The third digit is : 3


Enter a three digit number: 
951
The first digit is : 9
The second digit is : 5
The third digit is : 1


Enter a three digit number: 
193
The first digit is : 1
The second digit is : 9
The third digit is : 3
*/
