package leetcodeProblems;

public class LC1399 {
	public static void main(String[] args) {
		System.out.println(countLargestGroup(13));
		System.out.println(countLargestGroup(22));
		System.out.println(countLargestGroup(5));
		System.out.println(countLargestGroup(2));

	}
	
	//gives wrong result
    public static int countLargestGroup(int n) {
        int amountLargest = 0;
        int highestIndex = 0;
        int[] arr = new int[n+1];

        for(int i = 1; i<=n; i++) {
            arr[quersumme(i)]++;
        }
        
        for(int i = 0; i<arr.length; i++) {
        	if(arr[i] > highestIndex) {
        		highestIndex = arr[i];
        	}
        }
        for(int i = 0; i<arr.length; i++) {
        	if(arr[i] == highestIndex) {
        		amountLargest++;
        	}
        }
        
    return amountLargest;
    }

    public static int quersumme(int zahl) {
        if(zahl < 10) return zahl;
        return (zahl%10 + quersumme(zahl/10));
    }
}
