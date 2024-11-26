package LC;

public class LC1512 {
	public static void main(String[] args) {
        int[] kevin = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(kevin));

    }
    public static int numIdenticalPairs(int[] nums) {
        int counter = 0;
        for (int i = nums.length-1; i>0; i--) {
            for (int j = i; j>0; j--) {
                if (nums[i] == nums[j]) counter++;
            }
        }
        return counter;
    }
}
