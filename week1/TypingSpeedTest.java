public class TypingSpeedTest {
    public static void checkTypingAccuracy(String original, String typed) {

        if (original.length() != typed.length()) {
            System.out.println("Error: Both strings must be of equal length.");
            return;
        }

        int matchedCharacters = 0;
        int firstMismatch = -1;
        
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matchedCharacters++;
            } else if (firstMismatch == -1) {
                firstMismatch = i;
            }
        }

        double accuracy = ((double) matchedCharacters / original.length()) * 100;

        System.out.println("Matched= " + matchedCharacters + "/" + original.length());
        System.out.printf("Accuracy: %.2f%%\n", accuracy);

        if (firstMismatch == -1) {
            System.out.println("No mismatches");
        } else {
            System.out.println("First mismatch at position: " + firstMismatch);
        }
    }

    public static void main(String[] args) {
        String original = "hello world";
        String typed = "hello worlt";

        checkTypingAccuracy(original, typed);
    }
}