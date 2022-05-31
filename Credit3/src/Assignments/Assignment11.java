package Assignments;

/*Program: ${Assignment11}.java          Date: ${5/3/2022}
Author: Leo Thein Maung
School: CHHS
Course: Computer Science 10

*/
import java.util.Scanner;

public class Assignment11 {

	  public static void main(String args[])
	  {
		  Scanner userinput = new Scanner(System.in); //input from user

		  System.out.println("Enter a three digit number: ");

			int threeDigits = userinput.nextInt(); //  input stored

			int one = threeDigits / 100; // variable one

			int two =  (threeDigits % 100)/10; // variable two

			int three =  (threeDigits % 100)%10; // variable three

			//scenario for 579 
			int max = 0;
			int min=0;
			

			 if (two > one && (three > two) && (one < three)) //579
			   {
				 max = three;
		         min = one;
				  System.out.println("The largest of the three digits is: " + max);
				  System.out.println("The smallest of the three digits is: " + min);
				  System.out.println("The sum of the three digits is: " + ( one + two + three));
				  System.out.println("The product of the three digits is: " + ( one * two * three));
				  System.out.println("The average of the three digits is: " + two );

			   }
			   
			   else if (one > two && (two > three) && (one > three)) // 931
			   {
				 max = one;
		         min = three;
				  System.out.println("The largest of the three digits is: " + max);
				  System.out.println("The smallest of the three digits is: " + min);
				  System.out.println("The sum of the three digits is: " + ( one + two + three));
				  System.out.println("The product of the three digits is: " + ( one * two * three));
				  System.out.println("The average of the three digits is: " + two );

			   }
			   else if (three > one && (two > three) && (one < two)) //486
			   {
				 max = two;
		         min = one;
				  System.out.println("The largest of the three digits is: " + max);
				  System.out.println("The smallest of the three digits is: " + min);
				  System.out.println("The sum of the three digits is: " + ( one + two + three));
				  System.out.println("The product of the three digits is: " + ( one * two * three));
				  System.out.println("The average of the three digits is: " + three );

			   }
			   else if (one > three && (two > one) && (three < two)) //452
			   {
				 max = two;
		         min = three;
				  System.out.println("The largest of the three digits is: " + max);
				  System.out.println("The smallest of the three digits is: " + min);
				  System.out.println("The sum of the three digits is: " + ( one + two + three));
				  System.out.println("The product of the three digits is: " + ( one * two * three));
				  System.out.println("The average of the three digits is: " + one );


			   }
			   else if (one > two && (three > one) && (two < three)) //536
			   {
				 max = three;
		         min = two;
				  System.out.println("The largest of the three digits is: " + max);
				  System.out.println("The smallest of the three digits is: " + min);
				  System.out.println("The sum of the three digits is: " + ( one + two + three));
				  System.out.println("The product of the three digits is: " + ( one * two * three));
				  System.out.println("The average of the three digits is: " + one );




			   }

		         
	  

	  }
	  }
	

/* Screen Dump
 Enter a three digit number: 
579
The largest of the three digits is: 9
The smallest of the three digits is: 5
The sum of the three digits is: 21
The product of the three digits is: 315
The average of the three digits is: 7



Enter a three digit number: 
452
The largest of the three digits is: 5
The smallest of the three digits is: 2
The sum of the three digits is: 11
The product of the three digits is: 40
The average of the three digits is: 4

  */