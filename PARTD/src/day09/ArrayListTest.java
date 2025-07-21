package day09;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("DragonFruit");
        list.add("Durian");
        list.add("Melon");
        list.add("Kiwi");
        list.add("Strawberry");
        list.add("mango");
        System.out.println(list);
        int size = list.size();
        System.out.println(size);
        list.remove(6);
        size = list.size();
        System.out.println(list);
        System.out.println(size);
        toSeparate();
        for (int i = 0; i < list.size(); i++) {
            System.out.println("\t" + list.get(i));
        }
        toSeparate();
        list.set(list.size() - 1, "BlueBerry");
        for (String s : list) {
            System.out.println("\t" + s);
        }
        list.add("Melon");
        System.out.println(list);
        System.out.println(list.indexOf("Melon"));
        System.out.println(list.lastIndexOf("Melon"));
        toSeparate();
        System.out.println(list.contains("BlueBerry"));
        System.out.println(list.contains("StrawBerry"));
        toSeparate();
        list.sort(null);
        System.out.println(list);
    }

    private static void toSeparate() {
        System.out.println("\n\n\n");
        System.out.println("\t------------------------------------");
    }
}
