package day03;

public class StaticNInstance {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.getCount());

    }
}

/*
 * getCount() 메소드는 1. static 2.인자로 선언할 변수가 없음 = ()안에 값이 없다.
 * count 값 리턴하는 getter => 리턴 타입은 int
 * 
 * 이 코드는 Counter 객체가 몇번 생성되었는지 알아내는 방법임.
 */
class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }// 생성자 메소드 - 리턴 없음, 클래스 이름과 통일해야함. new연산할 때 실행.

    public static int getCount() {
        return count;
    }
}
