import java.util.Scanner;

public class CheckVowelsConsonants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n===================================");
        System.out.println("  ~ CHECK VOWELS AND CONSONANTS ~");
        System.out.println("===================================");

        System.out.print("Enter a word: ");
        String word = input.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;
        String vowelChars = "", consonantChars = "";

        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                    vowelChars += c + " ";
                } else {
                    consonants++;
                    consonantChars += c + " ";
                }
            }
        }

        System.out.println("\nRESULT...");
        System.out.println("Vowels: " + vowels + " > " + vowelChars.trim());
        System.out.println("Consonants: " + consonants + " > " + consonantChars.trim());
        System.out.print("\n");
        input.close();
    }
}
