package day08;

public class FunctionalInterf {
    public static void main(String[] args) {

    }
}

/*
 * 자바의 인터페이스 중 인자, 리턴값의 유무 등에 따라 다양한 형식의 인터페이스 있음.
 *** 특징 : 추상 메소드 1개만 정의, 다른 프로그래밍 언어의 함수처럼 사용.**
 * 
 * 함수형 인터페이스를 익명 클래스로 구현할 때 람다식 사용.
 */
interface Testa { // 인자 o 리턴 x : Consumer (소비자)

    void test(String msg);

}

interface Testb { // 인자 x 리턴 o : Supplier (공급자)
    void test2();
}

interface Testc {// 인자 o 리턴 o : Function (함수)
    int test3(int a, int b);
}