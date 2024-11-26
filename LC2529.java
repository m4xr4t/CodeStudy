package leetcodeProblems;

public class LC2529 {

	
	
	public static int maximumCount(int[] nums) {
		int posCount = 0;
		int negCount = 0;
		
		for(int i = 0; i<nums.length; i++) {
			if(nums[i]>0) posCount++;
			if(nums[i]<0) negCount++;
		}
		return Math.max(posCount, negCount);
	}
}
