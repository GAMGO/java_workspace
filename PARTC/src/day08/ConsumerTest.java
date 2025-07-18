package day08;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerTest {
    // Stream 대신 list 자료구조 이용.
    public static void main(String[] args) {
        Integer[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List<Integer> nums = Arrays.asList(arr);
        System.out.println(nums);
        Consumer<Integer> con = (t) -> System.out
                .println(String.format("Math.pow( 2 , %d ) = %.0f", t, Math.pow(2, t)));
        nums.forEach(con);

    }
}
