import java.util.Scanner ;
import java.util.Arrays;

public class SquareOrder{

    public static void main(String args[]){

	int [] array1 = {2,1,4,3,5,9};
	int [] array2 = new int [array1.length];
	int [] array3 = new int [array1.length];

	for(int count = 0; count < array1.length; count++){
	    array2[count] = array1[count] * array1[count];
	
	}
	
	System.out.println("original: "+Arrays.toString(array1));

	for(int count = 0; count < array2.length; count++){
		int digit = array2[count];
		int temp = 0;

	    for(int counts = 0; counts < 24; counts++){
		if(digit > array2[count])continue;
		else{
		   temp = array2[count];
		   
		array3[count] = temp; 
		   
		}
		

	    }
	}

	System.out.print("Squared & arranged: "+Arrays.toString(array3));
	

   }


}