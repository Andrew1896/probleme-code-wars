import java.util.Scanner;

public class EvenOrOdd {

        public static String evenOrOdd(int number) {
            if (number % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Introduceți un număr sau tastă 'q' pentru a ieși: ");
                String input = scanner.next();

                if (input.equalsIgnoreCase("q")) {
                    break;
                }

                try {
                    int num = Integer.parseInt(input);
                    String result = evenOrOdd(num);
                    System.out.println("Numărul introdus este " + result + ".");
                } catch (NumberFormatException e) {
                    System.out.println("Introduceți un număr valid sau tastă 'q' pentru a ieși.");
                }
            }
        }
    }
