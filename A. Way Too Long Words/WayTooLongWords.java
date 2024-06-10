import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of words
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        for (int i = 0; i < n; i++) {
            // Read each word
            String word = scanner.nextLine();
            int len = word.length();
            
            if (len > 10) {
                // Word is too long, create abbreviation
                String abbreviation = word.charAt(0) + String.valueOf(len - 2) + word.charAt(len - 1);
                System.out.println(abbreviation);
            } else {
                // Word is not too long, print it as is
                System.out.println(word);
            }
        }
        
        scanner.close();
    }
}
