import java.util.Scanner;
public class OddEvenPositiveNegative {
    public static void main(String[] args) {
        System.out.println("\n========================================");
        System.out.println("ADD OR EVEN? POSITIVE OR NEGATIVE? ZERO?");
        System.out.println("========================================");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = scanner.nextInt();
         System.out.println("\nAnswer:");
        if (number % 2 == 0) {
            System.out.println(">>> EVEN");
    } else {
        System.out.println(">>> ODD");
        }
    if (number > 0) {
            System.out.println(">>> POSITIVE");
} else if (number < 0) {
            System.out.println(">>> NEGATIVE");
} else {
            System.out.println(">>> ZERO");
        }
        System.out.println("\n");
        scanner.close();
    }
}