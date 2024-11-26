package leetcodeProblems;

public class LC628 {

	public static void main(String[] args) {
//		int[] testA = {1,2,3,4};
//		System.out.println(maximumProduct(testA));
//		int[] testB = {4,3,1,2};
//		System.out.println(maximumProduct(testB));
//		int[] testC = {-1,-9,-3};
//		System.out.println(maximumProduct(testC));
//		int[] testD = {1,2,100};
//		System.out.println(maximumProduct(testD));
		int[] testE = {-100,-2,-3,1};
		System.out.println(maximumProduct(testE));
//		int[] testF = {1,0,100};
//		System.out.println(maximumProduct(testF));
	}
	
	public static int maximumProduct(int[] nums) {
		//find two largest VALUE numbers
		//multiply originals
		
		int largestA = -1;
		int largestAIndex = 0;
		int largestB = -1;
		int largestBIndex = 0;
		int largestC = -1;
		int largestCIndex = 0;
//instead of looking at greater than 0 (which doesnt advance the index), bigger than -1 bc description permits it
		
		for(int i = 0; i<nums.length;i++) {
			System.out.println("  Checking " + nums[i] + " at index " + i + " against " + largestA);
			if(Math.abs(nums[i]) > largestA) {
				System.out.println("New Largest A found!");

				largestA = Math.abs(nums[i]);
				largestAIndex = i;
			}
			System.out.println("   LargestA " + largestA + " at index " + largestAIndex);
		}
		System.out.println("");

		
		for(int i = 0; i < nums.length; i++) {
			System.out.println("  Checking " + nums[i] + " at index " + i + " against " + largestB);
			if(Math.abs(nums[i]) > largestB && i != largestAIndex) {
				System.out.println("New Largest B found!");

				largestB = Math.abs(nums[i]);
				largestBIndex = i;
			}
			System.out.println("   LargestB " + largestB + " at index " + largestBIndex);
		}
		System.out.println("");

		for(int i = 0; i < nums.length; i++) {
			System.out.println("  Checking " + nums[i] + " at index " + i + " against " + largestC);
			//following we attempt to single out whether we gain more from a third neg or pos number
			if((largestA >= 0 && largestB >= 0) || (largestA <= 0 && largestB <= 0)) {
				if(Math.abs(nums[i]) > largestC && i != largestAIndex && i != largestBIndex) {
				
				System.out.println("New Largest C found!");

				largestC = Math.abs(nums[i]);
				largestCIndex = i;
				}

			}
			System.out.println("   LargestC " + largestC + " at index " + largestCIndex);
		}
		System.out.println("");

			System.out.println("FINAL LargestA " + largestA + " at index " + largestAIndex);
			System.out.println("FINAL LargestB " + largestB + " at index " + largestBIndex);
			System.out.println("FINAL LargestC " + largestC + " at index " + largestCIndex);

			System.out.println("stopping loop -------------------------- Result:");

		
		return largestA * largestB * largestC;

			//issue with it taking the maximum absolute value instead of highest
		//Therefore favors a large negative number
		//instead of multiplying by 1 would rather multiply by -2
			
		//C should be chosen based on whether we are currently neg or pos I think
		//complication using the correct number for the endresult
		//current testE fails the test. output 600 (-600 in LC lol) but expect 300
			
			
		
		
	}
}
