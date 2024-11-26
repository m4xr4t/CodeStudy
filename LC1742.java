//package leetcodeProblems;
//
//public class LC1742 {
//	
//	public static void main(String[] args) {
//		countBalls(5, 15);
//	}
//	
//	public static int quersumme(int zahl) {
//		if (zahl <= 9) return zahl;
//		return zahl%10 + quersumme(zahl/10);
//	}
//   
//	public static void countBalls(int lowLimit, int highLimit) {
//        
//        int lL = lowLimit;
//        int hl = highLimit;
//
//        int ballAmount = hl - lL + 1;
//        int boxAmount = ballAmount;
//
//        //declare array for balls and boxes
//        int[] ballArray = new int[ballAmount];
//        int[] boxArray = new int[boxAmount];
//        int count = 0;
//        
//        //fill the "ballArray" array with correctly numbered balls
//        for(int ballNumber = lowLimit; ballNumber < highLimit; ballNumber++) {
//        	ballArray[count] = ballNumber;
//        	System.out.println("Value in ballArray at Position " + count + " is " + ballArray[count]);
//        	count++;
//        }
//        
//        //we now have ballArray, which are our balls in order, starting from pos0
//        //create loop that adds the digits of a ball, adds this to the corresponding boxarray position
//        //for this, start pos0, take digitsum, increment boxarray at this position by one
//        //so ball 321 will increase the count of boxarray(5) by one
//        //note: it doesnt need to be boxarray(5)+1, because we are not tasked to find out WHICH box is max
//        
//        
//        for(int ctb = 0; ctb < ballAmount; ctb++) {
//        	int q = quersumme(ballArray[ctb]);
//        	boxArray[q] += 1; 
////        	System.out.println("Quersumme von " + ballArray[ctb] + " ist " + quersumme(ballArray[ctb]));
//        }
//        int largestBox = 0;
//        for(int xd = 0; xd < boxAmount; xd++) {
//        	System.out.print("amount in box " + (xd+1) + " is "  + boxArray[xd]);
//        	if(boxArray[xd] > largestBox) {
//        		largestBox = boxArray[xd];
//        	}
//        	System.out.println("   -   Largest Box is at " + largestBox);
//        }
//        return largestBox;
//        
//    }
//}