package Assignments;

import java.util.Scanner;

public class JavaProject { 

	public static void main(String[] args) {
		
		double amount; // variable for input
		double Rupee, UsDollar, Pound, Euro, Yen, Cad; // variable for currencies
		int choice;
		
		Scanner input = new Scanner(System.in);
		
	      System.out.println("Please Select what Currency you would like to use :"); // shows the available choices.
	      System.out.println("Enter 1: Rupee");
	      System.out.println("Enter 2: US Dollar");
	      System.out.println("Enter 3: Pound");
	      System.out.println("Enter 4: Euro");
	      System.out.println("Enter 5: Yen");
	      System.out.println("Enter 6: Cad");
	      
	      System.out.print("\nChoose from above options: ");
	      choice = input.nextInt(); // stores input on which currency the user currently has
	 
	      System.out.println("Enter the amount you want to convert?");
	      amount = input.nextFloat(); //  stores input of how much they would like convert with the currency that they inputed.
	      switch (choice)
	      {
	         case 1:  // Rupee Conversion, first case indicates rupee conversion to different currencies
	            UsDollar = amount / 77.82;
	            System.out.println(amount + " Rupee = " + UsDollar + " Dollar");
	 
	            Pound = amount / 95.83;
	            System.out.println(amount + " Rupee = " + Pound + " Pound");
	 
	            Euro = amount / 81.21;
	            System.out.println(amount + " Rupee = " + Euro + " Euro");
	 
	            Yen = amount / 0.60;
	            System.out.println(amount + " Rupee = " + Yen + " Yen");
	            
	            Cad = amount / 60.60;
	            System.out.println(amount + " Rupee = " + Cad + " Cad");
	            
				System.out.print("Thanks for using the program.");

	            break;
	            
	         case 2: // US Dollars , second case indicates US dollar conversion to different currencies
	        	 Rupee = amount * 77.819405;
	             System.out.println(amount + " Dollar = " + Rupee + " Rupees");
	             
	             
	             Pound = amount *0.81157883;
	             System.out.println(amount + " Dollar = " + Pound + " Pound");

	             Euro = amount *0.95796518;
	             System.out.println(amount + " Dollar = " + Euro + " Euro");

	             Yen = amount *129.11047 ;
	             System.out.println(amount + " Dollar = " + Yen + " Yen");

		         Cad = amount * 1.2842172;
		         System.out.println(amount + " Dollar = " + Cad + " Cad");
		         
					System.out.print("Thanks for using the program.");

		            break;

	         case 3: // Pound , third case indicates pound conversion to different currencies
	        	 
	        	 Rupee = amount * 96.733134;
	             System.out.println(amount + " Pound = " + Rupee + " Rupee");
	             
	             
	             UsDollar = amount * 1.2488801;
		         System.out.println(amount + " Pound = " + UsDollar + " UsDollar");

	             Euro = amount *1.1840065;
	             System.out.println(amount + " Pound = " + Euro + " Euro");

	             Yen = amount *161.59502 ;
	             System.out.println(amount + " Pound = " + Yen + " Yen");

		         Cad = amount * 1.600037;
		         System.out.println(amount + " Pound = " + Cad + "Cad");

					System.out.print("Thanks for using the program.");

		            break;
		       
	         case 4: // Euro
	        	 
	        	 Rupee = amount * 81.682998;
	             System.out.println(amount + " Euro = " + Rupee + " Rupees");
	             
	             
	             UsDollar = amount * 1.0548634;
		         System.out.println(amount + " Euro = " + UsDollar + " Dollar");

		         Pound = amount *0.84460718;
	             System.out.println(amount + " Euro = " + Pound + " Pound");

	             Yen = amount * 136.48546  ;
	             System.out.println(amount + " Euro = " + Yen + " Yen");

		         Cad = amount * 1.3515036;
		         System.out.println(amount + " Euro = " + Cad + " Cad");

					System.out.print("Thanks for using the program.");

		            break;
       case 5: // Yen
	        	 
	        	 Rupee = amount * 0.59838444;
	             System.out.println(amount + " Yen = " + Rupee + " Rupees");
	             
	             
	             UsDollar = amount * 0.0077287734;
		         System.out.println(amount + " Yen = " + UsDollar + " Dollar");

		         Pound = amount *0.0061877792;
	             System.out.println(amount + " Yen = " + Pound + " Pound");

	             Euro = amount *0.0073265009;
	             System.out.println(amount + " Yen = " + Euro + " Euro");

		         Cad = amount * 0.0099033088;
		         System.out.println(amount + " Yen = " + Cad + " Cad");

					System.out.print("Thanks for using the program.");

		            break;
		            
       case 6: // Cad
      	 
      	 Rupee = amount * 81.682998;
           System.out.println(amount + " Cad = " + Rupee + " Rupee");
           
           
           UsDollar = amount * 1.0548634;
	         System.out.println(amount + " Cad = " + UsDollar + " Dollar");

	         Pound = amount *0.84460718;
           System.out.println(amount + " Cad = " + Pound + " Pound");

           Yen = amount * 136.48546  ;
           System.out.println(amount + " Cad = " + Yen + " Yen");

           Euro = amount *0.73971007;
           System.out.println(amount + " Cad = " + Euro + " Euro");
           
			System.out.print("Thanks for using the program.");

	            break;

	             
	             //Default case
	         default:
	            System.out.println("Invalid Input + Error"); //  prints if error
	            
	            
	      }
	}
}


	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            /* Screen Dump
Please Select what Currency you would like to use :
Enter 1: Rupee
Enter 2: US Dollar
Enter 3: Pound
Enter 4: Euro
Enter 5: Yen
Enter 6: Cad

Choose from above options: 6
Enter the amount you want to convert?
1500
1500.0 Cad = 122524.497 Rupee
1500.0 Cad = 1582.2950999999998 Dollar
1500.0 Cad = 1266.91077 Pound
1500.0 Cad = 204728.18999999997 Yen
1500.0 Cad = 1109.565105 Euro
Thanks for using the program.

Please Select what Currency you would like to use :
Enter 1: Rupee
Enter 2: US Dollar
Enter 3: Pound
Enter 4: Euro
Enter 5: Yen
Enter 6: Cad

Choose from above options: 4
Enter the amount you want to convert?
1800
1800.0 Euro = 147029.3964 Rupees
1800.0 Euro = 1898.7541199999998 Dollar
1800.0 Euro = 1520.292924 Pound
1800.0 Euro = 245673.82799999998 Yen
1800.0 Euro = 2432.70648 Cad
Thanks for using the program.
	            */
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	
			    

		
		

	



