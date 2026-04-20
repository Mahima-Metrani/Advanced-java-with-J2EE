package stringoperationdemo;

public class Q1 {
	
	    public static void main(String[] args) {
	        System.out.println(isNullOrEmpty(null));
	        System.out.println(isNullOrEmpty("   "));
	        System.out.println(isNullOrEmpty("AIET"));
	    }

	    public static boolean isNullOrEmpty(String str) {
	        return str == null || str.trim().isEmpty();
	    }
	}

