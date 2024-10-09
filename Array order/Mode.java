/*
Find Duplicates in an Array: Identify duplicate elements in an array.
*/

public class Mode{
	public static void main(String args[]){


		int [] array = {3,5,2,2,7,1,-1,-1,3,1,5,3,-1,3,2,1,10};
		int total = array.length;	
			

			
		for(int count = 0; count < total; count++){
			int digit = array[count] ;
			
			int counter = 0;
		    for(int counts = 0; counts < total; counts++){
			if(digit == array[counts])counter++;
			
		    }	

		
		for (int i = 0; i < total; i++) {
                    if (array[i] == digit) {
                        array[i] = -0000000000000;
                    }	
		}


		if(counter >=2 && digit != -0000000000000 )System.out.println("Number "+digit+" occoured "+counter+" time(s)");
			
		}
	
	}

}