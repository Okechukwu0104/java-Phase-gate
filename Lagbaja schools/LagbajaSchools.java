import java.util.*;

public class LagbajaSchools{

  public static void main(String args[]){
	try{
	Scanner userInput = new Scanner(System.in);
	System.out.print("How many Students do you have: ");
	int students = userInput.nextInt();

	System.out.print("How many Subjects do you have: ");
	int subjects = userInput.nextInt();
	
	System.out.println("\nSaving>>>>>>>>>>>>>>>>>>>>\nSaved Successfully\n\n");

	int[][] record = new int[students][subjects];
	scoresAssignment(record, userInput, subjects, students);
	}catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a valid number.");
	}
	
  }

  public static void scoresAssignment(int[][] record, Scanner userInput, int subjects, int students ){

		try{
		int[] total = new int[students];
		float[] average = new float[students];
		int[] highestScores = new int[subjects];
		int[] lowestScores = new int[subjects];
		Arrays.fill(lowestScores, 101);
		int[] passCount = new int[students];
		int []failCount = new int[students];

	for(int count1 = 0; count1 < students; count1++){
		System.out.println("    Entering score for student "+(count1+1));
		int passes = 0;
		int fails = 0;
		int sum = 0;

		for(int count2 = 0; count2 < subjects; count2++){
			System.out.println("Entering score for subject "+(count2+1));
			int score = userInput.nextInt();
			if(score>100){System.out.print("Scores shouldnt be between 0 and 100");return;}
			if(score <40){fails++;}
			else{passes++;}
			
			record[count1][count2] = score;
			sum += score;

		
	    if (score > highestScores[count2]) {
                highestScores[count2] = score;
            }
            if (score < lowestScores[count2]) {
                lowestScores[count2] = score;
            }



		}
		
		total[count1] = sum;
		float averageScore =(float) sum/subjects;
		average[count1] = averageScore;
		passCount[count1] = passes;
		failCount[count1] = fails;

	}


	
	System.out.println("\t==================================================");

	String [] displays = {"STUDENTS","SUB","TOT", "AVE", "POS"};

	for(int count = 0; count < displays.length; count++){
		
		if(count ==1){
			for(int counts = 0; counts< subjects; counts++){
				System.out.print("\t"+displays[1]+""+(counts+1));
			}
		}
		else System.out.print("\t"+displays[count]);
	}
		System.out.println();
		System.out.println("\t=================================================");



	int counter = 0;
	for(int count1 = 0; count1< record.length; count1++){
		System.out.print("\tStudent "+(count1+1)+"  ");
		counter = 0;
		for(int count2 = 0; count2 < record[count1].length; count2++){
			System.out.print("\t"+record[count1][count2]);
			

		}
			System.out.print("\t" + total[count1]);
			System.out.print("\t" + average[count1]);
			int[] positions = position(total,students);
			System.out.print("\t" + positions[count1]);

			counter = 0;
		for(int counts1 = 0; counts1 < positions.length; counts1++){
			counter = 0;
			for(int count2 = 0; count2 < positions.length; count2++){
			if(positions[counts1]==positions[count2])counter++;
			}

		}
			
			System.out.println("");
				


		}
			System.out.println("\t============================================");
			System.out.println("\t============================================");

		

			if(counter > 1){
			System.out.print("There is a tie");
			}
/*
		System.out.print(Arrays.toString(highestScores));
		System.out.print(Arrays.toString(lowestScores));

		System.out.print("passes "+Arrays.toString(passCount));
		System.out.print("fails "+Arrays.toString(failCount));
*/
	subjectSummary(record,students, subjects,highestScores,lowestScores, total, average, passCount, failCount);

	}catch(Exception e){System.out.print("Invalid input");}



  }



  public static int[] position(int[] total, int index ){
	int[] secondary = new int[index];
	int[] positionArray = new int[index];


	for(int count = 0; count< index; count++){
	   	secondary[count] = total[count];

	}


	for(int count = 0; count < index; count++){
	   for(int counter = 1; counter < index; counter++){
		if(secondary[count] < secondary[counter]){
		int temp = secondary[count];
		secondary[count] = secondary[counter];
		secondary[counter] = temp;
		
		}
	   }
	}

	for(int count = 0; count< index; count++){
			int value = total[count];
			
		for(int count2 = 0; count2< index; count2++){
			if(value == secondary[count2]){
			positionArray[count] = count2+1;
			
			}
		}
	}
		return positionArray;
  }




  public static void subjectSummary(int[][] record,int students, int subjects, int[] highestScores,int[] lowestScores, int[] total,float[] average, int[] passCount, int[] failCount){
		int value = 0;
		int value2 = 0;
	for(int outCount = 0; outCount < students; outCount++){
		int counter =1;
		int counter2 =1;
		value = 0;
		value2 = 0;
		for(int count = 0; count < students; count++){

		if(highestScores[count] == record[outCount][count]) value = counter;
		else counter++;

		
		if(lowestScores[count] == record[outCount][count]) value2 = counter2;
		else counter2++;
		}
	
	}

	for(int count = 0; count < students; count++){
	String Summary = ("""


			subject %d
			Highest scoring student: Student %d with a score of %d
			Lowest scoring student: Student %d with a score of %d
			Total score: %d
			Average score: %.2f
			Number of passes: %d
			Number of fails: %d

			""");
	
		System.out.printf(Summary, (count+1), value, highestScores[count], value2, lowestScores[count], total[count], average[count], passCount[count], failCount[count] );

	
	}

		
	for(int outCount = 0; outCount < students; outCount++){
		int best =1;
		int worst =1;
		int bestScore = 0;
		int worstScore = 0;
		int worstSubject = 0;
		int bestSubject = 0;

		value = 0;
		value2 = 0;
		for(int count = 0; count < students; count++){

		if(total[count] == highestScores[count]){
		 value = best;
		bestScore = highestScores[count]
		}
		else best++;

		
		if(total[count] == lowestScores[count]){ 
		value2 = worst;
		worstScore = lowestScores[count];
		}
		else worst++;
		}
	
	}



	String classSummary = ("""

	Hardest Subject: Subject %d with %d failures
	Easiest Subject: Subject %d with %d passes
	Highest Score: Student %d in Subject %d scoring 98
	Lowest Score: Student %d in Subject 2 scoring %d

	CLASS SUMMARY

	Best Graduating Student: Student %d scoring %d
	Worst Performing Student: Student %d scoring &d
	Class Total Score: %d
	Class Average Score: %f

	""");

	System.out.printf(classSummary,  );

  }


}


