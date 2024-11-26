package leetcodeProblems;

public class LC66 {
	public static void main(String[] args) {
		
		int[] test = new int[]{1,2,3,4};
		plusOne(test);
		int[] testz = new int[]{1,1,1,9};
		plusOne(testz);
		int[] testy = new int[]{1,9};
		plusOne(testy);

//		printArray(test);
		


		
		
	}

	public static int[] plusOne(int[] digits) {
		int[] ara = new int[digits.length];
		int lae = digits.length;
		
		for(int i = lae - 1; i >= 0; i--) {
			if (ara[i] != 9) {
				ara[i]++;
				break;
			}
			else if (ara[i] == 9) {
				ara[i] = 0;
			}	
	
		}
		
		printArray(ara);
		return ara;
		//at this point wrong array is returned
		//also, for whole completion we need to account for array of only 9's, by creating a new one
	}
	
	//THIS RETURNS BAD RESULT!!!!!!!!!!
	//on further inspection it actually seems to work, however returned bad result on interaction in
	//LC268
	public static void printArray(int[] printMe) {
		for(int i = 0; i<printMe.length; i++) {
			System.out.print(" " + printMe[i] + " ");
		}
		System.out.println("  <- thats it folks ");

	}
}
