/*
Cyclically Rotate an Array by One: 
Rotate the elements of an array by one position to the right.
*/

import java.util.Arrays;
public class CyclicRotation{

    public static void main(String args[]){
	int [] array = {9, 10, 8, 7, 6, 5, 3};
	int [] array2 = new int [array.length];
	
	int left = array[array.length-1];

	for(int count = 0; count < array.length-1;count++){
	array2[count+1] = array[count];

	 array2[0] = left;
	}
	
	System.out.print(Arrays.toString(array2));
	
    }

}