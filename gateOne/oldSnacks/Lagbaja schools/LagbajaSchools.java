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

	
		int[] total = new int[students];
		float[] average = new float[students];
		int[] highestScores = new int[subjects];
		int[] lowestScores = new int[subjects];
		Arrays.fill(lowestScores, 106);
		int[] passCount = new int[students];
		int []failCount = new int[students];
		int highestOfHighest = 0;
		int lowestOfLowest = 0;
		int bestGraduating = 0;
		int worstGraduating = 0;
		int hIndex = 1;
		int lIndex = 1;
	for(int count1 = 0; count1 < students; count1++){
		System.out.println("    Entering score for student "+(count1+1));
		int passes = 0;
		int fails = 0;
		int sum = 0;
		highestOfHighest = 0;
		hIndex = 1;
		lowestOfLowest = 101;
		lIndex = 1;

		for (int count2 = 0; count2 < subjects; count2++) {
                System.out.println("Entering score for subject " + (count2 + 1));
                int score = userInput.nextInt();

                if (score < 0 || score > 100) {
                    System.out.print("Scores should be between 0 and 100");
                    return;
                }

                if (score < 40) {
                    	fails++;
               	 } else {
                	    passes++;
                }

                record[count1][count2] = score;
                sum += score;

	if (score > highestScores[count2]) {
                highestScores[count2] = score;
                bestGraduating = count1; 
            }
            if (score < lowestScores[count2]) {
                lowestScores[count2] = score;
                worstGraduating = count1; 
            }
            if (highestOfHighest < highestScores[count2]) {
                highestOfHighest = highestScores[count2];
                hIndex = count2;
            }
            if (lowestOfLowest > lowestScores[count2]) {
                lowestOfLowest = lowestScores[count2];
                lIndex = count2;
            }
            }	
		total[count1] = sum;
		float averageScore =(float) sum/subjects;
		average[count1] = averageScore;
		passCount[count1] = passes;
		failCount[count1] = fails;

	}





	System.out.println("\t==================================================================================");

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
		System.out.println("\t==========================================================================");



	int counter = 0;
	for(int count1 = 0; count1< record.length; count1++){
		System.out.print("\tStudent "+(count1+1)+"  ");
		counter = 0;
		for(int count2 = 0; count2 < record[count1].length; count2++){
			System.out.print("\t"+record[count1][count2]);
			
			

		}
			System.out.print("\t" + total[count1]);
			System.out.printf("\t %.1f" , average[count1]);
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
			System.out.println("\t=======================================================================");
			System.out.println("\t=======================================================================");

		

			if(counter > 1){
			System.out.println("There is a tie");
			}

		System.out.println("highest and lowest scores"+ highestOfHighest +" ,"+lowestOfLowest);
		
		System.out.println("courses that has the highest and lowest scores"+hIndex+" "+lIndex);
		System.out.println("worst and best graduating students: "+worstGraduating+" "+bestGraduating);
/*
		System.out.print(Arrays.toString(highestScores));
		System.out.print(Arrays.toString(lowestScores));

		System.out.print("passes "+Arrays.toString(passCount));
		System.out.print("fails "+Arrays.toString(failCount));
*/
	subjectSummary(record,students, subjects,highestScores,lowestScores, total, average, passCount, failCount,highestOfHighest,lowestOfLowest, hIndex, lIndex,bestGraduating,worstGraduating);





  }



  public static int[] position(int[] total, int index ){
	int[] secondary = new int[index];
	int[] positionArray = new int[index];


	for(int count = 0; count< index; count++){
	   	secondary[count] = total[count];

	}


	for (int count = 0; count < index - 1; count++) {
    for (int counter = count + 1; counter < index; counter++) {
        if (secondary[count] < secondary[counter]) {
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




  public static void subjectSummary(int[][] record, int students, int subjects, int[] highestScores, int[] lowestScores, int[] total, float[] average, int[] passCount, int[] failCount, int highestOfHighest, int lowestOfLowest, int hIndex, int lIndex, int bestGraduating, int worstGraduating) {
    int value = 0;
    int value2 = 0;
    for (int outCount = 0; outCount < students; outCount++) {
        int counter = 1;
        int counter2 = 1;
        value = 0;
        value2 = 0;
        for (int count = 0; count < subjects; count++) {
            if (highestScores[count] == record[outCount][count]) {
                value = counter;
            } else {
                counter++;
            }
            if (lowestScores[count] == record[outCount][count]) {
                value2 = counter2;
            } else {
                counter2++;
            }
        }
    }

    for (int count = 0; count < subjects; count++) {
        String summary = """

            Subject %d

            Highest scoring student: Student %d with a score of %d
            Lowest scoring student: Student %d with a score of %d
            Total score: %d
            Average score: %.2f
            Number of passes: %d
            Number of fails: %d

            """;
        System.out.printf(summary, (count + 1), value + 1, highestScores[count], value2, lowestScores[count], total[count], average[count], passCount[count], failCount[count]);
    }
int classTotalScore = 0;
int AverageScore = 0;
	for(int count = 0; count < students; count++){
   	  classTotalScore += total[count];
   	  AverageScore += average[count];

	}

	float classAverageScore = (float)AverageScore / students;

    int[] fcSorted = position(failCount, students);
    	int[] pcSorted = position(passCount, students);
    	int failed = fcSorted[0];
    int passed = pcSorted[0];
s
    String classSummary = """

        Hardest Subject: Subject %d with %d failures
        Easiest Subject: Subject %d with %d passes

        Highest Score: Student %d in Subject %d scoring %d
        Lowest Score: Student %d in Subject %d scoring %d

        CLASS SUMMARY

       	Best Graduating Student: Student %d scoring %d
        Worst Performing Student: Student %d scoring %d
        Class Total Score: %d
        Class Average Score: %.2f

        """;

    System.out.printf(classSummary,(lIndex + 1), failed, (hIndex + 1), passed, bestGraduating + 1, hIndex + 1, highestOfHighest, worstGraduating + 1, lIndex + 1, lowestOfLowest, bestGraduating + 1, total[bestGraduating], worstGraduating + 1, total[worstGraduating], classTotalScore, classAverageScore);

    System.out.println("Class Total Score: " + classTotalScore);
    System.out.println("Class Average Score: " + classAverageScore);
}


}


