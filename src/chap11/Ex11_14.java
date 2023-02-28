package chap11;

import java.util.TreeSet;

/**
 * TreeSet - add, subSet(Object from, Object to)
 */
public class Ex11_14 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "b";
        String to = "d";

        set.add("flower");
        set.add("abc");
        set.add("alien");
        set.add("Car");
        set.add("bat");
        set.add("car");
        set.add("disc");
        set.add("dance");
        set.add("dzzzz");
        set.add("dZZZZ");
        set.add("elephant");
        set.add("elevator");
        set.add("fan");

        System.out.println(set);
        System.out.println("range search : from " + from + " to " + to);
        System.out.println("result1 : " + set.subSet(from, to));
        System.out.println("result2 : " + set.subSet(from, to + "zzz"));
    }
}
