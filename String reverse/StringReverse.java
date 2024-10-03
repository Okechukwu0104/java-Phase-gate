import java.util.*;

public class StringReverse{
   public static void main(String args[]){

	Scanner userInput = new Scanner(System.in);
	
	System.out.print("Input a sentence: ");

	String input = userInput.nextLine();


	 String [] words = input.split(" ");
	int total = words.length;

	 wordReverse(words, total);

	

   }



   public static void wordReverse(String [] words, int total){

	String [] reverseWords = new String [total];
	
	for(int count = 0; count < reverseWords.length; count++){
	
            reverseWords[count] = words[total - 1 - count];
        
	}
	 for(int count = 0; count < total; count++){
		System.out.print(reverseWords[count] + " ");
		}

	
	

   }


}

















