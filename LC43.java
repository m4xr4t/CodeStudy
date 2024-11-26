package leetcodeProblems;

//Given two non-negative integers num1 and num2 represented as strings, 
//return the product of num1 and num2, also represented as a string.
//
//Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
//Strings are only digits, size between 1-200 DIGITS inclusive, no leading zero except string 0

public class LC43 {
	
	public static void main(String[] args) {
		System.out.println(multiply("123456789", "987654321"));
		System.out.println("\n\n");

		System.out.println(multiply("498828660196", "840477629533"));
		System.out.println("\n\n");

	}
	
	public static String multiply(String num1, String num2) {
		StringBuilder sb = new StringBuilder();
		String result;
		
		long d = Long.parseLong(num1);
		long e = Long.parseLong(num2);
		System.out.println("LongD " + d + " LongE " + e);

//		int a = (int) d;
//		int b = (int) e;
//		System.out.println("IntA " + a + " IntB " + b);

		long c = d*e;
		System.out.println("LongC " + c);

		sb.append(c);
		result = sb.toString();
		
		return result;
		
	}
}
