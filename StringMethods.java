import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n==================================");
        System.out.println("        ~ STRING METHODS ~");
        System.out.println("==================================");
        System.out.print("Input String: ");
        String str = sc.nextLine();
        System.out.println("==================================");
        System.out.println("Length:  " + str.length());
        System.out.println("Uppercase:  " + str.toUpperCase());
        System.out.println("Lowercase:  " + str.toLowerCase());

        if (str.length() > 0) {
            System.out.println("First character:  " + str.charAt(0));
            System.out.println("Last character:  " + str.charAt(str.length() - 1));
        }

        if (str.length() >= 5) {
            System.out.println("Substring (2nd to 5th):  " + str.substring(1, 5));
        } else {
            System.out.println("String too short for substring.");
        }

        sc.close();
        System.out.println("==================================");
    }
}
