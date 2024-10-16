/*

check for the two numbers that give the largest product
*/
import java.util.*;
public class ArrayProduct{

	public static void main(String args[]){
	int [] set = {-9,4,1,2,144};

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
		if(Math.abs(set[count]) > largest){
			second = largest;
			 largest = Math.abs(set[count]);
			
		}else if(second < Math.abs(set[count]) && Math.abs(set[count]) < largest)second = Math.abs(set[count]);
	    }
		largestProductNumbers[0] = largest;
		largestProductNumbers[1] = second;
		return largestProductNumbers;


	}


}