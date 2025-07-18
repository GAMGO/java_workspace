package day05;

import java.util.Arrays;

public class textjavas {
    public static void main(String[] args) {
        StudentScore sana = new StudentScore();
        StudentScore momo = new StudentScore("김모모", 78, 00, 88);

        sana.updateScores(99, 90, 89);
        momo.setKor(92);
        System.out.println();
        System.out.println("sana 성적 : " + Arrays.toString(sana.getScores()) + " avg : " + sana.getAverage() + ", "
                + sana.getGrade()); // sana 성적 : [99, 90, 89] avg :92.66,A
        System.out.println("momo 성적 : " + Arrays.toString(momo.getScores()) + " avg : " + momo.getAverage() + ", "
                + momo.getGrade()); // momo 성적 : [99, 90, 89] avg :93.33,A
        System.out.println(sana.getMaxScore() + "," + sana.getMinScore());
        System.out.println(momo.getMaxScore() + "," + momo.getMinScore());

    }
}

class StudentScore {
    private String name;
    private int[] scores; // 국어, 영어, 수학 점수를 저장하는 배열

    // 상수 정의 (배열 인덱스)
    private static final int KOR = 0;
    private static final int ENG = 1;
    private static final int MATH = 2;

    // 기본 생성자
    public StudentScore() {
        this.scores = new int[3]; // 3개 과목
    }

    // 매개변수 생성자
    public StudentScore(String name, int kor, int eng, int math) {
        this();
        this.name = name;
        this.scores[KOR] = kor;
        this.scores[ENG] = eng;
        this.scores[MATH] = math;

    }

    // 이름 getter/setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 국어 점수 getter/setter
    public int getKor() {
        return scores[KOR];
    }

    public void setKor(int kor) {
        this.scores[KOR] = kor;
    }

    // 영어 점수 getter/setter
    public int getEng() {
        return scores[ENG];
    }

    public void setEng(int eng) {
        this.scores[ENG] = eng;
    }

    // 수학 점수 getter/setter
    public int getMath() {
        return scores[MATH];
    }

    public void setMath(int math) {
        this.scores[MATH] = math;
    }

    // 점수 배열 전체 getter
    public int[] getScores() {
        return scores.clone();
    }

    // 총점 계산
    public int getTotal() {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total;
    }

    // 평균 계산
    public double getAverage() {
        return Math.floor((double) getTotal() / scores.length * 100) / 100; // 소수점 이하 2자리로 리턴하기
    }

    // 등급 계산 (평균 기준)
    public String getGrade() {
        int avg = (int) getAverage();
        return switch (avg / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };
    }

    // 모든 점수 업데이트
    public void updateScores(int kor, int eng, int math) {
        this.scores[KOR] = kor;
        this.scores[ENG] = eng;
        this.scores[MATH] = math;
    }

    // 최고 점수 찾기
    public int getMaxScore() {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }

    public int getMinScore() {
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        return min;
    }
}