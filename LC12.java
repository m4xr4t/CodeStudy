//package leetcodeProblems;
//
//
//public class LC12 {
//	
//	public static void main(String[] args) {
//		prIntToRoman(1000);
//	}
//	
//	public static void prIntToRoman(int x) {
//		intToRoman(x);
//	}
//	
//	public String intToRoman(int num) {
//		
//		StringBuilder sb = new StringBuilder();
//		int n = num;
//		
//		//n is between 1-3999 inclusive
//		while(n>999) {
//			n -= 1000;
//			sb.append("M");
//		}
//		
//	
//		return(sb.toString());
//	}
//}