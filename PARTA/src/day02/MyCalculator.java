package day02;

public class MyCalculator {
    public static void main(String[] args) {
        String tempint1 = System.console().readLine("첫번재 숫자 입력 : \n" + ">>>>>>>>>>>>>> ");
        String math = System.console().readLine("사칙연산 입력 : \n" + ">>>>>>>>>>>>>> ");
        String tempint2 = System.console().readLine("두번재 숫자 입력 : \n" + ">>>>>>>>>>>>>> ");
        double data1 = Double.valueOf(tempint1);
        double data2 = Double.valueOf(tempint2);
        System.out.println(Math.min(data1, data2));
        System.out.println(Math.max(data1, data2));
        switch (math) {
            case "+":
                System.out.println(MyCal.add(data1, data2));
                break;
            case "-":
                System.out.println(MyCal.sub(data1, data2));
                break;
            case "*":
                System.out.println(MyCal.mul(data1, data2));
                break;
            case "/":
                System.out.println(MyCal.div(data1, data2));
                break;
        }

    }
}

class MyCal {
    static double add(double data1, double data2) {
        return data1 + data2;
    }

    static double sub(double data1, double data2) {
        return data1 - data2;
    }

    static double mul(double data1, double data2) {
        return data1 * data2;
    }

    static double div(double data1, double data2) {
        return data1 / data2;
    }
}
