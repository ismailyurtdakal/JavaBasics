package com.syntax.class04;

public class NestedElseIf1 {

	public static void main(String[] args) {
		/*  if students completed a quiz, we will check for a score
		 * if score >90 --> great job
		 * if score >80 --> well done
		 * if score >70 --> you could have done better
		 * 
		 * if students did not complete the quiz --> not good 
		 * please do homework on time
		 */

		boolean quizCompleted=true;
		int score=86;
		
		if(quizCompleted) {
			System.out.println("Let's check your score");
			
			if (score>90) {
				System.out.println("Great job, your score is above 90 and you studied a lot");
				
			}else if (score>80) {
				System.out.println("Well done, your score is above 80");
			}else if(score>70) {
				System.out.println("Your score is above 70 but you could have done better");
			}else {
				System.out.println("Your score is below 70, unfortunatelly you have failed");
			}
		}else {
			System.out.println("Please do your HW on time");
		}

		
	}

}
