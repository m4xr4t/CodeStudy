package leetcodeProblems;

public class LC1550 {

	public static void main(String[] args) {

	}
	
	public static boolean threeConsecutiveOdds(int[] arr) {
		boolean res = false;
		
		for(int index = 0; index < arr.length-2; index++) {
			if(arr[index]%2 != 0 && arr[index+1]%2 != 0 && arr[index+2]%2 != 0) {
				res = true;
			}
		}
		return res;
	}

}
