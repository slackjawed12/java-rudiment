package chap06.exercise;

class PlayingCard {
    int kind;   // 인스턴스 변수
    int num;    // 인스턴스 변수
    static int width;   // 클래스 변수
    static int height;  // 클래스 변수

    PlayingCard(int k, int n) {
        kind = k;   // k : 지역변수
        num = n;    // n : 지역변수
    }
}

public class Exercise6_5 {
    public static void main(String[] args) {
        PlayingCard card = new PlayingCard(1, 1);
    }
}
