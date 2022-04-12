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

		float x = (float) 0.75;
		float y = (float) 1.00; 
		
		float total = x + y ;
	
@SuppressWarnings("resource")
Scanner input = new Scanner(System.in);

System.out.println("What is your first name?");
String name = input.next();

System.out.println("Please Enter the diameter of the pizza in inches:");
float diameter = input.nextInt();

float diametertotal = (float) (diameter * diameter * 0.05) ;
float totalvalue = diametertotal + total;
System.out.println("Thank you. " + name + ", Your total is " + "$" + totalvalue );




}
	
	
}
	
/* Screen Dump
What is your first name?
Leo
Please Enter the diameter of the pizza in inches:
10
Thank you. Leo, Your total is $6.75
*/