import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long a = scanner.nextLong();

        // Calculate the number of flagstones needed for each dimension
        long flagstonesLength = (n + a - 1) / a;
        long flagstonesWidth = (m + a - 1) / a;

        // Calculate the total number of flagstones needed
        long totalFlagstones = flagstonesLength * flagstonesWidth;

        // Output the result
        System.out.println(totalFlagstones);
        
        // Close the scanner
        scanner.close();
    }
}
