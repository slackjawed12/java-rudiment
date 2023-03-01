package chap12.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex12_2 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("자바왕", 1, 1));
        students.add(new Student("홍길동", 1, 2));
        students.add(new Student("윤대협", 2, 1));

        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.name);
        }
    }
}

class Student {
    String name = "";
    int ban;
    int no;

    public Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
}
