package collection;

public class second {
	public class StringOperationsDemo {

	    public static void main(String[] args) {
	        
	        String str1 = "Hello";
	        String str2 = new String("Java World");

	        System.out.println("--- Length and Character Access ---");
	        System.out.println("Length of str2: " + str2.length());
	        System.out.println("Character at index 6: " + str2.charAt(6));

	        System.out.println("\n--- String Comparison ---");
	        String compareA = "Java";
	        String compareB = "java";
	        System.out.println("Equals (case-sensitive): " + compareA.equals(compareB));
	        System.out.println("Equals (ignore case): " + compareA.equalsIgnoreCase(compareB));

	        System.out.println("\n--- String Searching ---");
	        String searchStr = "Programming is fun and logic is key.";
	        System.out.println("Index of 'is': " + searchStr.indexOf("is"));
	        System.out.println("Last index of 'is': " + searchStr.lastIndexOf("is"));

	        System.out.println("\n--- Substring Operations ---");
	        String sub = str2.substring(5, 10);
	        System.out.println("Substring (5 to 10): " + sub);

	        System.out.println("\n--- String Modification ---");
	        System.out.println("Uppercase: " + str1.toUpperCase());
	        System.out.println("Replace 'Java' with 'Python': " + str2.replace("Java", "Python"));

	        System.out.println("\n--- Whitespace Handling ---");
	        String messyStr = "   Remove my edges   ";
	        System.out.println("Trimmed: '" + messyStr.trim() + "'");

	        System.out.println("\n--- String Concatenation ---");
	        String combined = str1.concat(" Developer");
	        System.out.println("Concatenated: " + combined);

	        System.out.println("\n--- String Splitting ---");
	        String csv = "Apple,Banana,Orange";
	        String[] fruits = csv.split(",");
	        for (String fruit : fruits) {
	            System.out.println("Fruit: " + fruit);
	        }

	        System.out.println("\n--- StringBuilder Demo ---");
	        StringBuilder sb = new StringBuilder("Build");
	        sb.append("er");
	        sb.reverse();
	        System.out.println("StringBuilder result: " + sb.toString());

	        System.out.println("\n--- String Formatting ---");
	        String name = "Alice";
	        int score = 95;
	        String formatted = String.format("User %s scored %d points.", name, score);
	        System.out.println(formatted);

	        System.out.println("\n--- Email Validation Demo ---");
	        validateEmail("user@example.com");
	        validateEmail("invalid-email.com");
	        validateEmail("@missingname.com");
	    }

	    public static void validateEmail(String email) {
	        boolean hasAt = email.contains("@");
	        boolean validEnd = email.endsWith(".com") || email.endsWith(".org") || email.endsWith(".net");
	        boolean startsCorrectly = !email.startsWith("@");

	        if (hasAt && validEnd && startsCorrectly) {
	            System.out.println("VALID: " + email);
	        } else {
	            System.out.println("INVALID: " + email);
	        }
	    }
	}

}
