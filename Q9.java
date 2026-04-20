package stringoperationdemo;


	import java.util.Random;
	public class Q9 {
	    public static void main(String[] args) {
	        System.out.println("Random String: " + generateRandomString(8));
	    }

	    public static String generateRandomString(int length) {
	        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        StringBuilder sb = new StringBuilder();
	        Random random = new Random();
	        for (int i = 0; i < length; i++) {
	            sb.append(chars.charAt(random.nextInt(chars.length())));
	        }
	        return sb.toString();
	    }
	}

