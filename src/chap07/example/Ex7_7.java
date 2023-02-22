package chap07.example;

/**
 * 상속 관계에서 형변환
 */
public class Ex7_7 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2= null;
        
        fe.water();

        car = fe;   // 자식 타입은 부모 타입으로 자동 변환 가능
//        car.water(); // 부모 타입으로 변환되면 자식 타입의 메서드는 호출 불가능
        fe2 = (FireEngine) car; // 부모 타입은 자식 타입으로 변환될 때 형변환 명시해야함
        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive");
    }

    void stop() {
        System.out.println("stop");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water");
    }
}
