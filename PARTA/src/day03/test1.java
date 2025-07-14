package day03;

//1. static 키워드에 대한 설명으로 올바른 것은? a -> c
//2. 다음 코드의 출력 결과는? '2'
//3. 기본 생성자에 대한 설명으로 틀린 것은? c
//4.다음 클래스에서 컴파일 오류가 발생하는 것은? b

public class test1 {
    // 5번 다음 코드에서 빈칸을 채우시오.
    /*
     * public class Counter {
     * private int count = 0;
     * private static int totalCount = 0; // 모든 카운터가 공유하는 변수
     * 
     * public void increment() {
     * count++;
     * totalCount++; // 공유 변수 증가
     * }
     * 
     * public static int getTotalCount() { // 객체 생성 없이 호출 가능한 메소드
     * return totalCount;
     * }
     */
    // 6번 다음 코드에서 빈칸을 채우시오.
    /*
     * public class Calculator {
     * private int result;
     * 
     * public Calculator() { // 기본 생성자
     * result = 0;
     * }
     * 
     * public void add(int num) { // 반환형이 없는 인스턴스 메소드
     * result += num;
     * }
     * 
     * public int getResult() { // 결과를 반환하는 인스턴스 메소드
     * return result;
     * }
     * }
     */
    // 7번 다음 코드에서 빈칸을 채우시오.
    /*
     * public class MathUtils {
     * public static final double PI = 3.14159; // 클래스 상수
     * 
     * public static double calculateArea(double radius) { // 인스턴스 생성 없이 호출
     * return PI * radius * radius; // 위에서 선언한 상수 사용
     * }
     * }
     */
    // 8. 다음 코드에서 빈칸을 채우시오.
    /*
     * public class Car {
     * private String brand;
     * private int speed;
     * private static int maxSpeed = 200; // 모든 자동차가 공유하는 최고 속도
     * 
     * // 기본 생성자
     * public Car() {
     * brand = "Unknown";
     * speed = 0;
     * }
     * 
     * public static void printMaxSpeed() { // 객체 생성 없이 호출 가능
     * System.out.println("Max speed: " + maxSpeed);
     * }
     * }
     */
    // 9. 다음 코드에서 기본 생성자의 역할을 설명하고, 출력 결과를 예측하시오. "Name: Anonymous, Grade: 1 "
    // 10. 다음 코드의 실행 결과를 예측하고, 그 이유를 설명하시오. "Instance: 1, Static: 2"
    /*
     * private int instanceCount = 0;
     * private static int staticCount = 0;
     * 
     * public test1() {
     * instanceCount++;
     * staticCount++;
     * }
     * 
     * public void printCounts() {
     * System.out.println("Instance: " + instanceCount + ", Static: " +
     * staticCount);
     * }
     * 
     * public static void main(String[] args) {
     * test1 c1 = new test1();
     * test1 c2 = new test1();
     * c1.printCounts();
     * c2.printCounts();
     * }
     */

}
