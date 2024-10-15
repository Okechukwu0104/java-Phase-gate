/*

check for the two numbers that give the largest product
*/
import java.util.*;
public class ArrayProduct{

	public static void main(String args[]){
	int [] set = {3,4,1,9,6};

	int [] result = largestProduct(set);
	
	for(int numbers: result){
	System.out.print(numbers+" ");
	}
	

	}


	public static int [] largestProduct(int [] set){
	
		int [] largestProductNumbers = new int[2];
		int largest = set[0];
		int second = 0;

	    for(int count = 0; count < set.length; count++){
		if(set[count] > largest){
			second = largest;
			 largest = set[count];
			
		}else if(second < set[count] && set[count] < largest)second = set[count];
	    }
		largestProductNumbers[0] = largest;
		largestProductNumbers[1] = second;
		return largestProductNumbers;


	}


}