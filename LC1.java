package leetcodeProblems;

public class LC1 {
	public static void main(String[] args) {
		int testArray[] = {2, 7, 11, 15};
		int tryme[] = twoSum(testArray, 9);
		System.out.println(tryme);
//		twoSum(testArray, 9);
	}
	
	public static int[] twoSum(int[] nums, int target) {
		int[] res = {0};
		return res;
	}
	

}



//			int[] sol = new int[2];
//			int[] ara = new int[nums.length];
//			int lae = nums.length;
//			int t = target;
//			int wrong[] = {99, 99};
//			
//			
//			for(int index = 0; index < lae-1; index++) {
//				for(int secInd = 1; secInd < lae; secInd++) {
//					
//					if(ara[index] + ara[secInd] == t) {
//						System.out.println("Lmao");
//						sol[0] = secInd;
//						sol[1] = index;
//						return sol;
//					}
//			
//				}
//			}
//			return wrong;
