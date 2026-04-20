package stringoperationdemo;

public class Q4 {
	
	    public static void main(String[] args) {
	        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	        System.out.println(isPalindrome("Hello"));
	    }

	    public static boolean isPalindrome(String str) {
	        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        String reversed = new StringBuilder(clean).reverse().toString();
	        return clean.equals(reversed);
	    }
	}

