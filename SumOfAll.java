import java.util.Scanner;

public class SumOfAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.println("              ~ Sum Of All Integer Inputs ~");
        System.out.println("============================================================");
        System.out.println("INSTRUCTIONS: Just type all your numbers in one line with\n              SPACES in between. Hit ENTER to see the total.");
        System.out.print("\nInput here >>> ");
        String inputLine = scanner.nextLine();
        System.out.print("\n");
        String[] numbers = inputLine.trim().split("\\s+");
        int sum = 0;

        for (String numStr : numbers) {
            try {
                int number = Integer.parseInt(numStr);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.print("Invalid Integer...  ");
                System.out.println(numStr);
            }
        }

        System.out.println("\nSum Of All Integer Inputs: " + sum+ "\n");
        scanner.close();
    }
}