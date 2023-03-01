package chap11.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_9 {
    public static void main(String[] args) {
        Object[] objArr = {"1", 1, "2", "2", "3", "3", "4", "4", "5"};
        Set set = new HashSet();
        // 저장 순서 유지하려면 LinkedHashSet
        for (int i = 0; i < objArr.length; i++) {
            set.add(objArr[i]);
        }

        System.out.println(set);

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
