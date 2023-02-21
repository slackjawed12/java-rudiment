package chap06.exercise;

import java.util.Arrays;

public class Exercise6_17 {
    public static int[] shuffle(int[] arr) {
        int[] changed = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            int j = (int) (Math.random() * arr.length);
            int temp = changed[j];
            changed[j] = changed[i];
            changed[i] = temp;
        }

        return changed;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(Arrays.toString(result));
    }
}
