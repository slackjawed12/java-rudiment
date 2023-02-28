package chap11;

import java.util.*;

/**
 * HashMap value 이용해서 빈도 수 # 으로 출력하기
 */
public class Ex11_18 {
    public static void main(String[] args) {
        String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "Z", "D"};
        HashMap map = new HashMap();
        for (String datum : data) {
            if (map.containsKey(datum)) {
                int value = (int) map.get(datum);
                map.put(datum, value + 1);
            } else {
                map.put(datum, 1);
            }
        }

        for (Object o : map.entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            int value = (int) entry.getValue();
            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
        }
    }

    public static String printBar(char ch, int value) {
        char[] bar = new char[value];
        Arrays.fill(bar, ch);
        return new String(bar);
    }
}
