package leetcodeProblems;

public class LC2404 {
	public static void main(String[] args) {
		
	}
	

	public static int mostFrequentEven(int[] nums) {
		int currentBestInt = 0;
		int amountOfCSMEI = 0;
		boolean evenExists = false;
		
		for(int i = 0; i<nums.length; i++) {
			//check if number at i is even:
			if (nums[i]%2 == 0) {
				evenExists = true;
				//if it is, lets count how often it occurs!
				int iCounter = 1;
				
				for(int index = 0; index<nums.length; index++) {
					if(i != index && nums[index] == nums[i]) {
						iCounter++;
					}
				}
				System.out.println("Even Int " + nums[i] + " has appeared " + iCounter + " times!");
				//we now have an icounter, which tells us how often number from i occurs in array
				//iCounter can only count how many EVEN ints exist!
				
				
				if(iCounter > amountOfCSMEI) {
					amountOfCSMEI = iCounter;
					currentBestInt = nums[i];
					System.out.println("amount " + amountOfCSMEI + ", int is " + currentBestInt);
				}
				else if (iCounter == amountOfCSMEI) {
					//^if the amount of the new even int is same as previous most frequent even int:
					if(nums[i] < currentBestInt) {
						currentBestInt = nums[i];
						System.out.println("Same amount " + amountOfCSMEI + ", but new int is " + currentBestInt);
					}
				}
			}
			//if - done
		}
		//all i in array checked
		if (evenExists == false) return (-1);
		
		System.out.println("\nOur best int is "+currentBestInt);
		return currentBestInt;
	}
}
