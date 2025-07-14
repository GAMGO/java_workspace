package day04;

import java.util.Arrays;
//자바에서 java.lang 기본패키지. 이외의 것들은 import하고 사용.
//java.lang -> String,Integer,Double,Boolean,System..etc

public class ArrayTest {
    public static void main(String[] args) {
        // 배열 타입은 [] 기호, 배열 리터럴 {}
        int[] arr1 = { 11, 22, 33, 44, 55 };
        int[] arr2 = new int[10];
        // System.out.println("배열1 : " + arr1);
        // System.out.println("배열2 : " + arr2);
        double[] darr1 = { 3.4, 5, 8.88, 1.23, 9.99 };
        double[] darr2 = { 3.4, 5, 8.88, 1.23, 9.99 };
        System.out.println("Double 배열 : " + darr1);
        System.out.println("배열1 길이 : " + arr1.length);
        System.out.println("Double 배열 길이 : " + darr1.length);
        System.out.println("배열1 첫번째 숫자 : " + arr1[0]);
        System.out.println("Double 배열 네번째 : " + darr1[3]);
        arr1[arr1.length - 1] = 99;
        arr2[arr2.length - 1] = 99;
        System.out.println("arr1 [4] >>>>> " + arr1[4]);
        System.out.println("arr2 [9] >>>>> " + arr2[9]);
        // 배열 값들을 문자열로 리턴
        System.out.println("arr1 " + Arrays.toString(arr1));
        System.out.println("arr2 " + Arrays.toString(arr2));
        System.out.println("darr1 " + Arrays.toString(darr1));
        // 배열 요소를 특정 값으로 채우기
        Arrays.fill(arr2, 2, 5, 3);
        System.out.println(Arrays.toString(arr2));
        // 배열 비교
        System.out.println("실수 배열 참조값 비교 > " + (darr1 == darr2));
        System.out.println("실수 배열 요소값 비교 > " + Arrays.equals(darr1, darr2));
        int[] newarr1 = Arrays.copyOf(arr1, 5);
        System.out.println("복사한 배열 : " + Arrays.toString(newarr1));
        // 배열정렬
        int[] sarr1 = { 56, 45, 77, 64, 72 };
        Arrays.sort(sarr1);
        System.out.println("sarr1 배열 정렬 = " + Arrays.toString(sarr1));
    }
}
