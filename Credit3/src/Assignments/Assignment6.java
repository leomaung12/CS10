package Assignments;
/*

Program: ${Assignment6}.java          Date: ${4/13/2022}


Author: Leo Thein Maung
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class Assignment6 {


	public static void main(String[] args) {

		
	
@SuppressWarnings("resource")
Scanner input = new Scanner(System.in); //Scanner class for keyboard input

System.out.println("What is your first name?");//prompting user to input value
String name = input.next(); // saving input into a variable

System.out.println("What is your last name?");//prompting user to input value
String lname = input.next();// saving input into a variable
lname += input.nextLine();//  used for spaces in input so does not display two questions at once, and more than one word per answer

System.out.println("What grade are you in? ");//prompting user to input value
int grade = input.nextInt();// saving input into a variable, int because of integer answer

System.out.println("What school do you attend?");//prompting user to input value
String school = input.nextLine();// saving input into a variable
school += input.nextLine();//  used for spaces in input so does not display two questions at once, and more than one word per answer

System.out.println("What is your favorite hobby?");//prompting user to input value
String hobby = input.next();// saving input into a variable
hobby += input.nextLine();//  used for spaces in input so does not display two questions at once, and more than one word per answer


	
System.out.println("Hello, your name is " + name + " " + lname + ". You are currently in grade " + grade + " at " + school + ". Your favorite hobby is " + hobby + "."); //printing out all values




}
	
	
}
	
/* Screen Dump
What is your first name?
Tarnpreet
What is your last name?
Chahal
What grade are you in?
10
What school do you attend?
CHHS
What is your favorite hobby?
Valorant
Hello, your name is Tarnpreet Chahal. ou are currently in grade 10 at CHHS. Your favorite hobby is Valorant.

What is your first name?
Leo
What is your last name?
Thein Maung
What grade are you in?
10
What school do you attend?
Crescent Heights High School
What is your favorite hobby?
Playing Basketball with friends
Hello, your name is Leo Thein Maung. ou are currently in grade 10 at Crescent Heights High School. Your favorite hobby is Playing Basketball with friends.
*/