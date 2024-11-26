package leetcodeProblems;

public class LC69 {

	public static void main(String[] args) {
//		System.out.println(mySqrt(123)); //= 11.09
//		System.out.println(mySqrt(4)); //= 2
		System.out.println(mySqrt(2147395600)); //= 46340


	}
	
	public static int mySqrt(int x) {
		long result = 0;
		while (result * result <= (long)x) {
			System.out.println("result (" + result + ") times itself (" + result*result + ") is smaller than x (" + x + ")");
			result++;
		}
		return (int) result-1;
	}
}
