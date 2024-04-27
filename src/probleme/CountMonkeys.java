package probleme;

public class CountMonkeys {

    public static int[] countMonkeys(int n) {
        if (n <= 0) {
            return new int[0];
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] monkeys = countMonkeys(7);
        System.out.println("Monkeys up to 7: ");
        for (int number : monkeys) {
            System.out.print(number + " ");
        }
    }
}
