package day05;

import java.util.Arrays;

public class SortTest {
  public static void main(String[] args) {

    double[] darr1 = new double[10];
    for (int i = 0; i < darr1.length; i++) {
      darr1[i] = Math.random();
      darr1[i] = Math.floor(darr1[i] * 100) / 100;
      // floor() 메소드로 소수점 이하 2자리 램덤 값 만들기
    }
    // 선택정렬 darr1과 같은 값으로 실행할 배열
    double[] darr2 = darr1.clone(); // darr1 배열을 복사해서 darr2 로 참조

    // System.out.println("랜덤 double 배열 1 : " + Arrays.toString(darr1));
    // System.out.println("랜덤 double 배열 2 : " + Arrays.toString(darr2));
    double[] darr3 = { 7.0, 4.0, 5.0, 1.0, 3.0, 6.0, 2.0 };
    new SortTest().bubbleSort(darr3);
    System.out.println("double 배열 정렬 후: " + Arrays.toString(darr3));
    // // 실행 시간 비교 : 성능 측정 nanoTime() 메소드
    // long startTime = System.nanoTime();
    // new SortTest().bubbleSort(darr1);
    // long endTime = System.nanoTime();
    // System.out.println("double 배열 정렬 후: " + Arrays.toString(darr1));
    // System.out.println("실행 시간 : " + (endTime - startTime) + " ns");
    // // bubbleSort : 23534700 ns

    // startTime = System.nanoTime();
    // new SortTest().selectionSort(darr2);
    // endTime = System.nanoTime();
    // System.out.println("double 배열 정렬 후: " + Arrays.toString(darr2));
    // System.out.println("실행 시간 : " + (endTime - startTime) + " ns");
    // // selectionSort : 2426000 ns
  }
  // ✅참고 : 정렬(알고리즘)의 성능 측정 -> 시간복잡도. 표기 Big-O. n은 데이터갯수
  // 버블 정렬, 선택정렬 : O(n의 제곱)
  // 병합 정렬, 퀵 정렬... : O(n log n) < O(n의 제곱)
  // Arrays.sort() 등 라이브러리는 성능이 좋은 알고리즘 사용합니다.

  void selectionSort(double[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        double temp; // 변수의 값 교환을 위한 임시 변수
        if (arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
      // System.out.println(String.format("i=%d %s", i, Arrays.toString(arr)));
    }
  }

  // 인접한 2개 값을 비교
  void bubbleSort(double[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        double temp; // 변수의 값 교환을 위한 임시 변수
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
        System.out.println(String.format("i=%d %s", i, Arrays.toString(arr)));
      }
    }
  }
}
