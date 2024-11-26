package leetcodeProblems;

public class LC29 {
	
	public static void main(String[] args) {
		System.out.println("max val " + Integer.MAX_VALUE);
		System.out.println(divide(-2147483648, -1));
		System.out.println(divide(-2147483647, -1));
		System.out.println(divide(1038925803, -2147483648));
		System.out.println(divide(-2147483647, -1));

		System.out.println(divide(-12, -3));

		
	}
	
	
	public static int divide(int dividend, int divisor) {
		
		int a = dividend;
		int b = divisor;
		int c = 0;

		if(a == 0) {
			c = 0;
		}
		
		if (a > Integer.MAX_VALUE || b > Integer.MAX_VALUE || a < Integer.MIN_VALUE || b < Integer.MIN_VALUE) {
			System.out.println("Uh oh overflowie");
		}
		
		if (a == Integer.MIN_VALUE && b == 1) {
			return Integer.MIN_VALUE;
		}
		if (a == Integer.MIN_VALUE && b == -1) {
			return Integer.MAX_VALUE;
		}
		if (a == Integer.MAX_VALUE && b == 1) {
			return Integer.MAX_VALUE;
		}
		if (a == Integer.MAX_VALUE && b == -1) {
			return Integer.MIN_VALUE;
		}
		
		
		
		
			
			
			if(a>0 && b>0) {
				while(a >= b) {
					a = a-b;
					c++;
				}
			}
			if(a<0 && b>0) {
				while(a< -b) {	//so for -12/4 it means while -12 is smaller than -4
					a = a + b;
					c--;
				}
			}
			if(a>0 && b<0) {
				while(a >= (-b)) {
					a = a + b;
					c--;
				}
			}
			if(a<0 && b<0) {
				while(a <= b) {
					a = a-b;
					c++;
				}
			}
		return  c;
	}

}
