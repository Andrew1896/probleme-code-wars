package probleme;

public class Pillars {

    public static int distanceBetweenPillars(int n, int d, int w) {
        int distanceBetweenPillars = ((n - 1) * d * 100) - (2 * w);
        return distanceBetweenPillars;
    }

    public static void main(String[] args) {
        int n = 5 ;
        int d = 10;
        int w = 30;

        int result = distanceBetweenPillars(n, d, w);
        System.out.println("Distanța dintre primul și ultimul pilon: " + result + " centimetri");
    }
}
