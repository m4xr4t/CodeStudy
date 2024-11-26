package leetcodeProblems;

public class LC896 {
	public static void main(String[] args) {
		int[] testA = {1,2,2,3};
		System.out.println(isMonotonic(testA) + " exp true");
		int[] testB = {6,5,4};
		System.out.println(isMonotonic(testB) + " exp true");
		int[] testC = {1,3,2};
		System.out.println(isMonotonic(testC) + " exp false");
		int[] testD = {1};
		System.out.println(isMonotonic(testD) + " exp true");
		int[] testE = {1,1,1,1};
		System.out.println(isMonotonic(testE) + " exp true");
		int[] testF = {6,5,4,4};
		System.out.println(isMonotonic(testF) + " exp true");
	}
	
	public static boolean isMonotonic(int[] nums) {
//		boolean res = true;
		
		boolean increases = true;
		boolean decreases = true;
		
		
		if(nums.length == 1) {
			return true;
		}
		
	//increasing
		for(int index = 0; index+1 < nums.length; index++) {
			if(nums[index] <= nums[index +1]) {
				increases = true;
			}
			else {
				increases = false;
				break;
			}
		}
		
	//decreasing
		for(int index = 0; index+1 < nums.length; index++) {
			if(nums[index] >= nums[index+1]) {
				decreases = true;
			}
			else {
				decreases = false;
				break;
			}
		}
		
		if(increases == true || decreases == true) return true;
		return false;
	}
}
