package chap07.example;

public class Ex7_3 {
    public static void main(String[] args) {
        new Child2().method();
    }
}

class Parent2 {
    int x = 10; // super.x
}

class Child2 extends Parent {
    int x = 20;

    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}