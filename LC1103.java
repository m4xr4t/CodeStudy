package leetcodeProblems;

import java.util.Arrays;

public class LC1103 {
	public static void main(String[] args) {
		printArray(distributeCandies(7,4));
		printArray(distributeCandies(10,3));
//		printArray(distributeCandies(10,4));
//		printArray(distributeCandies(20,5));
//		printArray(distributeCandies(3,2));

	}
	
	public static int[] distributeCandies(int candies, int num_people) {
		
		int candyleft = candies;
		int candycost = 1;
		
		int[] candydistro = new int[num_people];
		for(int index = 0; index < candydistro.length; index++) {
			candydistro[index] = 0;
		}
		//above initialises out final array of people, with candy amount 0 per person
		
		
		while(candyleft > 0) {
			System.out.println("\n*****************\nWe are starting with " + candyleft + " candies!");

			for(int index = 0; index < candydistro.length; index++) {
				if(candyleft >= candycost) {
					System.out.println("\n   Turn:");

					//following we calculate the persons candy increase, then
					//  the deduction from candy left, then the cost plus1
					
					candydistro[index] += candycost;
					System.out.println("person " + (index+1) + " gets " + candycost + ", has " + candydistro[index]);

					candyleft -= candycost;
					System.out.println("we are left with " + candyleft + " candies");

					candycost++;
					System.out.println("Candycost has risen to " + candycost);
				}
				
				
				else if (candyleft < candycost) {
					candydistro[index] += candyleft;
					candyleft = 0;
					break;
				}
			}
			
		}
		return candydistro;
		
	}
	public static void printArray(int[] x) {
		System.out.println(Arrays.toString(x));
	}
}
