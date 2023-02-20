package chap06.example;

/**
 * 명시적 초기화로 배열 생성
 * 초기화 블럭으로 random 값 할당
 * --> 초기화 블럭으로 복잡한 초기화 작업 가능
 */
public class Ex6_15 {
    static int[] arr = new int[10];

    static {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }
    }
}
