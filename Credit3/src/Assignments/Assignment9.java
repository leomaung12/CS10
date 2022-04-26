package Assignments;
/*

Program: ${Assignment9}.java          Date: ${4/14/2022}


Author: Leo Thein Maung
School: CHHS
Course: Computer Science 10
 

*/


import java.util.Scanner;

public class Assignment9 {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);//Scanner class for keyboard input
		System.out.println("Enter an integer: "); //prompting user to enter a number
		int number = userinput.nextInt();//stores info
		System.out.println("Enter a second integer: ");//prompting user to enter a second number
		int numbertwo = userinput.nextInt(); //stores info
		
		
		System.out.println(" "); //spacing
		System.out.println(" ");//spacing
		System.out.println(" ");//spacing
		
		
		System.out.println(number + "/" + numbertwo + " = " + (number / numbertwo));//	division agent
		System.out.println(number + "%" + numbertwo + "=" + (number % numbertwo));// remainder agent

		System.out.println(" ");//spacing
		System.out.println(" ");//spacing
		System.out.println(" ");//spacing

		
		System.out.println(numbertwo + "/" + number + " = " + (numbertwo / number));// division agent
		System.out.println(numbertwo + "%" + number + "=" + (numbertwo % number));// remainder agent


	}

}



/* Screen Dump


Enter an integer: 
19
Enter a second integer: 
27
 
 
 
19/27 = 0
19%27=19
 
 
 
27/19 = 1
27%19=8





Enter an integer: 
14
Enter a second integer: 
4
 
 
 
14/4 = 3
14%4=2
 
 
 
4/14 = 0
4%14=4


*/