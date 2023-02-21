package chap06.exercise;

public class Exercise6_20 {

    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -999999;
        } else {
            int max = arr[0];
            for (int e : arr) {
                if (max < e) max = e;
            }
            return max;
        }
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 : "+max(data));
        System.out.println("최대값 : "+max(null));
        System.out.println("최대값 : "+max(new int[]{}));
    }
}
