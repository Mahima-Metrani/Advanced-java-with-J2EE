package stringoperationdemo;

public class a3 {
	

	    public static void main(String[] args) {
	        
	        String str1 = "Hello";
	        String str2 = new String("Java AIET");

	        System.out.println("--- Length and Character Access ---");
	        System.out.println("Length of str2: " + str2.length());
	        System.out.println("Character at index 5: " + str2.charAt(5));

	        System.out.println("\n--- String Comparison ---");
	        String compareA = "AIET";
	        String compareB = "aiet";
	        System.out.println("Equals: " + compareA.equals(compareB));
	        System.out.println("Equals Ignore Case: " + compareA.equalsIgnoreCase(compareB));

	        System.out.println("\n--- String Searching ---");
	        String searchStr = "Success is not final, failure is not fatal.";
	        System.out.println("Index of 'is': " + searchStr.indexOf("is"));
	        System.out.println("Last index of 'is': " + searchStr.lastIndexOf("is"));

	        System.out.println("\n--- Substring Operations ---");
	        String sub = str2.substring(5, 9);
	        System.out.println("Substring (5 to 9): " + sub);

	        System.out.println("\n--- String Modification ---");
	        System.out.println("Uppercase: " + str1.toUpperCase());
	        System.out.println("Replace 'AIET' with 'College': " + str2.replace("AIET", "College"));

	        System.out.println("\n--- Whitespace Handling ---");
	        String messyStr = "   Clean this up   ";
	        System.out.println("Trimmed: '" + messyStr.trim() + "'");

	        System.out.println("\n--- String Concatenation ---");
	        String combined = str1.concat(" Developer");
	        System.out.println("Concatenated: " + combined);

	        System.out.println("\n--- String Splitting ---");
	        String data = "Java,Python,C++,Kotlin";
	        String[] languages = data.split(",");
	        for (String lang : languages) {
	            System.out.println("Language: " + lang);
	        }

	        System.out.println("\n--- StringBuilder Demo ---");
	        StringBuilder sb = new StringBuilder("Data");
	        sb.append(" Science");
	        sb.reverse();
	        System.out.println("StringBuilder Reverse: " + sb.toString());

	        System.out.println("\n--- String Formatting ---");
	        String user = "Student";
	        int id = 101;
	        String formatted = String.format("User: %s | ID: %d", user, id);
	        System.out.println(formatted);

	        System.out.println("\n--- Email Validation Demo ---");
	        validateEmail("student@aiet.org");
	        validateEmail("invalid-email.com");
	        validateEmail("@missingname.com");
	    }

	    public static void validateEmail(String email) {
	        boolean hasAt = email.contains("@");
	        boolean validEnd = email.endsWith(".com") || email.endsWith(".org");
	        boolean validStart = !email.startsWith("@");

	        if (hasAt && validEnd && validStart) {
	            System.out.println("VALID: " + email);
	        } else {
	            System.out.println("INVALID: " + email);
	        }
	    }
	}

