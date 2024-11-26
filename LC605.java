package leetcodeProblems;

public class LC605 {
	public static void main(String[] args) {
		int[] testA = {1,0,0,0,1};
		System.out.println(canPlaceFlowers(testA, 1));
		int[] testB = {1,0,0,0,1};
		System.out.println(canPlaceFlowers(testB, 2));
		int[] testC = {1,0,0,0,1,0,0,0,1};
		System.out.println(canPlaceFlowers(testC, 2));
		int[] testD = {1,0,0,0,0,0,1};
		System.out.println(canPlaceFlowers(testD, 1));
		int[] testE = {1,1,0,0,1,1,0,0};
		System.out.println(canPlaceFlowers(testE, 1));
		int[] testF = {0,0,1,1,1};
		System.out.println(canPlaceFlowers(testF, 1));
	}
	//cases: 0, 00, 000, 100
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int flowerCount = 0;
		
		if(flowerbed[0] == 0 && flowerbed[1] == 0) {
			flowerbed[0] = 1;
			flowerCount++;
		}
		
		for(int index = 1; index < flowerbed.length; index++) {
				if(flowerbed[index] == 0) {
					//Check if possible, or at end
					if(flowerbed[index+1] == 0 && flowerbed[index+2] == 0) {
						flowerbed[index+1] = 1;
						flowerCount++;
					}
					if(flowerbed[index+1] == 0 && index == flowerbed.length -1) {
						flowerbed[index+1] = 1;
						flowerCount++;
					}
			
		}
		}
		System.out.println("We planted " + flowerCount + " flowers!");
		if(flowerCount >= n) return true;
		return false;
		
		
	}
}


