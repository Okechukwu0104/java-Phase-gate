/*
You are given an array of integers. Write a Java function to sort this array in descending order using the selection sort algorithm. Explain how the selection sort algorithm works and discuss its time complexity.
*/

import java.util.Arrays;

public class DecreasingOrder{

    public static void main(String args[]){

	int [] first = {6,3,10,5,44,7,8};
	int total = first.length;
		
	int[] result = inDescendingOrder(first, total);

	System.out.print(Arrays.toString(result));

    }


	
	public static int[] inDescendingOrder(int [] first , int total){

	for(int count = 0; count < total; count++){
	   for(int counter = 1; counter < total; counter++){
		if(first[counter-1] < first[counter]){
		int temp = first[counter-1];
		first[counter -1] = first[counter];
		first[counter] = temp;
		

		}
		

	   }


	}

	return first;


	}

}