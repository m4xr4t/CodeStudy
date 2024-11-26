package leetcodeProblems;

public class LC1480 {
	public static void main(String[] args) {
		//solved
	}
	
	public static int[] runningSum(int[] nums) {
		int[] newNums = new int[nums.length];
		newNums[0] = nums[0];
		
		for(int index = 1; index < nums.length; index++) {
			newNums[index] = nums[index]+newNums[index-1];
		}
		return newNums;
	}
}
