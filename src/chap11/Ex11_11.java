package chap11;

import java.util.HashSet;

/**
 * set 중복 판단 기준 : equals, hashCode
 * 의도대로 중복제거하려면 equals, hashCode 둘 다 오버라이딩 해야함
 */
public class Ex11_11 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person("David",10));
        set.add(new Person("David",10));
        System.out.println(set);
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ":" + age;
    }
}
