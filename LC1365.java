package leetcodeProblems;

public class LC1365 {

	public static void main(String[] args) {
		int[] testA = {8,1,2,2,3};
//		System.out.println(smallerNumbersThanCurrent(testA));
		printArray(smallerNumbersThanCurrent(testA));
	}
	
	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int[] solution = new int[nums.length];
		
		for(int i = 0; i<nums.length; i++) {
			for(int index = 0; index<nums.length; index++) {
				if(nums[index] < nums[i]) solution[i]++;
			}
		}
		return solution;
	}
	
	
	//-------------------------------------  UTILITY
	public static void printArray(int[] toPrint) {
		for(int i = 0; i<toPrint.length; i++) {
			if (i+1<toPrint.length) System.out.print(toPrint[i] + ", ");
			if (i+1 == toPrint.length) System.out.print(toPrint[i] + "\n");
		}
	}
}
