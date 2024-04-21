package probleme;

public class MultiplyNumber {

    public static void main(String[] args) {
        int[] numbers = {3, 10, 15, 0, 18, -3};

        for (int number : numbers) {
            int result = multiplyBy(number);
            System.out.println(number + " --> " + result);
        }
    }

    public static int multiplyBy(int number) {
        int digits = String.valueOf(Math.abs(number)).length();
        return number * (int) Math.pow(7, digits);
    }
}
