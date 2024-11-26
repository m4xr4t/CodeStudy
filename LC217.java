package leetcodeProblems;

public class LC217 {
	public static void main(String[] args) {
		int[] testArray = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(containsDuplicate(testArray));
		int[] testA = {1,2,3,4,5,6,7,8,9,10,2};
		System.out.println(containsDuplicate(testA));
		int[] testB = {1,2,3,4};
		System.out.println(containsDuplicate(testB));
		int[] testC = {1,5,-2,-4,0};
		System.out.println(containsDuplicate(testC));
	}

	public static boolean containsDuplicate(int[] nums) {
		int highest = 0;
		int lowest = 0;
		for(int pos = 0; pos < nums.length; pos++) {
			if (nums[pos] > highest) {
				highest = nums[pos];
			}
		}
		for(int neg = 0; neg < nums.length; neg++) {
			if (nums[neg] < lowest) {
				lowest = nums[neg];
			}
		}
		//code above defines the lowest and highest int in nums
		
		int[] ara = new int[highest+1];
		boolean found = false;
	
		//new plan: go through nums and increment for each value at ara(value)
		//then go through ara and look for any over 1
		for(int pos = 0; pos < ara.length; pos++) {
			ara[pos] = 0;
		}
//AT THIS POINT MUST DECIDE BETWEEN POS AND NEG NUMBER TO CHECK
		for(int index = 0; index < nums.length; index++) {
			ara[nums[index]]++;
		}
		for(int index = 0; index < ara.length; index++) {
			if (ara[index] > 1) {
				found = true;
			}
		}
			return found;	

			
			
			
//This code works but gives timeout for 10k length in LC
//		for(int index = 0; index < nums.length; index++) {
//			for(int secdex = index+1; secdex < nums.length; secdex++) {
//				if(nums[index] == nums[secdex]) {
//					found = true;
//					break;
//				}
//			}
//		}
				

	}
}


