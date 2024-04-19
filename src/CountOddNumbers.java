import java.util.Scanner;

public class CountOddNumbers {
    public static int countOddNumbers(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Introduceți un număr sau tasta 'q' pentru a ieși: ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int n = Integer.parseInt(input);
                int count = countOddNumbers(n);
                System.out.println("Numărul de numere impare mai mici decât " + n + " este: " + count);
            } catch (NumberFormatException e) {
                System.out.println("Numărul dat nu este valid, introduceți alt număr.");
            }
        }
    }
}
