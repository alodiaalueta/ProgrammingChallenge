public class MultiplicationTable10x10 {
    public static void main(String[] args) {
        System.out.println("\n=================================================================");
        System.out.println("               ~ 10 x 10 Multiplication Table ~");
        System.out.println("=================================================================");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%6d", i * j);
            }
            System.out.println();
        }
    }
}