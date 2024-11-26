package leetcodeProblems;

public class LC1304 {

	public static void main(String[] args) {
	}
	
	public static int[] sumZero(int n) {
		
		int[] returnal = new int[n];
		
		if(n==1) returnal[0] = 0;
		
		if(n%2 == 0) {
			int adder = 1;
			for(int i = 0; i<n;i+=2) {
				returnal[i] = adder;
				returnal[i+1] = -adder;
				adder++;
			}
		}
		if(n%2 == 1) {
			int adder = 1;
			for(int i = 0; i<n-1;i+=2) {
				returnal[i] = adder;
				returnal[i+1] = -adder;
				adder++;
			}
			returnal[n] = 0;
		}
		
		
		
		return returnal;
		
	
	}
}
