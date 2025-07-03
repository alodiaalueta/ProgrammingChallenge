import java.util.Scanner;

public class ScoreToGradeFtoA {
    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("  STUDENT'S SCORE TO GRADE F-A");
        System.out.println("==================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the score: ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("\nScore " + score + " is Grade A\n");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        scanner.close();
    }
}