import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        System.out.println("\n=============================================");
        System.out.println(" ~ SUM AND AVERAGE OF INPUT ARRAY NUMBERS ~");
        System.out.println("=============================================");
        Scanner input = new Scanner(System.in);
        System.out.print("How many Numbers? ");
        
        int n = input.nextInt();
        int sum = 0;
        System.out.print("\n");
        for (int i = 1; i <= n; i++) {
            System.out.print("Number " + i + ": ");
            sum += input.nextInt();
        }

        double average = (double) sum / n;

        System.out.println("\nRESULT...");
        System.out.println("   Sum/Total = " + sum);
        System.out.println("    Average  = " + average);

        input.close();
    }
}
