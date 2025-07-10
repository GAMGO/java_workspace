package day02;
/*
 * .java 소스파일에 클래스는 여러개 정의 가능
 * public class는 1개만 존재 가능, 클래스 이름 = 파일명
 */
public class ObejctTest {
    public static void main(String[] args) {
        //Score 타입 객체생성 -> 변수로 객체의 주소 참조
        Score momo = new Score();

        momo.name = "모모";
        momo.KR=99;
        momo.Math=89;
        momo.Eng=88;
        System.out.println("정보"+momo);
        System.out.println(momo.name+momo.Eng+momo.KR+momo.Math);
    }
}
class Score{
    String name;
    int KR;
    int Math;
    int Eng;
}