package day02;

public class StringTest {
    public static void main(String[] args) {
        String n1 = "모모";
        String n2 = "사나";

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());
        n1 = "나나";
        //문자열 : 불변 객체(immutable Object) - 특정 문자열이 메모리에 저장, 만약 주소가 100이면 해당 주소에는 다른 문자열로 바꿔 저장할 수 없다.
        //변수가 참조하는 문자열이 바뀌면 참조값도 변경된다 (객체가 새로 생성된다는 뜻)
    }

}
