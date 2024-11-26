package leetcodeProblems;

public class LC2455 {

	public static void main(String[] args) {
		int[] testA = {1,2,3,4};
		int[] testB = {1,3,6,10,12,15};
		int[] testC = {1,2,4,7,10};
		int[] testD = {4,4,9,10};
		
		System.out.println("For testA: " + averageValue(testA));
		System.out.println("For testB: " + averageValue(testB));
		System.out.println("For testC: " + averageValue(testC));
		System.out.println("For testD: " + averageValue(testD));

	}
	
	public static int averageValue(int[] nums) {
		int amountCounter = 0;
		int addedInts = 0;
		
		
		
		for(int i = 0; i<nums.length; i++) {
			if (nums[i] % 3 == 0 && nums[i] % 2 == 0) {
				amountCounter++;
				addedInts += nums[i];
			}
			
		}
        if(amountCounter == 0) return 0;
		return addedInts/amountCounter;
	}
}
