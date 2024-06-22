import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the two strings
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        
        // Convert both strings to lower case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        // Compare the two strings lexicographically
        int comparison = str1.compareTo(str2);
        
        // Print the result
        if (comparison < 0) {
            System.out.println("-1");
        } else if (comparison > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        
        scanner.close();
    }
}
