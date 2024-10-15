import java.util.*;
public class SumInArr{
   public static void main(String args[]){
	Scanner userInput = new Scanner(System.in);	

	int [] set = {3,4,1,9,6};

	System.out.print("input the sum: ");
	int userSum = userInput.nextInt();

	System.out.println("the numbers that can give the sum are: ");
	checkForSum(userSum, set);
	

   }



public static void checkForSum(int userSum, int [] set){
	for(int count1 = 0; count1 < set.length; count1++){
		int picked = set[count1];
	    for(int count2 = 1; count2 < set.length; count2++){
	
		if(picked + set[count2] == userSum ){

			
			System.out.println(count1+" , "+count2);

		}

	    }
	}

}



}