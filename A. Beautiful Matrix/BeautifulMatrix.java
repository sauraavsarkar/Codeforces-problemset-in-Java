import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetRow = 3;
        int targetCol = 3;
        int currentRow = -1;
        int currentCol = -1;

        // Read the matrix and find the position of 1
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int num = scanner.nextInt();
                if (num == 1) {
                    currentRow = i;
                    currentCol = j;
                }
            }
        }

        // Calculate the number of moves needed
        int rowMoves = Math.abs(targetRow - currentRow);
        int colMoves = Math.abs(targetCol - currentCol);
        int totalMoves = rowMoves + colMoves;

        // Output the result
        System.out.println(totalMoves);

        // Close the scanner
        scanner.close();
    }
}
