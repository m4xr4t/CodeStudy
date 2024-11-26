package leetcodeProblems;

public class LC914 {
	
	public static void main(String[] args) {
		int[] arr = {1,1,1,2,2,2,3,3};
		hasGroupsSizeX(arr);
	}
	
	
	
	public static void hasGroupsSizeX(int[] deck) {
//        boolean possible = true;
        int deckSize = deck.length;
        System.out.println("we have " + deckSize + " cards!");
        int realCount = 0;
        //realcount counts how many groups we have, so how many different numbers appear
        
        
        int[] allNumbersArray = new int[10000];
        
        //from 0 to last card, x is number of current card, allNumbers at position x is plus one
        for(int i = 0; i<deckSize; i++) {
        	int current = deck[i];
        	
        	if(allNumbersArray[current-1] == 0) {
        		realCount++;
        	}

        	allNumbersArray[current-1] += 1;
        	//at this point, allNumArr at pos 0 represents the counter of 1's, not 0's
            System.out.println("  cardNr " + (i+1) + " has printed " + deck[i] + ",  the " + (allNumbersArray[current]+1) + " time!");
        }
        System.out.println("there are " + realCount + " different numbers");
    }
	

}
