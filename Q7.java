package stringoperationdemo;

public class Q7 {
	
	    public static void main(String[] args) {
	        String input = "Java Programming is a core subject for computer science.";
	        System.out.println(truncate(input, 20));
	    }

	    public static String truncate(String str, int length) {
	        if (str != null && str.length() > length) {
	            return str.substring(0, length) + "...";
	        }
	        return str;
	    }
	}

