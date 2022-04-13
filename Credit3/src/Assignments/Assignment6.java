package Assignments;
/*

Program: ${Assignment6}.java          Date: ${4/12/2022}


Author: Leo Thein Maung
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class Assignment6 {


	public static void main(String[] args) {

		
	
@SuppressWarnings("resource")
Scanner input = new Scanner(System.in);

System.out.println("What is your first name?");
String name = input.next();

System.out.println("What is your last name?");
String lname = input.next();
lname += input.nextLine();

System.out.println("What grade are you in?");
int grade = input.nextInt();

System.out.println("What school do you attend?");
String school = input.nextLine();
school += input.nextLine();

System.out.println("What is your favorite hobby?");
String hobby = input.next();
hobby += input.nextLine();


	
System.out.println("Hello, your name is " + name + " " + lname + ". ou are currently in grade " + grade + " at " + school + ". Your favorite hobby is " + hobby + ".");




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