package leetcodeProblems;

public class LC1523 {

	public static void main(String[] args) {

	}
	
	public static int countOdds(int low, int high) {
		
		int counter = 0;
		if(high==low && low%2 == 0) return 0;
		if(high==low && low%2 == 1) return 1;
		
		
		if (low%2==0)low++;
		if (high%2==0)high--;
		
		for(int i = low; i <= high; i+=2) {
			counter++;
		}
		return counter;
	}

}
