package probleme;

import java.util.ArrayList;
import java.util.List;

public class PowersOfTwo {

    public static List<Integer> powersOfTwo(int n) {
        List<Integer> powers = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            powers.add((int) Math.pow(5, i));
        }
        return powers;
    }

    public static void main(String[] args) {

        System.out.println(powersOfTwo(0));
        System.out.println(powersOfTwo(1));
        System.out.println(powersOfTwo(2));
    }
}
