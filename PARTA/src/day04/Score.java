package day04;

public class Score {
    public static void main(String[] args) {
        Score momo = new Score("김모모", 89, 76, 25);
        System.out.println(momo);
    }

    private String name;
    private int kor;
    private int eng;
    private int math;

    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public Score(String name) {
        this.name = name;
        // 이름만 초기화
    }

    public void setScores(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        // 점수를 모두 받아서 초기화
    }

    // public String name() {
    // return this.name;
    // }

    // public Integer getKr() {
    // return this.kor;
    // }

    // public Integer getEn() {
    // return this.eng;
    // }

    // public Integer getMt() {
    // return this.math;
    // }

    @Override
    public String toString() {
        return String.format("성명 : %s \n한국어 점수 : %d \n영어 점수: %d \n수학 점수 : %d \n", this.name, this.kor, this.eng,
                this.math);
    }
}
