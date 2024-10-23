import java.util.*;
public class CreditCardValidation{

	public static void main(String args[]){
		try{
	        Scanner userInput = new Scanner(System.in);
		System.out.println("Hello, Kindly enter card details to verify: ");
		String creditCardNo = userInput.nextLine();
		int length = creditCardNo.length();
		
		String cardType = checkCardType(creditCardNo, length);
		String validity = isValid(creditCardNo);

			String value = ("""

			**Credit Card Type: %s**
			**Credit Card Number: %s**
			**Credit card Digit Length: %d**
			**Credit card Validity Status: %s**

			""");
	
		System.out.printf(value,cardType,creditCardNo,length,validity);
	
	}catch(Exception e){
		System.out.print("Input not correct");
		}

	}



   public static String checkCardType(String number, int length){
	
	if( length>= 13 && length<=16){
		char digit = number.charAt(0);
		char digit2 = number.charAt(1);

		if(digit == '4')return "Visa";
		else if(digit == '5')return "Mastercard";
		else if(digit == '6')return "Discover";
		else if(digit == '3' && digit2 == '7')return "American express";

	}
	
	return "Invalid card";

   }





	public static String isValid(String creditCardNo){
	long number = Long.parseLong(creditCardNo);
	ArrayList<Long> cardNo = new ArrayList<>();
	
		int counter = 0;
		while(number != 0){
			counter++;	
			long extract = number%10;
			cardNo.add(extract);
			long remain = number/10;
			number = remain;		
		}
		

		long sum = 0;
		for(int count = 0; count < counter; count++){
		  	long value = cardNo.get(count);
		     if(count % 2 != 0){
				value *=2;
				
			if(value >9){
			value = (value/10) + (value%10);
			}
			
		     }
			sum+=value;
		}
			if(sum % 10 ==0)return "valid";
			
			else return "invalid";
	}
 



}



