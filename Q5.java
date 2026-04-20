package stringoperationdemo;

public class Q5 {
	
	    public static void main(String[] args) {
	        String input = "  J a v a  P r o g r a m  ";
	        System.out.println("Result: " + removeWhitespace(input));
	    }

	    public static String removeWhitespace(String str) {
	        return str.replaceAll("\\s", "");
	    }
	}

