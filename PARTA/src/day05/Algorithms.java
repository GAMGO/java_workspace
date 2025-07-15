package day05;

import java.util.Arrays;

public class Algorithms {
    public static void main(String[] args) {
        int[] nums = { 29, 33, 36, 7, 16, 25 };
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int saveNum = nums[i];
                    nums[i] = nums[j];
                    nums[j] = saveNum;
                }
            }
            System.out.println(String.format("i=%d %s", i, Arrays.toString(nums)));
        }
        int[] nums2 = { 87, 54, 21, 91, 42, 112, 180, 1, 22, 8, 13, 35, 44, 69, 72 };
        sortArr(nums2);
        double endTime = System.nanoTime();
        System.out.println(endTime + "ns");
    }

    private static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int saveNum = arr[i];
                    arr[i] = arr[j];
                    arr[j] = saveNum;
                }
            }
            System.out.println(String.format("i=%d %s", i, Arrays.toString(arr)));
        }
    }
}