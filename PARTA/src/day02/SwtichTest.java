package day02;

public class SwtichTest {
    public static void main(String[] args) {
        String op, tempintA, tempintB, confirm;
        int a, b, result;
        boolean status = true;
        System.out.println("'FINISH' 입력으로 종료\n");
        while (status) {
            tempintA = System.console().readLine("첫번째 수 입력 >>>>>>>>>>>>\n");
            op = System.console().readLine("연산자 입력 >>>>>>>>>>>>\n");
            tempintB = System.console().readLine("두번째 수 입력 >>>>>>>>>>>>\n");
            a = Integer.valueOf(tempintA);
            b = Integer.valueOf(tempintB);
            switch (op) {
                case "+":
                    result = a + b;
                    System.out.println(a + "+" + b + "=" + result);
                    break;
                case "-":
                    result = a - b;
                    System.out.println(a + "-" + b + "=" + result);
                    break;
                case "*":
                    result = a * b;
                    System.out.println(a + "*" + b + "=" + result);
                    break;
                case "/":
                    result = a / b;
                    System.out.println(a + "/" + b + "=" + result);
                    break;
                default:
                    System.out.println("Wrong Input Mathmathic Logics.");
                    break;
            }
            confirm = System.console().readLine("Continue? (y/n)");
            switch (confirm) {
                case "y", "Y":
                    break;
                case "n", "N":
                    System.out.println("종료합니다.");
                    status = false;
                    break;
            }
        }
    }
}