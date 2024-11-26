package leetcodeProblems;

public class LC319 {

	public int bulbSwitch(int n) {
		
		int result = 0;
		int[] bulbIndex = new int[n];
		for(int i = 0; i<n; i++) {
			bulbIndex[i] = 0;
		}
		//this has initialised an array of length n, amount of bulbs. all are 0 (off).
		//now create a loop that for the ith round turns off every ith bulb.
		//perhaps just take i and jump this number in steps?
		//in the end, the goal is to add all the indexes together as this is the number of "on" bulbs.
		
		for(int roundnumber = 1; roundnumber <= n; roundnumber++) {
			int index = 0;
			index += roundnumber-1;
			while(index < n) {	
				//THIS LINE IS WRONG BELOW
				bulbIndex[index] = toggle(bulbIndex[index]);
				index += roundnumber;
			}
		}
		
		for(int i = 0; i<n; i++) {
			result += bulbIndex[i];
		}
		return result;
	}
	
	public static int toggle(int gg) {
		if (gg == 0) return 1;
		return 0;
	}
}
