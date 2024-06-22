import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the board dimensions M and N
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        
        // Calculate the maximum number of dominoes that can be placed
        int maxDominoes = (M * N) / 2;
        
        // Output the result
        System.out.println(maxDominoes);
        
        // Close the scanner
        scanner.close();
    }
}
