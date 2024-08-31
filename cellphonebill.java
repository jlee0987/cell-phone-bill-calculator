package project3;
import java.util.*;

/*
Description: This program calculates and prints a user's cellular telephone bill. 
*/

public class cellphonebill {

public static void main(String[] args) {

	//declaring console to input data using the scanner
	Scanner console = new Scanner(System.in);
	
	//input variables
	int accountNumber; //input variable to store the user's account number
	int daytimeMinutes; //input variable to store the number of daytime minutes used
	int nighttimeMinutes; //input variable to store the number of night time minutes used
	int regularMinutes; //input variable to store the number of regular minutes used
	String myName; //input variable to store the user's name
	String serviceType; //input variable to store the user's service type 
	
	//output variables
	double amountDue; //output variable to store the total amount due
	double daytimeAmountDue; //output variable to store the day over time charge
	double nighttimeAmountDue; //output variable to store the night over time charge
	
	//ask the user for input
	System.out.print("Enter your first and last name: ");
	myName= console.nextLine();

	System.out.print("Enter the account number: ");
	accountNumber= console.nextInt();
	System.out.println("");
	
	System.out.print("Enter the service type: regular or premium: ");
	serviceType= console.next();
	
	//if service type is premium
	if (serviceType.equalsIgnoreCase("premium")) {
		System.out.print("Enter the daytime minutes used: ");
		daytimeMinutes = console.nextInt();
		System.out.println("");
		System.out.print("Enter the nighttime minutes used: ");
		nighttimeMinutes = console.nextInt(); 
		
	//calculations for premium plan
	if(daytimeMinutes>75) 
		daytimeAmountDue =(daytimeMinutes-75)*0.10;
	else daytimeAmountDue = 0;
			
	if(nighttimeMinutes>100) 
		nighttimeAmountDue = (nighttimeMinutes-100)*0.05;
	else nighttimeAmountDue = 0;
	amountDue = 25+ daytimeAmountDue + nighttimeAmountDue;
	
		//output
		System.out.println("\nAccount Number: " + accountNumber);
		System.out.println("Service Type: Premium");
		System.out.println("Minutes Service Used (Day): " + daytimeMinutes);
		System.out.println("Minutes Service Used (Night): " + nighttimeMinutes);
		System.out.printf("Amount Due: $%.2f", amountDue);
	}
	//if service type is regular
	else if (serviceType.equalsIgnoreCase("regular")) {
		System.out.print("Enter the number of minutes service used: ");
		regularMinutes = console.nextInt();
		
	//calculations for regular plan
	if (regularMinutes>50)
		amountDue = 10+((regularMinutes-50)*0.20);
		else amountDue = 10;
		
		//output
		System.out.println("\nAccount Number: " + accountNumber);
		System.out.println("Service Type: Regular");
		System.out.println("Minutes Service Used: " + regularMinutes);
		System.out.printf("Amount Due: $%.2f", amountDue); 

	}
	//else invalid service
	else {
	System.out.println("Invalid Service Type.");
	
	}
	}//end of main
} //end of class
