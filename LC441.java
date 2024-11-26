package leetcodeProblems;

public class LC441 {
	public static void main(String[] args) {
		System.out.println(arrangeCoins(1));
		System.out.println(arrangeCoins(3));
		System.out.println(arrangeCoins(5));
		System.out.println(arrangeCoins(8));
		System.out.println(arrangeCoins(9));
		System.out.println(arrangeCoins(10));
		System.out.println(arrangeCoins(11));
		System.out.println(arrangeCoins(12));

	}
	
	public static int arrangeCoins(int n) {
		int res = 0;
		int stairLen = 1;
		int coinsLeft = n;
//		System.out.println("\n++++++++++++++++++++\nAmout of Coins is " + n);

		while(coinsLeft >= 0) {
			if(coinsLeft >= stairLen) {
				coinsLeft -= stairLen;
				res++;
				stairLen++;
			}
			else {
//				System.out.println("We have " + coinsLeft + " coins left over");
//				System.out.println("Our stair number is: ");
				break; 
			}
		}
		return res;
	}
}
