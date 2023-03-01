package chap11.example;

import java.util.Set;
import java.util.TreeSet;

public class Ex11_13 {
    public static void main(String[] args) {
        Set set = new TreeSet();    // TreeSet 선언 - Integer::compareTo 디폴트

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);
        }
        System.out.println(set);
    }
}
