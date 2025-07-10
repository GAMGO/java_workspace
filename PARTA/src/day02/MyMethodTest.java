package day02;

public class MyMethodTest {
    public static void main(String[] args) {
        String languages = System.console().readLine("자주 사용하는 프로그래밍 언어 입력 >>>>>>>> \n");
        Myclass.hello(languages);
        Myclass.messages = "Hi && Hello";
        System.out.println(Myclass.messages);
        System.out.println(Myclass.getMessageLength());
    }
    /*
     * 메소드의 형식
     * 정해진 기능을 처리, 재사용성을 위한 함수 형식
     * 입력과 출력 -> 입력은 메소드의 인자, 출력은 메소드의 Return
     * 인자, 리턴유무 조합으로 4가지 형식 가능.
     * 
     * static -> 객체를 new 연산으로 만들지 않고 클래스이름으로 바로 사용할 수 있는 형식
     * 
     */
}

class Myclass {
    static String messages;

    static void hello(String language) {
        System.out.println("Welcome " + language);
    }

    static String getMessage() {
        return messages;
    }

    static int getMessageLength() {
        return messages.length();
    }
    
}