package day02;

/*
변수 사용 가능 범위 (Scope)
변수가 선언된 위치에 따라 결정.
*/
public class VariableScope {
    static String message = "Hello"; // 전역변수

    public static void main(String[] args) {
        System.out.println(message);
        hello();
        // println(System.console().readLine("원하는 내용을 입력해보자\n"));
        int p = 100;
        for (int i = 0; i > 5; i++) {
            for (int j = 0; j > 5; j++) {
                System.out.println("*");
            }
        }
    }

    private static void println(String data1) { // 지역변수
        System.out.println(data1);

    }

    public static void hello() {
        System.out.println(message + "*******");
    }
}
