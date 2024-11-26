package leetcodeProblems;


//				CODE GETS TIMEOUT ON LONG INPUTS
// cannot get rid of nested for loop?


public class LC1561 {
	public static void main(String[] args) {
		int[] testA = {2,4,1,2,7,8};
		int[] testB = {123, 456, 789, 234, 567, 890, 123, 456, 789, 234, 567, 890, 123, 456, 789, 234};
		int[] testC = {123, 456, 789, 234, 567, 890, 1234, 5678, 9012, 3456, 7890, 12345, 67890, 123, 456, 789, 234, 567, 890, 1234, 5678, 9012, 3456, 7890, 12345, 67890, 123, 456, 789, 234, 567, 890, 1234, 5678, 9012, 3456, 7890, 12345, 67890, 123, 456, 789, 234, 567, 890, 1234, 5678, 9012, 3456, 7890, 12345, 67890, 123, 456, 789, 234, 567, 890, 1234, 5678, 9012, 3456, 7890, 12345, 67890, 123, 456, 789, 234, 567, 890, 1234, 5678, 9012, 3456, 7890, 12345, 67890, 123, 456, 789, 234, 567, 890, 1234, 5678, 9012, 3456, 7890, 12345, 67890, 123, 456, 789, 234, 567, 890, 1234, 5678, 9012, 3456, 7890, 12345, 67890};

		
		
		System.out.println(maxCoins(testA));
//		System.out.println(maxCoins(testB)); //expect 3158
//		System.out.println(maxCoins(testC)); //expect 435947

	}

	    public static int maxCoins(int[] piles) {
	        //select as follows:
	        //highest two and lowest possible

	        int aliceCoin = 0;
	        int aliceCoinIndex = 0;
	        int myCoin = 0;
	        int myCoinIndex = 0;
	        int bobCoin = 9999;
	        int bobCoinIndex = 0;
	        int amountMy = 0;


	        int[] coins = new int[piles.length];
	        for(int i = 0; i<piles.length; i++) {
	            coins[i] = piles[i];
	        }
	        //This For Loop will cound how often we can take 3 coins out of our array (this number is arraylength/3)
	        for(int x = piles.length; x > 0; x-=3) {
	            //This For Loop is one Round of determining the largest, second largest, and lowest Element of "coins"
	            for(int i = 0; i<piles.length; i++) {
	                if (coins[i] > aliceCoin) {
	                    aliceCoin = coins[i];
	                    aliceCoinIndex = i;
	                    System.out.println("   Alice new Coin is "+aliceCoin);
	                }
	            }
	            for(int i = 0; i<piles.length; i++) {
	                if (coins[i] > myCoin && i != aliceCoinIndex) {
	                    myCoin = coins[i];
	                    myCoinIndex = i;
	                    System.out.println("   My new Coin is "+myCoin);
	                }
	            }
	            for(int i = 0; i<piles.length; i++) {
	                if (coins[i] < bobCoin && coins[i] != 0 && i != aliceCoinIndex && i != myCoinIndex) {
	                    bobCoin = coins[i];
	                    bobCoinIndex = i;
	                    System.out.println("   Bobs new Coin is "+bobCoin);
	                }
	            }
	            System.out.println("Alice takes " + aliceCoin + ", I take " + myCoin + ", and Bob takes " + bobCoin + " from the Pile.\n");

	            //We now have a coin for all three Players, which they need to take. We need to track the coins we take in amountMy.
	            amountMy += myCoin;
	            System.out.println("I now have "+amountMy+" coins!\n");

	            aliceCoin = 0;
	            coins[aliceCoinIndex] = 0;
	            myCoin = 0;
	            coins[myCoinIndex] = 0;
	            bobCoin = 9999;
	            coins[bobCoinIndex] = 0;
	        }
	        System.out.println("\n\n﷽\nAll coins are exhausted. Total Amount you have is " + amountMy);
	        return amountMy;

	    }
	}
