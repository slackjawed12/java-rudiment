package chap07;

/**
 * 참조변수 super
 */
public class Ex7_2 {
    public static void main(String[] args) {
        new Child().method();
    }
}

class Parent {
    int x = 10; // super.x
}

class Child extends Parent {
    int x = 20;

    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}
