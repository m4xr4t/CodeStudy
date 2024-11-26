package leetcodeProblems;
import java.math.*;

public class LC326 {
	public static void main(String[] args) {
		System.out.println(isPowerOfThree(129140164));
		System.out.println(isPowerOfThree(3));
		System.out.println(isPowerOfThree(27));
		System.out.println(isPowerOfThree(28));
		System.out.println(isPowerOfThree(300));
		System.out.println(isPowerOfThree(531441));
		System.out.println(isPowerOfThree(531442));

	}

	public static boolean isPowerOfThree(int n) {
		boolean right = false;
		
		
		//attempt 2: take cube root and see if valid number
//		double b = (double) n;
//		double check = Math.cbrt(b);
//		
//		if(check == (int) check) {
//			right = true;
//		}
		
		//slow solution - count all 3^x for x to n. takes too long for 9 digit n's, which only have x of 20
//		for(int x = 0; x < n; x++) {
//			if(n == Math.pow(3, x)) {
//				right = true;
//				break;
//			}
//		}
		
		return right;
	}
}
