package LC;

public class LC1470 {

	    public int[] shuffle(int[] nums, int n) {
	        int[] ans = new int[n+n];
	        for (int i = 0; i < ans.length; i++) {
	            if(i % 2 == 0) {
	                ans[i] = nums[i];
	            }
	            if(i % 2 == 1 && i<ans.length+1) {
	                ans[i] = nums[i+n];

	            }


	        }
	        return ans;

	    }
	    //We have to make it so that we dont try to go to the end of nums by going i+n, but we go to the end of ans
	}
}
