package leetcodeProblems;

public class LC367 {
	public static void main(String[] args) {
		System.out.println(isPerfectSquare(1));
		System.out.println(isPerfectSquare(4));
		System.out.println(isPerfectSquare(27));
		System.out.println(isPerfectSquare(16));

		System.out.println(isPerfectSquare(10));
		System.out.println(isPerfectSquare(808201)); //899
		System.out.println("We go until 46341 because 46340.something times itself is max:"); //899

		System.out.println(Integer.MAX_VALUE); //2147483647



	}
	
	public static boolean isPerfectSquare(int num) {
		boolean isIt = false;
		
		for(int number = 1; number < 46341; number++) {
			if (num == number*number) return true;
			continue;
		}
		
		
		return isIt;
	}
}
