package stringoperationdemo;

public class Q2 {
	
	    public static void main(String[] args) {
	        String main = "Java is great, Java is fun, Java is powerful";
	        String sub = "Java";
	        System.out.println("Occurrences: " + countOccurrences(main, sub));
	    }

	    public static int countOccurrences(String main, String sub) {
	        if (sub.isEmpty()) return 0;
	        int count = 0;
	        int index = 0;
	        while ((index = main.indexOf(sub, index)) != -1) {
	            count++;
	            index += sub.length();
	        }
	        return count;
	    }
	}

