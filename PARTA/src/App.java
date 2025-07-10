public class App {
    public static void main(String[] args) {
        /*App 클래스에서 정의 된 메소드 : main 메소드는 프로그램 실행을 해주는 메소드*/
        System.out.println("Hello, World!");
        int age = 29;
        char gender = 'm';
        String name = "Min";
        boolean isOk = true;
        System.out.println("name"+name);
        System.out.println("bool"+(isOk?"성인":"미성년"));
        System.out.println("char"+gender);
        System.out.println("age?"+age);
    }
}
/*Day01 자바 프리뷰
 * 기본형 데이터 Primitive Data
 * 클래스 & 객체
 * 클래스 - 객체를 만들기 위한 설계도, 데이터의 특징값(필드과 데이터를 활용한 기능(메소드)을 포함하여 정의
 * 객체 : 클래스에서 정의된 특징에 대한 값을 메모리에 저장되는 형태
 * 패키지 : 클래스의 소속. 일반적으로는 도메인명
 * 수업에서의 클래스 명은 org.iclass.day01 -> 기니까 day01으로
 */