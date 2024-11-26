package leetcodeProblems;

public class LC342 {
	public static void main(String[] args) {
		System.out.println(isPowerOfFour(4));
		System.out.println(isPowerOfFour(16));
		System.out.println(isPowerOfFour(3));
		System.out.println(isPowerOfFour(1000));
		System.out.println(isPowerOfFour(12));
		

	}
	
	public static boolean isPowerOfFour(int n) {
		boolean isIt = false;
		for(int x = 0; x < 16; x++) {
			if (n == Math.pow(4, x)) {
				isIt = true;
				break;
			}
			else {
				isIt = false;
			}
		}
		return isIt;
		
		
//		return isIt;
	}
}
