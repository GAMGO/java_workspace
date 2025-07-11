package day03;

public class ScoreInstanceMethod {
    public static void main(String[] args) {
        boolean isCount = true;
        while (isCount) {
            String ScoreKr, ScoreEn, ScoreMt;
            Score momo = new Score();
            momo.name = System.console().readLine("학생이름은? \n" + "========================>");
            ScoreKr = System.console().readLine("한국어 점수 입력! \n" + "========================>");
            ScoreEn = System.console().readLine("영어 점수 입력! \n" + "========================>");
            ScoreMt = System.console().readLine("수학 점수 입력! \n" + "========================>");
            momo.KOR = Integer.valueOf(ScoreKr);
            momo.ENG = Integer.valueOf(ScoreEn);
            momo.MATH = Integer.valueOf(ScoreMt);
            System.out.println("------------객체 유형성 검사 ------------");
            System.out.println("이름 : " + momo.name + " => " + momo.isNameVaild());
            System.out.println("국어 : " + momo.KOR + " => " + momo.isKorV());
            System.out.println("영어 : " + momo.ENG + " => " + momo.isEngV());
            System.out.println("수학 : " + momo.MATH + " => " + momo.isMathV());
            if (momo.isVaild()) {
                System.out.println(momo.name + "의 총점 = " + momo.sum());
                System.out.println("해당 학생의 점수 평균(double) = " + momo.avg());
                System.out.println("해당 학생의 점수 평균(integer) = " + (int) momo.avg());
                System.out.println(momo.name + "의 최종 학점 = " + momo.getGrade());
            } else {
                System.out.println("Score is Invaild!");
            }
            String confirm = System.console()
                    .readLine("Finish? (If you want continue this method Please Insert any key)");
            switch (confirm) {
                case "Y", "y":
                    isCount = false;
                    break;
                default:
                    break;
            }
        }

    }
}

class Score {
    String name;
    int KOR, ENG, MATH;

    int sum() {
        return KOR + ENG + MATH;
    }

    double avg() {
        // 강제 형변환![casting] => 값 앞에 (double)변수명
        // Primitive type끼리만 변환할때 사용. 문자열과 실수는 성격이 다르므로 강제 캐스팅이 불가.
        return (double) sum() / 3;
    }

    char getGrade() {
        int avg = sum() / 3;
        char gr;
        switch (avg / 10) {
            case 10, 9:
                gr = 'A';
                break;
            case 8:
                gr = 'B';
                break;
            case 7:
                gr = 'C';
                break;
            case 6:
                gr = 'F';
                break;
            default:
                gr = 'E';
                System.out.println("Inviald score integer!");
                break;
        }
        return gr;
    }

    // "^[가-힣]{2,5}$";
    boolean isNameVaild() {
        return name.matches("^[가-힣]{2,5}$");
    }

    boolean isKorV() {
        return KOR >= 0 && KOR <= 100;
    }

    boolean isEngV() {
        return ENG >= 0 && ENG <= 100;
    }

    boolean isMathV() {
        return MATH >= 0 && MATH <= 100;
    }

    boolean isVaild() {
        return isEngV() && isKorV() && isMathV();
    }

    @Override
    public String toString() {
        // return name + " : " + KOR + "," + ENG + "," + MATH;
        return String.format("%s : %d, %d, %d", name, KOR, ENG, MATH);
    }
}
