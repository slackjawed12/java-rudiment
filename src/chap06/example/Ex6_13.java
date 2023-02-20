package chap06.example;

/**
 * 1. 생성자에서 다른 생성자 호출하기 - this()
 * - 생성자 이름으로 this 사용
 * - 생성자 블록의 첫 줄에서만 호출 가능
 * 2. 객체 자신을 나타내는 참조변수 - this
 * - 모든 인스턴스 메서드에 지역변수 형태로 존재함
 * - static 변수에는 사용 불가
 */
class Car2 {
    String color;
    String gearType;
    int door;

    Car2() {
        this("white", "auto", 4);
    }

    Car2(String color) {
        this(color, "auto", 4);
    }

    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class Ex6_13 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");

        System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType
                + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType
                + ", door = " + c2.door);
    }
}
