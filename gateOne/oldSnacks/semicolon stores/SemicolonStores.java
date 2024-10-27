
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SemicolonStores{

	public static void main(String args[]){
		Scanner userInput = new Scanner(System.in);
				
			System.out.println("\nWhat is the customer's Name");
			String name = userInput.nextLine();
	
	int dcount = 0;
	for (int count = 0; count < name.length(); count++) {
		char output = name.charAt(count);
                if (Character.isDigit(output)) dcount++;
		
        }

		if(dcount <1) dataCollection(name, userInput);
		else System.out.print("There cant be a digit in a customers name ");
	

	}

	
	
	public static void dataCollection(String name, Scanner userInput){

	
			 List<String> itemsRecord = new ArrayList<>();
			 List<Integer> quantityRecord = new ArrayList<>();
			List<Float> costPerUnitRecord = new ArrayList<>();
			 List<Float> totalRecord = new ArrayList<>();	
		
			boolean done = false;
		while(true){
			try{

			System.out.println("\nWhat did the user buy?");
			String item = userInput.nextLine();
				itemsRecord.add(item);	
				

			System.out.println("\nHow many pieces?");
			int quantity = Integer.parseInt(userInput.next());
				quantityRecord.add(quantity);
				

			System.out.println("\nHow much per unit?");
			float costPerUnit =Float.parseFloat(userInput.next());
				costPerUnitRecord.add(costPerUnit);



			float total = costPerUnit * quantity;
				totalRecord.add(total);

			
			String choice = decision1(userInput);

				

			if(choice.equalsIgnoreCase("yes")){continue;}

			else if(choice.equalsIgnoreCase("no")){

			float totalSum = 0;
			for(int count = 0; count < totalRecord.size(); count++){
				totalSum += totalRecord.get(count);
			}

			System.out.println("\nWhat is your name?");
			String cashiersName = userInput.nextLine();



			System.out.println("\nHow much discount will the customer get? ");
			float input3 = userInput.nextFloat();
		
			float discount = (float) totalSum * (input3 / 100);
			float billTotal = totalSum - discount;

	

		String firstDisplay = displays(name,cashiersName,userInput,itemsRecord,quantityRecord,totalRecord,totalSum,discount,input3,costPerUnitRecord,billTotal);
			float payment = decision2(userInput);
			float balance = payment - billTotal;
			done = true;

			if(done){
	finalDisplay(name,cashiersName,userInput,itemsRecord,quantityRecord,totalRecord,totalSum,discount,input3,costPerUnitRecord,payment, balance, firstDisplay );

		
			return;
			}

			}else {System.out.println("Pls input yes or no");decision1(userInput);  }

		    }catch(Exception e){System.out.print("Wrong input");}
		}



	}


		public static String decision1(Scanner userInput){

			System.out.println("\nAdd more items?(yes/no): ");
			String input = userInput.next();
			userInput.nextLine();
			return input;
			
		}

		public static float decision2(Scanner userInput){

			System.out.print("How much did the Customer give to you?: ");
			float payment = userInput.nextFloat();
			return payment;
			
		}


		public static String timeDisplay(){


		LocalDateTime currentTime = LocalDateTime.now();
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MMM-YY h:mm:ss a");
		String timeFormat = currentTime.format(pattern);
		return timeFormat;
			
		}



	public static String displays(String name,String cashiersName,Scanner userInput,List<String> itemsRecord,List<Integer> quantityRecord, List<Float> totalRecord, float totalSum, float discount, float input3, List<Float> costPerUnitRecord,float billTotal){

	timeDisplay();
		
	String display1 = ("""

	
	SEMICOLON STORES
	-----------------
	MAIN BRANCH
	LOCATION: 312, Herbert Macaulay Way, Sabo Yaba, Lagos.
	Tel: 03293828343
	Date: %s
	Cashier: %s
	Customer Name: %s

	===================================================================
		ITEM		QTY		PRICE		TOTAL(NGN)
	-------------------------------------------------------------------	

	""");
	System.out.printf(display1,timeDisplay(),cashiersName,name );


	theLoop(itemsRecord, quantityRecord, totalRecord, costPerUnitRecord);

	float vat = (float) 0.075 * totalSum;
	float realTotal = vat + billTotal;
	

	String display2 = ("""
	-------------------------------------------------------------------

						Sub Total: 	 %.2f 
						Discount:	 %.1f 
						VAT @ %.2f :	 %.2f 
	===================================================================
						Bill Total:	 %.2f 
	===================================================================

		THIS IS NOT AN ACTUAL RECEIPT. KINDLY PAY %.2f NGN.

	===================================================================
		""");

	System.out.printf(display2,totalSum,discount,input3,vat,realTotal,realTotal);

	return display1;


	}



	public static void theLoop(List<String> itemsRecord,List<Integer> quantityRecord, List<Float> totalRecord, List<Float>costPerUnitRecord){
		
		for(int count = 0; count < totalRecord.size(); count++){
		System.out.printf("        %-10s     ",itemsRecord.get(count));
		System.out.printf("  %-10d",quantityRecord.get(count));
		System.out.printf("     %-10.2f",costPerUnitRecord.get(count));
		System.out.printf("      %-10.2f",totalRecord.get(count));
		System.out.println();
		}


	}



	public static void finalDisplay(String name,String cashiersName,Scanner userInput,List<String> itemsRecord,List<Integer> quantityRecord, List<Float> totalRecord, float totalSum, float discount, float input3, List<Float> costPerUnitRecord,float payment,float balance , String firstDisplay){

	timeDisplay();
		

	System.out.print(firstDisplay);


	theLoop(itemsRecord, quantityRecord, totalRecord, costPerUnitRecord);

	float vat = (float) 0.075 * totalSum;
	float billTotal = totalSum - discount;
	float realTotal = vat + billTotal;
	float change = payment - realTotal ;

	String display2 = ("""
	-------------------------------------------------------------------

						Sub Total: 	 %.2f 
						Discount:	 %.1f 
						VAT @ %.2f :	 %.2f 
	===================================================================

						Bill Total:	 %.2f 
						Amount Paid:	 %.2f 
						Balance: 	 %.2f 
	===================================================================

			  THANK YOU FOR YOUR PATRONAGE

	===================================================================
		""");

	System.out.printf(display2,totalSum,discount,input3,vat,realTotal,payment,change);

	

	}	

	

}