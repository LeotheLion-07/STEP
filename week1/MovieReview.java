public class MovieReview {
    public static void classifyLengths(String review) {

        if (review == null || review.trim().isEmpty()) {
            System.out.println("Review is empty.");
            return;
        }

        int shortCount = 0;
        int mediumCount = 0;
        int longCount = 0;
        String[] words = review.split("\\s+");
        
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "");
            int length = word.length();

            if (length >= 1 && length <= 4) {
                shortCount++;
            } else if (length >= 5 && length <= 8) {
                mediumCount++;
            } else if (length >= 9) {
                longCount++;
            }
        }

        System.out.println("Short : " + shortCount);
        System.out.println("Medium : " + mediumCount);
        System.out.println("Long : " + longCount);
    }

    public static void main(String[] args) {
        String review = "The movie was absolutely fantastic with brilliant performances and stunning cinematography!";
        classifyLengths(review);
    }
}
