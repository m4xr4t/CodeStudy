package leetcodeProblems;

public class LC1464 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int maxProduct(int[] nums) {
		int high1 = 0;
		int high2 = 0;
		int high1index = 0;
		
		for (int index = 0; index < nums.length; index++) {
			if(nums[index] > high1) {
				high1 = nums[index];
				high1index = index;
			}
		}
		for (int index = 0; index < nums.length; index++) {
			if(nums[index] > high2 && index != high1index) high2 = nums[index];
		}
		
		return (high1 - 1) * (high2 - 1);
	}

}
