import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of problems
        int n = scanner.nextInt();
        int count = 0;

        // Loop through each problem's confidence levels
        for (int i = 0; i < n; i++) {
            int petya = scanner.nextInt();
            int vasya = scanner.nextInt();
            int tonya = scanner.nextInt();

            // If at least two of them are sure, count this problem
            if (petya + vasya + tonya >= 2) {
                count++;
            }
        }

        // Output the result
        System.out.println(count);
        
        // Close the scanner
        scanner.close();
    }
}
