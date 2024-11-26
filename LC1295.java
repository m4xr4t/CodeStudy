package leetcodeProblems;

public class LC1295 {

	public static void main(String[] args) {
		int[] testA = {12,345,2,6,7896};
		System.out.println(findNumbers(testA));
		
		
//		System.out.println(digitAmountOf(4));
//		System.out.println(digitAmountOf(123));
//		System.out.println(digitAmountOf(12345));
//		System.out.println(digitAmountOf(9999));
//		System.out.println(digitAmountOf(22));
//		System.out.println(digitAmountOf(2222));
//		System.out.println(digitAmountOf(22222));

	}
	
	public static int findNumbers(int[] nums) {
		int evenCount = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(digitAmountOf(nums[i])%2 == 0) {
//				System.out.println("Dis Even " + nums[i]);
				evenCount++;
			}
		}
		return evenCount;
	}
	
	
	
	public static int digitAmountOf(int i) {
//		System.out.print("For " + i + " digitamount is: ");

		int digitcount = 1;
		
		if (i<10) return 1;
		while(i >= 10) {
			i = i/10;
			digitcount++;
		}
		return digitcount;
	}
}
