package leetcodeProblems;

public class LC1748 {
	public static void main(String[] args) {
		int[] testA = {2,2,3,4};
		int[] testB = {1,2,2,3,3,3};
		int[] testC = {1,2,2,2,3,3};
		int[] testD = {1,2,3};
		int[] testE = {2,5,2};
		System.out.println("Welcome to the \"Sum of Unique\" arraychecker! It adds sums of all unique ints in an array!");

		System.out.println("\nLooking at Array: ");
		printArray(testA);
		System.out.println(sumOfUnique(testA));
		
		System.out.println("\nLooking at Array: ");
		printArray(testB);
		System.out.println(sumOfUnique(testB));
		
		System.out.println("\nLooking at Array: ");
		printArray(testC);
		System.out.println(sumOfUnique(testC));
		
		System.out.println("\nLooking at Array: ");
		printArray(testD);
		System.out.println(sumOfUnique(testD));
		
		System.out.println("\nLooking at Array: ");
		printArray(testE);
		System.out.println(sumOfUnique(testE));
		

	}
	
    public static int sumOfUnique(int[] nums) {
        int sum = 0;

        for (int i = 0; i<nums.length; i++) {
            boolean isM = false;
        	System.out.println("Checking position no. " + (i+1) + ", which is a " + nums[i]);
        	
            for (int index = 0; index<nums.length; index++) {
                if(i != index && nums[i] == nums[index]) {
                	isM = true;
                	System.out.println("!    at pos " + (index+1) + ", found another "+nums[index] +", so isM = true" );
                }
                else if (i == index) {
                	System.out.println("     position " + (index+1) +" is where the original lives.");
                }
                else if (nums[i] != nums[index]) {
                	System.out.println("     " + nums[index] + " is not a " + nums[i] + ", so no double");

                }
            }
        	if(isM == true) System.out.println(nums[i] +" is not unique, so its gettin skipped!");
            if(isM == false) {
            	System.out.println("Wasnt a double, so adding it to sum :)");
            	System.out.print(" --> sum (" + sum + ")");
            	sum += nums[i];
            	System.out.println("... has increased by " + nums[i] +", new sum: " + sum);
            }
        	System.out.println(" (done with this pos, going next.)\n");

        }
    	System.out.println("------\nReturning final sum: " + sum +"\n------");

        return sum;
    }
    
	public static void printArray(int[] toPrint) {
		for(int i = 0; i<toPrint.length; i++) {
			if (i+1<toPrint.length) System.out.print(toPrint[i] + ", ");
			if (i+1 == toPrint.length) System.out.print(toPrint[i] + "\n");
		}
	}
}
