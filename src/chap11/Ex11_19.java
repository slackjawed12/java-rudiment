package chap11;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.*;

public class Ex11_19 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);
        addAll(list, 1, 2, 3, 4, 5);
        System.out.println(list);

        rotate(list, 2);    // 오른쪽으로 2칸씩 이동
        System.out.println(list);

        swap(list, 0, 2);
        System.out.println(list);

        shuffle(list);
        System.out.println(list);

        sort(list, reverseOrder()); // 여순 정렬
        System.out.println(list);

        sort(list);
        System.out.println(list);

        int idx = binarySearch(list, 3);
        System.out.println("index of 3 = " + idx);

        System.out.println("max = " + max(list));
        System.out.println("min = " + min(list));
        System.out.println("min = " + max(list, reverseOrder()));   // max(Collection, Comparator)

        fill(list, 9);
        System.out.println("list = " + list);

        List newList = nCopies(list.size(), 2);
        System.out.println("list = " + list);
        System.out.println("newList = " + newList);

        System.out.println(disjoint(list, newList));

        copy(list, newList);
        System.out.println("newList = " + newList);
        System.out.println("list = " + list);
    }
}
