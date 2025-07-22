package day10;

import java.util.*;

public class SetTesting {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("sana");
        s.add("momo");
        s.add("nana");
        s.add("sana");
        System.out.println(s.size());
        System.out.println(s);

        for (String x : s) {
            System.out.println(x);
        }
        System.out.println("\n------------------------------\n");

        Set<String> ss = new LinkedHashSet<>(s);
        ss.add("dayeon");
        System.out.println(ss + "\n");
        for (String x : ss) {
            System.out.println(x);
        }
        System.out.println("\n------------------------------\n");
        boolean r = ss.remove("momo");
        System.out.println(r);
        System.out.println("\n------------------------------\n");
        r = ss.remove("ramen");
        System.out.println(r);
        System.out.println("\n------------------------------\n");
        System.out.println(ss);
        System.out.println("\n------------------------------\n");

        Set<String> ts = new TreeSet<>(s);
        System.out.println(ts);
    }
}
