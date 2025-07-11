package day03;

//String 클래스의 인스턴스 메소드
//생성된 객체를 대상으로 실행하여 객체의 값에 따라 결과가 다름.
public class StringInstanceMethod {
    public static void main(String[] args) {
        String msg = "hello";
        // msg 문자열 객체의 인스턴스 메소드(JS, Python과 유사)
        // 리턴 타입이 String인 경우 , 새로운 문자열이 만들어집니다.
        msg = "hello~ java!!"; // 문자열을 구성하는 문자의 위치 0 부터 시작
        System.out.println(msg);
        System.out.println(msg.length()); // Integer
        System.out.println(msg.charAt(4)); // char
        System.out.println(msg.toUpperCase()); // String
        System.out.println(msg.toLowerCase()); // String
        System.out.println(msg.startsWith("hello")); // boolean
        System.out.println(msg.endsWith("java")); // boolean
        System.out.println(msg.replace(" ", "*")); // String
        System.out.println(msg.substring(1, 4)); // String
        System.out.println(msg.substring(3)); // String
        System.out.println(msg.lastIndexOf(" ")); // Integer
        System.out.println(msg.indexOf(" ")); // Integer
        System.out.println(msg.concat("??")); // String
        System.out.println(msg.equals("hello~ java!!")); // boolean
        System.out.println(msg.trim()); // String
        System.out.println(msg.equalsIgnoreCase("hello~  java!!")); // boolean
        // Java는 문자열 같은지 비교할 때 == 안됨. (참조값 비교함) : String 문자열 비교는 반드시 equals 사용.
        String test = "  ";
        String test2 = "";
        System.out.println(test.isBlank());
        System.out.println(test.isEmpty());
        System.out.println(test2.isBlank());
        System.out.println(test2.isEmpty());
        System.out.println("----------------------------------------------------------------------------");
        // 정규식 패턴 검사
        // "-"기호를 선택적으로 하고싶을때 : 없거나 한번 나오기 => ?
        String regex = "^010-?\\d{4}-?\\d{4}$";
        String ph = "010-6459-8888";
        String ph2 = "011-659-8828";
        System.out.println("010-6459-8888 입력값은 = " + ph.matches(regex));
        System.out.println("011-659-8828 입력값은 = " + ph2.matches(regex));
        System.out.println("01044562258 입력값은 = " + "01044562258".matches(regex));
        // '+'기호는 반드시 한글자, 한글의 범위는 가-힣 이다.
        String name = "김땡떙";
        String nameregex = "^[가-힣]{2,5}$";
        System.out.println(name + "의 Bool값은 = " + name.matches(nameregex));
        System.out.println("가" + "의 Bool값은 = " + "가".matches(nameregex));
        System.out.println("Honggildong의 한글문자열 검사 결과는 = " + "Honggildong".matches(nameregex));
        // 영문자 검사
        System.out.println("Honggildong의 영문문자열 검사 결과는 = " + "Honggildong".matches("^[A-Z][a-zA-Z\\s]+$"));
    }
}
