package LC;

public class LC20 {

	    public boolean isValid(String s) {

	        for(int i = 0; i<s.length(); i++) {
	        	
	            if (s.charAt(i) == '(') {
	            	if (s.charAt(i+1) != ')' || i+1 > s.length()) {
	            		return false;
	            	}
	            }
            	if (s.charAt(i) == '[') {
	            	if (s.charAt(i+1) != ']' || i+1 > s.length()) {
	            		return false;
	            	}
	            }
            	if (s.charAt(i) == '{') {
	            	if (s.charAt(i+1) != '}' || i+1 > s.length()) {
	            		return false;
	            	}
	            }
            	if (s.charAt(i) == ')') {
	            	if (s.charAt(i-1) != '(' || i==0) {
	            		return false;
	            	}
	            }
            	if (s.charAt(i) == ']') {
	            	if (s.charAt(i-1) != '[' || i==0) {
	            		return false;
	            	}
	            }
            	if (s.charAt(i) == '}') {
	            	if (s.charAt(i-1) != '{' || i==0) {
	            		return false;
	            	}
	            }
	        }
	        return true;
	}
}



/* this would work if the question would allow for ([]) inputs. however open must be followed by closed brackets.
 * "{[]}" - expects true
 * "([)]" - expects false
 * ????
Open brackets must be closed in the correct order.
means - when open in an order, close back in that order
new solution should create a string and reverse it? 


 * 
 * confusion
 * class Solution {
public boolean isValid(String s) {
    int a = 0;
    int b = 0;
    int c = 0;

    for(int i = 0; i<s.length(); i++) {
        if (s.charAt(i) == '(') a++;
        if (s.charAt(i) == ')') a--;
        if (s.charAt(i) == '[') b++;
        if (s.charAt(i) == ']') b--;
        if (s.charAt(i) == '{') c++;
        if (s.charAt(i) == '}') c--;

        if(a<0) return false;
        if(b<0) return false;
        if(c<0) return false;
    }
if (a==0 && b==0 && c==0) return true;
return false;


}
}
 */

