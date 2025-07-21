import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n==================================");
        System.out.println("  Number of Days in Every Month");
        System.out.println("==================================");
        System.out.print("Input month (1 to 12): ");
        int month = scanner.nextInt();

        String monthName;
        int days;

        switch (month) {
            case 1:
                monthName = "January";
                days = 31;
                break;
            case 2:
                monthName = "February";
                days = 28; 
                break;
            case 3:
                monthName = "March";
                days = 31;
                break;
            case 4:
                monthName = "April";
                days = 30;
                break;
            case 5:
                monthName = "May";
                days = 31;
                break;
            case 6:
                monthName = "June";
                days = 30;
                break;
            case 7:
                monthName = "July";
                days = 31;
                break;
            case 8:
                monthName = "August";
                days = 31;
                break;
            case 9:
                monthName = "September";
                days = 30;
                break;
            case 10:
                monthName = "October";
                days = 31;
                break;
            case 11:
                monthName = "November";
                days = 30;
                break;
            case 12:
                monthName = "December";
                days = 31;
                break;
            default:
                monthName = "Invalid";
                days = 0;
                break;
        }

        if (days > 0) {
            System.out.println("\nThere are " + days + " days in " + monthName + ".\n");
        } else {
            System.out.println("\nWrong month number. Enter # from 1 to 12 only please.\n");
        }

        scanner.close();
    }
}
