package chap07.example;

/**
 * 인터페이스의 디폴트 메서드, static 메서드
 */
public class Ex7_11 {
    public static void main(String[] args) {
        Child3 c = new Child3();
        c.method1();
        c.method2();    // 이름 충돌 시 부모 클래스 메서드 호출
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}

class Child3 extends Parent3 implements MyInterface, MyInterface2 {
    @Override
    public void method1() {
        System.out.println("method1() in Child3");  // 오버라이딩
    }
}

class Parent3 {
    public void method2() {
        System.out.println("method2() in parent3");
    }
}

interface MyInterface {
    default void method1() {
        System.out.println("method1() in MyInterface");
    }

    default void method2() {
        System.out.println("method2() in MyInterface");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2 {
    default void method1() {
        System.out.println("method1() in MyInterface2");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}




