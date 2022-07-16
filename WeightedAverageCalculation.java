package com.jap.weightedaveragecalculator;

import java.util.Scanner;

public class WeightedAverageCalculation {

  // Function accepts academic scores as input parameters and outputs the overall
  // weighted average percentage of an individual.
  //Calculate the Overall Percentage
  public float averageCalculation(int assignmentScore, int projectScore, int quizScore, int midTermScore, int finalExamScore) {

		  System.out.println(assignmentScore * 0.1);
		  System.out.println(projectScore * 0.35);
		  System.out.println(quizScore * 0.1);
		  System.out.println(midTermScore * 0.15);
		  System.out.println(finalExamScore * 0.3);


      float overallPercentage = (assignmentScore*0.1f + projectScore*0.35f + quizScore*0.1f + midTermScore*0.15f + finalExamScore*0.3f);
      return overallPercentage;
  }

}
