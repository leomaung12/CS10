package Assignments;
/*

Program: ${PizzaCost}.java          Date: ${4/12/2022}


Author: Leo Thein Maung
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class PizzaCost {


	public static void main(String[] args) {

		//declaring variables to be used
		float x = (float) 0.75;
		float y = (float) 1.00; 
		float total = x + y ;
	
@SuppressWarnings("resource")
Scanner input = new Scanner(System.in); //Scanner class for input from keyboard

System.out.println("What is your first name?");
String name = input.next(); //collects user input for name

System.out.println("Please Enter the diameter of the pizza in inches:");
float diameter = input.nextInt();//collects user input for diameter using float class

float diametertotal = (float) (diameter * diameter * 0.05) ; // variable used to calculate diameter total
float totalvalue = diametertotal + total; // variable for total value using variables diametertotal and total
System.out.println("Thank you. " + name + ", Your total is " + "$" + totalvalue ); // final print using variables name and totalvalue




}
	
	
}
	
/* Screen Dump
What is your first name?
Leo
Please Enter the diameter of the pizza in inches:
10
Thank you. Leo, Your total is $6.75


What is your first name?
Tarnpreet
Please Enter the diameter of the pizza in inches:
48
Thank you. Tarnpreet, Your total is $116.95


What is your first name?
Ashton
Please Enter the diameter of the pizza in inches:
7
Thank you. Ashton, Your total is $4.2
*/