package day04;

public class ConstructorTest {
    public static void main(String[] args) {
        People sana = new People();
        // 커스텀 생성자 -> 만들면 기본 생성자로 자동 생성되지 않는다.
        People momo = new People(24, true, "김모모");
        System.out.println("기본 생성자 : " + sana);
        System.out.println("커스텀 생성자 : " + momo);
        People nana = new People(23);
        System.out.println("커스텀 생성자 nana : " + nana);
    }

}
