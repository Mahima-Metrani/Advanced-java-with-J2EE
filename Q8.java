package stringoperationdemo;

public class Q8 {
	public class NumericCheck {
	    public static void main(String[] args) {
	        System.out.println("Is '12345' numeric? " + isNumeric("12345"));
	        System.out.println("Is '12A45' numeric? " + isNumeric("12A45"));
	    }

	    public static boolean isNumeric(String str) {
	        if (str == null || str.isEmpty()) return false;
	        return str.matches("\\d+");
	    }
	}
}
