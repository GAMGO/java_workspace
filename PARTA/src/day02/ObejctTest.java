package day02;

/*
 * .java 소스파일에 클래스는 여러개 정의 가능
 * public class는 1개만 존재 가능, 클래스 이름 = 파일명
 */
public class ObejctTest {
    public static void main(String[] args) {
        // Score 타입 객체생성 -> 변수로 객체의 주소 참조
        Score momo = new Score();

        momo.name = "모모";
        momo.KR = 99;
        momo.Math = 89;
        momo.Eng = 88;
        System.out.println("정보" + momo);
        System.out.println(momo.toString());

        Score momo2 = momo;
        System.out.println("정보 momo2 :" + momo2);
        System.out.println(momo2.name + momo2.Eng + momo2.KR + momo2.Math);
        momo.name = "momo";
        momo.KR = 100;
        momo.Math = 79;
        momo.Eng = 8;
        System.out.println("정보2" + momo);
        System.out.println(momo.name + momo.Eng + momo.KR + momo.Math);
        // 문자열 : 불변 객체(immutable Object) - 특정 문자열이 메모리에 저장, 만약 주소가 100이면 해당 주소에는 다른 문자열로
        // 바꿔 저장할 수 없다.
        // Object 부모클래스의 메소드 : clone(),hashcode(),equals(),toString()
        // toString()은 오버라이드 (재정의) : @Override는 실행코드가 아니라 개발관련 주석
    }
}

class Score {
    String name;
    int KR;
    int Math;
    int Eng;

    @Override
    public String toString() {
        return "-ToString()-" + name + Eng + KR + Math;
    }
}