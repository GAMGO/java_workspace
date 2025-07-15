package day05;

public class ExceptionTest {
    public static void main(String[] args) {
        ExceptionTest test = new ExceptionTest();

        try {
            test.inputNum();
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage()); // TODO: handle exception
        } finally {
            System.out.println("종료, 자원해제");
        }
    }

    public void indexExcption() {
        int[] num = new int[5];
        num[5] = 55;
    }

    public void inputNum() {
        String temp = System.console().readLine("Integer \n >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        int n = Integer.parseInt(temp);
        System.out.println(++n);
    }

    public void nullPointer() {
        String msg = null;
        System.out.println(msg.toUpperCase());
    }

    public void NullPointerException() {

    }

}
