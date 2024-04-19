import java.util.Arrays;

public class SumWithoutExtremes {
    public static int Sum(int[] arr) {
        if (arr.length < 3) {
            return 0;
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 1; i < arr.length -1; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] list1 = {6, 2, 1, 8, 10};
        int[] list2 = {1, 1, 11, 2, 3};
        System.out.println(Sum(list1));
        System.out.println(Sum(list2));
    }
}
