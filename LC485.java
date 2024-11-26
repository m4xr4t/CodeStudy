package leetcodeProblems;

public class LC485 {
	public static void main(String[] args) {
		int[] testA = {1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(testA));
		int[] testB = {1,0,1,1,0,1};
		System.out.println(findMaxConsecutiveOnes(testB));
		int[] testC = {1,1,1};
		System.out.println(findMaxConsecutiveOnes(testC));
		int[] testD = {1,0,1,0,1,1,3};
		System.out.println(findMaxConsecutiveOnes(testD));
	}
	
	public static int findMaxConsecutiveOnes(int[] nums) {
		int currentOneAmount=0;
		int highestConsecutiveOneAmount=0;
		for(int index = 0; index < nums.length; index++) {
			if(nums[index] == 1) {
				currentOneAmount++;
				if(currentOneAmount > highestConsecutiveOneAmount) {
					highestConsecutiveOneAmount = currentOneAmount;
				}
			}
			else {
				currentOneAmount = 0;
			}
		}
		return highestConsecutiveOneAmount;
	}
} 
