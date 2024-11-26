package leetcodeProblems;

public class LC2190 {

	public static void main(String[] args) {
		int[] testA = {1,100,1,22,200,1,100,1,22,1,22,1,2,1,2};
		System.out.println(mostFrequent(testA, 1));
		
		//  1 5   1 3   1 5   1 3   1 3         / KEY 1
	}
	
	//idk where I am wrong,somehow confused between jumping back and forth last/new imposter plus amounts
	//easy fix with a clear head i'm sure
	
	
	public static int mostFrequent(int[] nums, int key) {
		int target = 0;
		
		int newImposter = 0;
		int lastImposter = 0;
		int newImposterAmount = 0;
		int lastImposterAmount = 0;
		
		int[] keyBurnArray = new int[nums.length];
		System.out.println("\n**********\nLooking for pairs with key "+key+"\n");

		for(int i = 0; i<nums.length; i++) {
			
			if(nums[i] == key && i+1 < nums.length && keyBurnArray[i] == 0) {
				newImposter = nums[i+1];
				System.out.println("Found key-imposter pair at index " + i +", the new imposter is "+ newImposter);
				
				//Go through array again. This time we know our imposter!
				for(int j = 0; j<nums.length; j++) {
					if(nums[j] == key && i+1 < nums.length && nums[j+1] == newImposter) {
						//if true, we have found a key followed by an imposter!
						//burn the key, make a note of how many imposters we have!
						System.out.println(" - Found an imposter (" + newImposter + " following key " + key + ") at key index: "+ j+", imposter index: " + (j+1) );
						keyBurnArray[j]++;
						newImposterAmount++;
						System.out.println(" New Imposter amount: " + newImposterAmount);
					}
				}
				//now if we found more imposters than before, the new imposter replaces the old
				if(newImposterAmount > lastImposterAmount) {
					target = newImposter;
					
					System.out.println("The new Imposter " + newImposter + " outnumbers old imposter " + lastImposter + ", becoming new King!");
					newImposter = lastImposter;
					
					System.out.println("New highest ImposterAmount is " + newImposterAmount + ", which is bigger than " + lastImposterAmount);
					newImposterAmount = lastImposterAmount;
					System.out.println("");
				}
		
		
			}
		
		
		} // end of process
		System.out.println("Returning " + newImposter);
		target = newImposter;
		return target;
		
	} // end of method
		
		
		
		
		
//		for(int i = 0; i<nums.length; i++) {
//			if(nums[i] == key && i+1 < nums.length && keyBurnArray[i] == 0) imposter = nums[i+1];
//			
//			//start new loop, looking for how many imposters we can find
//			for(int j = 0; j<nums.length; j++) {
//				System.out.println("Looking at index " + j + "...");
//
//				if(nums[j] == key && i+1 < nums.length && nums[j+1] == imposter) {
//					keyBurnArray[j]++;
//					imposterAmount++;
//					System.out.println("  Found an imposter  (" + imposter + ") at key index: "+ j+", imposter index: " + (j+1) );
//				}
//			}
				

		
		
	
}
