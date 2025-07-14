package day04;

import java.util.Arrays;

public class MyArrayMethod {
    public static void main(String[] args) {
        int[] scores = { 78, 9, 67, 100, 88 };
        System.out.println("메소드 실행 전 => " + Arrays.toString(scores));
        changeArrayValue(scores, 2, 69);
        System.out.println("메소드 실행 후 => " + Arrays.toString(scores));
        int[] scores2 = { 72, 90, 79 };
        System.out.println("Score1 => " + sumOfArrayValue(scores));
        System.out.println("Score2 => " + sumOfArrayValue(scores2));
        int[] merArr = mergeOfArray(scores, scores2);
        Arrays.sort(merArr);
        System.out.println("Merging Score1 & Score2 => " + Arrays.toString(merArr));
    }

    private static void changeArrayValue(int[] arr, int index, int value) {
        arr[index] = value;
    }

    private static int sumOfArrayValue(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;

    }

    // 리턴이 배열 (merge)
    private static int[] mergeOfArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i;
        for (i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }
}
