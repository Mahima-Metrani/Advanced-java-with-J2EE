package stringoperationdemo;

public class Q10 {
	
	    public static void main(String[] args) {
	        String input = "Counting the number of words in a string";
	        System.out.println("Word count: " + countWords(input));
	    }

	    public static int countWords(String str) {
	        if (str == null || str.trim().isEmpty()) return 0;
	        String[] words = str.trim().split("\\s+");
	        return words.length;
	    }
	}

