package leetcodeProblems;

public class LC1317 {

	public static void main(String[] args) {
		getNoZeroIntegers(5);
		getNoZeroIntegers(12);
		getNoZeroIntegers(11);
		getNoZeroIntegers(10);
		getNoZeroIntegers(123);
		getNoZeroIntegers(1010);

	}
	
	
	public static int[] getNoZeroIntegers(int n) {
		//a and b must not CONTAIN a 0
		System.out.println("For " + n + ": "); 

		int[] sol = new int[2];
		int a, b;
		
		if((n-1)%10 != 0) {
			a = 1;
			b = n-a;
		}
		else {
			a = 2;
			b = n-a;
		}
		
		
		
		sol[0] = a;
		sol[1] = b;
		System.out.println("a: " + a + " b: " + b); 
		return sol;
	}

}
//Code will break on 1010, falsely returning 1 and 1009
//checks for last digit 0, but not in the middle
//int to string?
//int to array?