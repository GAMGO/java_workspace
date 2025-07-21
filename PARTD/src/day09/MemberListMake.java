package day09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import lombok.*;

public class MemberListMake {
    public static void main(String[] args) {
        List<String> names = List.of("apple", "kiwi", "mango", "banana");
        System.out.println(names);

        String[] temp = { "apple", "kiwi", "mango", "banana" };
        List<String> fruits = Arrays.asList(temp);
        // fruits.add("melon");
        Member m1 = new Member(1, "김땡땡", 3.4);
        Member m2 = new Member(2, "반하나", 1.9);
        Member m3 = new Member(3, "최사과", 5.4);
        Member m4 = new Member(4, "박모모", 6.3);
        toSeparate();
        List<Member> ms = List.of(m1, m2, m3, m4);
        for (Member s : ms) {
            System.out.println(s);
        }
        toSeparate();
        System.out.println("\t" + ms.get(2).getName());
        toSeparate();
        List<Member> ms2 = new ArrayList<>(ms);
        ms2.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        for (Member m : ms2) {
            System.out.println("\t" + m);
        }
        toSeparate();
        ms2.sort((o1, o2) -> Double.compare(o1.getPt(), o2.getPt()));
        for (Member m : ms2) {
            System.out.println("\t" + m);
        }
    }

    private static void toSeparate() {
        System.out.println("\n");
        System.out.println("\t------------------------------------");
        System.out.println("\n");
    }
}
