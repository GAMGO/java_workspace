package day10;

import java.util.*;

public class MenuCountEx {
    public static void main(String[] args) {
        String[] v = { "치킨", "떡볶이", "스파게티", "삼겹살", "곱창", "피자", "항정살", "치킨", "곱창", "스파게티" };
        // Map<String, Integer> mcnt = new HashMap<>();
        Map<String, Integer> mc2 = new HashMap<>();
        for (String k : v) {
            mc2.put(k, mc2.getOrDefault(k, 0) + 1);
        }
        // for (String k : v) {
        // if (mcnt.containsKey(k))
        // mcnt.put(k, mcnt.get(k) + 1);
        // else
        // mcnt.put(k, 1);
        // }
        System.out.println("득표수");
        for (String k : mc2.keySet()) {
            System.out.println(k + mc2.get(k));
        }

    }
}
