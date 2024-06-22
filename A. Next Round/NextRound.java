import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the values of n and k
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        // Read the scores
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }
        
        // Determine the k-th place score
        int kthScore = scores[k - 1];
        
        // Count the number of participants who advance to the next round
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] >= kthScore && scores[i] > 0) {
                count++;
            }
        }
        
        // Output the result
        System.out.println(count);
        
        // Close the scanner
        scanner.close();
    }
}
