package leetcodeProblems;

public class LC2341 {
 
	public static void main(String[] args) {
		
//			1,3,2,1,3,2,2
//			1,0,0,1,0,0,0
		
//		3,3,2,2,1,5,5
//		1,1,1,1,0,1,1
		
		int[] testA = {2,2,3,4};
		int[] testB = {3,3,3};
		int[] testC = {1,2,2,2,3,3};
		int[] testD = {1,2,3};
		int[] testE = {2,5,2};
		
		System.out.println("Looking at Array: ");
		printArray(testA);
		printArray(numberOfPairs(testA));
		System.out.println("--------\n");

		
		System.out.println("Looking at Array: ");
		printArray(testB);
		printArray(numberOfPairs(testB));
		System.out.println("--------\n");

		
		System.out.println("Looking at Array: ");
		printArray(testC);
		printArray(numberOfPairs(testC));
		System.out.println("--------\n");

		
		System.out.println("Looking at Array: ");
		printArray(testD);
		printArray(numberOfPairs(testD));
		System.out.println("--------\n");

		
		System.out.println("Looking at Array: ");
		printArray(testE);
		printArray(numberOfPairs(testE));
		System.out.println("--------\n");


	}
	
	public static int[] numberOfPairs(int[] nums) {
		
		int[] answer = {0, 0};
		int[] indexArray = new int[nums.length];
		int pairAmount = 0;
		int leftoverInts = 0;
		
		for(int i = 0; i<nums.length; i++) {
			if(indexArray[i] == 0) {
				for(int j = 0; j<nums.length; j++) {
					if(j != i && nums[i] == nums[j] && indexArray[j] == 0) {
						indexArray[i]++;
						indexArray[j]++;
						pairAmount++;
						break;
					}
				} //has checked all positions for pairs now
			}
		} //end of process
		
		for(int i = 0; i<indexArray.length; i++) {
			if(indexArray[i] == 0) leftoverInts++;
		}
		
		System.out.println("Amount of pairs found: " + pairAmount);
		System.out.println("Leftover Amount: " + leftoverInts);
		
		answer[0] = pairAmount;
		answer[1] = leftoverInts;
		return answer;
	}
	
	
	
	
	
	public static void printArray(int[] toPrint) {
		for(int i = 0; i<toPrint.length; i++) {
			if (i+1<toPrint.length) System.out.print(toPrint[i] + ", ");
			if (i+1 == toPrint.length) System.out.print(toPrint[i] + "\n");
		}
	}
}
