package leetcodeProblems;

public class LC168 {
	public static void main(String[] args) {
		System.out.println(convertToTitle(1));
		System.out.println(convertToTitle(13));
		System.out.println(convertToTitle(26));
		System.out.println(convertToTitle(27));
		System.out.println(convertToTitle(28)); //expects AB
		System.out.println(convertToTitle(701)); //expects ZY


	}

	
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        int extra1 = 0;
        int extra2 = 0;
        int extra3 = 0;

        int cn = columnNumber;
        String output;
        
        if(cn<=26) {
            sb.append(cToI(cn));
        }
        else {
	        while(cn>26) {
	        	cn-=26;
	        	extra1++;
	        }
            sb.append(cToI(extra1));

            sb.append(cToI(cn));
        }
//        while(extra1>26) {
//        	extra1-=26;
//        	extra2++;
//        }
//        while(extra2>26) {
//        	extra2-=26;
//        	extra3++;
//        }
        
        //for each extra one extra digit
      //SOMEWHERE HERE WE NEED TO AUTOMATE THE INCREASE IN DIGITS FOR SUPER LARGE
      //COLUMN NUMBERS. TC 12 HAS INT.MAX, OUTPUT IS 7 DIGITS IN LETTERS.
        
        //recusion for a ft that reduces by 26 and increases k++, when k=26 it prints a letter and so on


        return sb.toString();
    }

    
    public static char cToI(int i) {
    	char aChar = 64 ;
    	aChar +=i;
        return aChar;
    }
}
