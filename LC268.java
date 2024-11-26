package leetcodeProblems;

public class LC268 {
	
	public static void main(String[] args) {
		System.out.println("    If ReturnValue is -2, it was not changed during execution.");
		System.out.println("    If Returnvalue is -1, it means the loop couldnt find any digit to change, this is the default error code.\n");
		
		int[] testA = {1,0,3,4};
		System.out.println("Result: " + missingNumber(testA) +"\n**********");
		int[] testB = {0,1};
		System.out.println("Result: " + missingNumber(testB) +"\n**********");
		int[] testC = {1};
		System.out.println("Result: " + missingNumber(testC) +"\n**********");
		int[] testD = {0};
		System.out.println("Result: " + missingNumber(testD) +"\n**********");
		int[] testE = {1,2};
		System.out.println("Result: " + missingNumber(testE) +"\n**********");
 	}
	
	public static int missingNumber(int[] nums) {
		System.out.println("\nArray to test is ");
		printArray(nums);

		

		
		int testo = 0;
		for(int i = 0; i<nums.length;i++) {
			if(nums[i] == 0) {
				testo = 1;
			}
		}
		if (testo == 0) {
			System.out.println("No 0 found in nums, autoreturn 0");
			return 0;
		}
			
		if(nums.length == 1 && nums[0] == 0) return 1;
		if(nums.length == 1 && nums[0] == 1) return 0;
			
		int returnvalue = -2;
		int[] checkA = new int[nums.length+1];
		for(int i = 1;i<nums.length+1;i++) {
			checkA[i] = i;
		}
		System.out.println("  Testing checkA");
		printArray(checkA);
		
		
		
		for(int i = 0;i<nums.length;i++) {
			checkA[nums[i]] =0;
		}
		System.out.println("  checkA lost all digits that show up in nums. Remainder should be missing number.");
		printArray(checkA);

		
		for(int i = 0;i<checkA.length;i++) {
			if(checkA[i] > 0) {
				returnvalue = checkA[i];
				break;
			}
			else {
				returnvalue = -1;

			}
		}
		return returnvalue;
	}
	public static void printArray(int[] printMe) {
		for(int i = 0; i<printMe.length; i++) {
			System.out.print(" " + printMe[i] + " ");
		}
		System.out.println("\n-------------");
	}
}
