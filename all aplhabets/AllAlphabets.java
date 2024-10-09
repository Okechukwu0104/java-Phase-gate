import java.util.*;

public class AllAlphabets{
  public static void main(String args[]){

	String word = "The quick brown fox jumps over the lazy dog";
	word = word.toLowerCase();

	char [] letters = word.toCharArray();
	char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	char[] check = new char[26];
	
	String result = isComplete(letters , alphabets, check );
	System.out.print(result);
  }


    public static String isComplete(char[] letters , char[] alphabets, char[] check ){

	for (int count = 0; count < letters.length; count++) {
	    char pick = letters[count];
	   for(int counts = 0; counts < alphabets.length; counts++){
		if((int)pick == ((int)alphabets[counts]))check[counts] = pick;
		
	   }

	}

	if(Arrays.equals(alphabets,check))return("True");
	else return("False");

    }







}















