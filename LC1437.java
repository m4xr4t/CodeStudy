package leetcodeProblems;

public class LC1437 {

	public static void main(String[] args) {
		int[] testA = {1,0,0,0,1,0,0,1};
		System.out.println(kLengthApart(testA, 2));
		int[] testB = {1,0,0,1,0,1};
		System.out.println(kLengthApart(testB, 2));
//		int[] testC = {1,0,0,0,1,0,0,1};
//		System.out.println(kLengthApart(testC, 2));
//		int[] testD = {1,0,0,0,1,0,0,1};
//		System.out.println(kLengthApart(testD, 2));
	}
	
	
	public static boolean kLengthApart(int[] nums, int k) {
		boolean res = true;
		
		for(int index = 0; index < nums.length; index++) {
			if (nums[index] == 1) {
				
				for(int f = 1; f <= k; f++) {
					if(index+f < nums.length) {
						//here make sure index+f are not out of bounds
						if(nums[index+f] == 1) res = false;
						continue;
					}
				}
			}
			
			
				
		}
		return res;
	}

}
