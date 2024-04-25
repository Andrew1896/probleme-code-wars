package probleme;

import java.util.Arrays;

public class InvertValues {

        public static int[] invert(int[] values) {
            int[] invertedValues = new int[values.length];
            for (int i = 0; i < values.length; i++) {
                invertedValues[i] = -values[i];
            }
            return invertedValues;
        }

        public static void main(String[] args) {
            int[] values1 = {1, 2, 3, 4, 5};
            int[] inverted1 = invert(values1);
            System.out.println("Inverted values1: " + Arrays.toString(inverted1));

            int[] values2 = {1, -2, 7, 21, -3, -4, 5};
            int[] inverted2 = invert(values2);
            System.out.println("Inverted values2: " + Arrays.toString(inverted2));

            int[] emptyValues = {};
            int[] invertedEmpty = invert(emptyValues);
            System.out.println("Inverted emptyValues: " + Arrays.toString(invertedEmpty));
        }
    }

