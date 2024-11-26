package leetcodeProblems;
import java.math.*;

//import java.lang.Math;

public class LC231 {
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(4));
		System.out.println(isPowerOfTwo(6));
		System.out.println(isPowerOfTwo(55));
		System.out.println(isPowerOfTwo(22));
		System.out.println(isPowerOfTwo(44));
		System.out.println(isPowerOfTwo(64));

	}
	
	public static boolean isPowerOfTwo(int n) {
		int solution = 0;
		boolean result = false;
		int x = 0;
		
		while(x < n) {
			int ch = (int) Math.pow(2, x);
			if(n == ch) {
				solution++;
			}
			x++;
		}
		if (solution > 0) {
			result = true;
		}
		return result;
		
	}

}
