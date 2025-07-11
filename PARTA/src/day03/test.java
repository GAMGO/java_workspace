package day03;

/* 4번
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "이름: " + name + "나이: " + age;
    }

    // 5번답은 3번

}

// 6번 -> 
class MyCalculator {

    // 2의 n승 계산하기(n=0일 때 결과는 1)
    static int powerOfTwo(int count) {
        int result = 1;
        for (int i = 0; i < count; i++) {
            result *= 2;
        }
        return result;
    }
}*/

public class test {
    public static void main(String[] args) {
        /*
         * 4번
         * Student s = new Student("홍길동", 20);
         * System.out.println(s.toString());
         * 
         * // 1번의 정답은 2.String <- 참조변수
         * // 2번
         * String str1 = "Hello";
         * String str2 = "Hello";
         * String str3 = new String("Hello");
         * 
         * System.out.println(str1 == str2); // true
         * System.out.println(str1 == str3); // false
         * 
         * class Person {
         * String name;
         * int age;
         * }
         * // 3번
         * Person p1 = new Person(); // -> 새 Person 참조 생성
         * Person p2 = new Person(); // -> 마찬가지 같을 수가 없음.
         * Person p3 = p1;
         * 
         * System.out.println(p1 == p2); // false
         * System.out.println(p1 == p3); // true
         * 7번 -> 정답 : 해당 자료구조의 오버플로우 현상.
         * byte b = 127;
         * b++;
         * System.out.println(b);
         * 
         * // 8번
         * public class ScopeTest {
         * public static void main(String[] args) {
         * if (true) {
         * int x = 10;
         * }
         * // System.out.println(x); // 컴파일 에러 -> x는 if안에 지역변수임.
         * }
         * }
         * // 9번
         * boolean continued = true;
         * while (continued) {
         * String g = System.console().readLine("점수 입력 하기 \n" + ">>>>>>>>>>>>>");
         * int grade = Integer.valueOf(g);
         * // switch 문을 여기에 작성. grade 는 10으로 나눈 몫을 활용합니다.
         * switch (grade / 10) {
         * case 9:
         * System.out.println("A");
         * break;
         * case 8:
         * System.out.println("B");
         * break;
         * case 7:
         * System.out.println("C");
         * break;
         * case 6:
         * System.out.println("D");
         * break;
         * default:
         * System.out.println("F");
         * break;
         * }
         * String c = System.console().readLine("Continue? (y/n)");
         * switch (c) {
         * case "y":
         * break;
         * case "n":
         * continued = false;
         * break;
         * default:
         * break;
         * }
         * }
         * 
         * MyCalculator r = new MyCalculator();
         * System.out.println(r.powerOfTwo(3));
         */
    }
}
