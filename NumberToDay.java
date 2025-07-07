import java.util.Scanner;
public class NumberToDay { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNum;
        String day;

        while (true) {
            System.out.println("\n=============================");
            System.out.println("~ NUMBER TO DAY OF THE WEEK ~");
            System.out.println("=============================");
            System.out.print("Input Number (1-7): ");
            dayNum = scanner.nextInt();

            switch (dayNum) {
                case 1:
                    day = "Monday.";
                    break;
                case 2:
                    day = "Tuesday.";
                    break;
                case 3:
                    day = "Wednesday.";
                    break;
                case 4:
                    day = "Thursday.";
                    break;
                case 5:
                    day = "Friday.";
                    break;
                case 6:
                    day = "Saturday.";
                    break;
                case 7:
                    day = "Sunday.";
                    break;
    default:
        System.out.println("\nWrong input. Please choose number 1 to 7.");
         continue; 
            }

    System.out.println("\n>>> Day "+ dayNum + " is " + day + "\n");
    break;
        }
        scanner.close();
    }
}
