package stringoperationdemo;

public class Q3 {
	
	    public static void main(String[] args) {
	        System.out.println(reverseString("AIET College"));
	    }

	    public static String reverseString(String str) {
	        StringBuilder sb = new StringBuilder(str);
	        return sb.reverse().toString();
	    }
	}

