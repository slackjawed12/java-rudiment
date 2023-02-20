package chap06.example;

/**
 * 생성자 실습
 */
class Data_1{
    int value;
    // 클래스 내 명시된 생성자가 없으면 디폴트 생성자로 객체 생성
}

class Data_2{
    int value;

    // 매개변수가 있는 생성자
    Data_2(int x){
        value =x;
    }
    // 명시된 생성자가 있으므로
    // 자동으로 디폴트 생성자에 의해 인스턴스를 생성할 수 없다.
    // 디폴트 생성자로 만들고 싶으면 따로 선언해줘야 함
}

public class Ex6_11 {
    public static void main(String[] args) {
        Data_1 d1 =new Data_1();
//        Data_2 d2 = new Data_2(); // compile error
        Data_2 d2 = new Data_2(10);
    }
}
