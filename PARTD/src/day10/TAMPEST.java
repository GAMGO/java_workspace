package day10;

import java.util.*;

public class TAMPEST {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("a2", "sdfaf");
        m.put("a4", "ssdfsdfsdfsfaf");
        m.put("a1", "saf5723r2");
        m.put("a3", "sdfaibb5tjfgn");
        m.put("a2", "sdfaf");
        System.out.println(m.size());
        System.out.println(m);
        Map<String, String> lm = new LinkedHashMap<>();
        lm.put("a2", "12dqwscqwc");
        lm.put("a4", "dlklf");
        lm.put("a1", "safcvmzkrmpe4723r2");
        lm.put("a3", "slgonmoaedvjfgn");
        System.out.println(lm);

        Map<String, String> tm = new TreeMap<>(m);
        System.out.println(tm);
        String t = tm.get("a1");
        System.out.println(t);
        System.out.println("\n---------------------------\n");
        for (String k : tm.keySet()) {
            System.out.println(tm.get(k));
        }
        System.out.println(m.entrySet().toString());
        tm.entrySet().stream()
                .forEach(entry -> System.out.println(entry + "\t" + entry.getKey() + " : " + entry.getValue()));
        System.out.println(tm.values());
    }
}
