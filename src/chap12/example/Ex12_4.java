package chap12.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Fruit2 {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple2 extends Fruit2 {
    public String toString() {
        return "Apple";
    }
}

class Grape2 extends Fruit2 {
    public String toString() {
        return "Grape";
    }
}

class Juice {
    String name;

    Juice(String name) {
        this.name = name + "Juice";
    }

    public String toString() {
        return name;
    }
}

class Juicer {
    static Juice makeJuice(FruitBox2<? extends Fruit2> box) {
        String tmp = "";
        for (Fruit2 f : box.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }

    /**
     * generic method - 시그니처에 제네릭 타입 선언됨
     * 1. 제네릭 클래스의 T와 제네릭 메서드의 T는 별개임
     * 2. static 메서드로 사용 가능
     */
    static <T extends Fruit2> Juice makeJuice2(FruitBox2<T> box) {
        String tmp = "";
        for (Fruit2 f : box.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }

    public void foo() {
        FruitBox2<Fruit2> box = new FruitBox2<>();
        System.out.println(makeJuice2(box)); // 타입 생략 가능
    }
}

public class Ex12_4 {
    public static void main(String[] args) {
        FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
        FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
        FruitBox2<? extends Fruit2> box = new FruitBox2<>(); // 가능
        FruitBox2<? extends Fruit2> box2 = new FruitBox2<Fruit2>(); // 가능
        FruitBox2<? extends Fruit2> box3 = new FruitBox2<Apple2>(); // 가능

        fruitBox.add(new Apple2());
        fruitBox.add(new Grape2());
        appleBox.add(new Apple2());
        appleBox.add(new Apple2());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));

        System.out.println("static generic makeJuice");
        System.out.println(Juicer.<Fruit2>makeJuice2(fruitBox));
        System.out.println(Juicer.<Apple2>makeJuice2(appleBox));
        System.out.println(Juicer.makeJuice2(appleBox));    // 타입 생략 가능
    }
}

class FruitBox2<T extends Fruit2> extends Box2<T> {
}

class Box2<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    ArrayList<T> getList() {
        return list;
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}
