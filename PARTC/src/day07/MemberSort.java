package day07;

import java.util.Arrays;

public class MemberSort {
    public static void main(String[] args) {
        int[] nums = { 7, 9, 5, 8, 3 };
        String[] names = { "momo", "nayeon", "dahyeon", "sana", "apple" };
        Arrays.sort(names);
        Arrays.sort(nums);
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(nums));
        Member[] m = new Member[4];
        m[0] = new Member("Durian", 10);
        m[1] = new Member("Lemon", 20);
        m[2] = new Member("Coconot", 30);
        m[3] = new Member("Kiwi", 40);
        Arrays.sort(m);
        for (Member m1 : m) {
            m1.print();
        }
    }
}
