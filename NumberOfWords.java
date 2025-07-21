import java.util.Scanner;
public class NumberOfWords { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("\n=======================================");
         System.out.println(" ~ COUNT NUMBER OF WORDS IN AN INPUT ~");
         System.out.println("=======================================");
        System.out.print("Enter a sentence: \n");
        
        String sentence = input.nextLine();
        String[] words = sentence.trim().split("\\s+");
        System.out.println("\nNumber of Words > " + (sentence.isEmpty() ? 0 : words.length));
        input.close();
    }
}