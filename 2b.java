package collection;

public class b2 {
	

	    public static void main(String[] args) {
	        int iterations = 10000;
	        String textToAppend = "AIET";

	        long startTime = System.nanoTime();
	        StringBuffer buffer = new StringBuffer();
	        for (int i = 0; i < iterations; i++) {
	            buffer.append(textToAppend);
	        }
	        long endTime = System.nanoTime();
	        long bufferDuration = endTime - startTime;

	        startTime = System.nanoTime();
	        StringBuilder builder = new StringBuilder();
	        for (int i = 0; i < iterations; i++) {
	            builder.append(textToAppend);
	        }
	        endTime = System.nanoTime();
	        long builderDuration = endTime - startTime;

	        System.out.println("--- Performance Results (Time in Nanoseconds) ---");
	        System.out.println("StringBuffer Time:  " + bufferDuration + " ns");
	        System.out.println("StringBuilder Time: " + builderDuration + " ns");
	        
	        justifyResult(bufferDuration, builderDuration);
	    }

	    public static void justifyResult(long bufferTime, long builderTime) {
	        System.out.println("\n--- Justification ---");
	        if (builderTime < bufferTime) {
	            System.out.println("StringBuilder is faster.");
	            System.out.println("Reason: StringBuilder is non-synchronized.");
	            System.out.println("StringBuffer is synchronized (thread-safe), which adds overhead.");
	        } else {
	            System.out.println("StringBuilder is generally preferred for single-threaded tasks.");
	        }
	    }
	}

	



	