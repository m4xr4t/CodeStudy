package leetcodeProblems;

public class LC1979 {
	
	public static void main(String[] args) {
		int[] testA = {1,2,3,4};
		int[] testB = {2,5,6,9,10};
		int[] testC = {7,5,6,8,3};
		int[] testD = {3,3};
		
		System.out.println("For testA: " + findGCD(testA));
		System.out.println("For testB: " + findGCD(testB));
		System.out.println("For testC: " + findGCD(testC));
		System.out.println("For testD: " + findGCD(testD));


		
	}
    public static int findGCD(int[] nums) {
        int biggest = nums[0];
        int smallest = nums[0];
        int result = 0;

        for(int i = 0; i<nums.length; i++) {
            if (nums[i] > biggest) biggest = nums[i];
            if (nums[i] < smallest) smallest = nums[i];
        }
        System.out.println("Found biggest: " + biggest + " and smallest: " + smallest);
        for(int x = 1; x <= biggest; x++) {
            if (biggest % x == 0 && smallest % x == 0) {
                result = x;
                System.out.println("result is now: " + result);
            }
        }
        System.out.println("Final result: " + result);

        return result;
    }
}
