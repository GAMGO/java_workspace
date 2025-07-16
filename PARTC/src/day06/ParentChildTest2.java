package day06;

public class ParentChildTest2 {
    public static void main(String[] args) {
        YourC2 ch2 = new YourC2(true);
        System.out.println(ch2.isFail());
        ch2.setFail(false);
        System.out.println(ch2.isFail());
        System.out.println("msg = " + ch2.getMsg());
        YourC2 ch22 = new YourC2();
        System.out.println("msg = " + ch22.getMsg());
    }
}

class YourC2 extends YourP {
    private boolean isFail;

    YourC2() {
        super(); // 생략가능
    }

    YourC2(boolean isFail) {
        this.isFail = isFail;
    }

    public boolean isFail() {
        return isFail;
    }

    public void setFail(boolean isFail) {
        this.isFail = isFail;
    }
}
