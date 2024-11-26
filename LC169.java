package leetcodeProblems;

public class LC169 {
	public static void main(String[] args) {
		int[] trye = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(trye));
	}
//Solution: Pick first element. Count through array for element, lock amount. If amount larger than
//half array, solution. Else ??
	
	public static int majorityElement(int[] nums) {
        // nums = [2,2,1,1,1,2,2]
        // actual [0,1,2,3,4,5,6]
	    int n = nums.length;
	    int newMost;
	    int majE = 0;

	    
	    for(int indexprime = 0; indexprime < n; indexprime++) {
	    	for(int indexsec = 1; indexsec<n; indexsec++) {
	    		if(nums[indexprime] == nums[indexsec]) {
	    			System.out.println("yey found " + nums[indexprime] + " at " + indexprime);
	    			
	    		}
	    	}
	    }
		return majE;
	    
	    
	}
}


//Older attempt:

//public static int majorityElement(int[] nums) {
//    // nums = [2,2,1,1,1,2,2]
//    // actual [0,1,2,3,4,5,6]
//    int n = nums.length;
//    int correct = 0;
//    for(int pos = 0; pos<n; pos++) {
//    	int counter = 0;
//        
//        for(int y = pos+1; y<n; y++) {
//        	if(nums[pos] == nums[y]) {
//        		counter++;
//        	}
//        	else {
//        		continue;
//        	}
//        }
//        if(counter > n/2) {
//        	correct = nums[pos];
//        }
//        else {
//        	continue;
//        }
//
//    }
//    return correct;
//}