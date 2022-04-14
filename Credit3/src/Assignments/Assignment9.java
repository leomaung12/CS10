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
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = userinput.nextInt();
		System.out.println("Enter a second integer: ");
		int numbertwo = userinput.nextInt();
		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");

		
		System.out.println(number + "/" + numbertwo + " = " + (number / numbertwo));
		System.out.println(number + "%" + numbertwo + "=" + (number % numbertwo));

		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");

		
		System.out.println(numbertwo + "/" + number + " = " + (numbertwo / number));
		System.out.println(numbertwo + "%" + number + "=" + (numbertwo % number));


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