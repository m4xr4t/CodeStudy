package leetcodeProblems;

public class LC1394 {

	public static void main(String[] args) {
		int[] testA = {2,2,3,4};
		int[] testB = {1,2,2,3,3,3};
		int[] testC = {1,2,2,2,3,3};
		int[] testD = {1,2,3};
		int[] testE = {2,5,2};

		findLucky(testA);
//		findLucky(testB);
//		findLucky(testC);
//		findLucky(testD);

	}
	
	public static int findLucky(int[] arr) {
		
		int largestLuckyInt = 0;
		int largestLuckyIntAmount = 0;
		boolean luckyExists = false;
		
		for(int index = 0; index<arr.length; index++) {
// init counter for frequency
			int intFrequency = 0;
			
//go through array to find matches
			for (int i = 0; i<arr.length; i++) {
//if match found, increase counter
				if (arr[i] == arr[index] && i != index) {
					luckyExists = true;
					intFrequency++;
					System.out.println("Found a match for (index) arr[" + index +"] at (i) arr[" + i + "]");
					System.out.println(" - Number " + arr[i] + " is same as " + arr[index]);
					System.out.println("Amount of matches for original number (" + arr[index] +") is " + intFrequency);
					System.out.println("  (moving on) \n");
					System.out.println(" ONE FREQ to "+ intFrequency);

				}
			}
			System.out.println("TWO FREQ to "+ intFrequency);
			//ERROR SOMEWHERE here
			//returns 0 instead of -1 for no lucky
			//probably something with a +1 somewhere
			//make the counters uniform, either count total occurances or matches (total-1)
			
			
			
//after counting how often our int appears, see if its lucky
			if(intFrequency+1 == arr[index]) {
//if yes, see if its occured more/is larger (must be same number in comaring!!) than previous amount/number
				if(arr[index] > largestLuckyInt) {
					largestLuckyIntAmount = intFrequency;
					largestLuckyInt = arr[index];
				}
			}

		}
		if (luckyExists == false) {
			System.out.println("Uh oh, no lucky found! Returning -1 :)");
			return (-1);
		}
		
//after this, we return the lli, which appeared llia times
		System.out.println("Largest Lucky int is " + largestLuckyInt + ", appearing " + (largestLuckyIntAmount+1) + " times!");
		
		return largestLuckyInt;
		
	}
}
