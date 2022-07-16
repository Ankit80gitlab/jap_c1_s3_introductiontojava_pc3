package com.jap.calorietracker;


public class CalorieTracker {

    //This function takes the calories burnt by the activities and the calorie intake in a day
    // and returns the weight lost by Anne

    public int weightLostInAMonth(int cycling,int running,int swimming,int calorieIntake)
    {
        // write logic here
		//anne does each excersice for 1 hour in a week so, in a month she will do each excersie 4 times.
		// calorie burned by cycling 300 for half an hour so 600 calories will be burned for with in an hour, similarly 400 for swiming & 1000by running so,
		int caloriedBurned = ((cycling*4 + swimming*4 + running*4)*2)-(calorieIntake*30);
        if (caloriedBurned<0)
		return 0;
		else
		return caloriedBurned/1000;
    }


    public static void main(String[] args) {
        CalorieTracker ct = new CalorieTracker();
        System.out.println("Weight lost by Anne in a month is : "+ct.weightLostInAMonth(300,200,500,2000)+" pounds");

    }
}
