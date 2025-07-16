package day06;

public class ParentChildTest {
    public static void main(String[] args) {
        MyP p = new MyP();
        p.msg = "Hello";
        p.num = 22;
        System.out.println(p.msg + ", " + p.num);
        MyC c = new MyC();
        c.msg = "HI";
        c.num = 11;
        System.out.println(c.msg + ", " + c.num);
        // 메소드 상속
        String temp = p.myConcat();
        System.out.println("Method Succeed = " + temp);
        System.out.println("Method Succeed = " + c.myConcat());
        // 생성자 상속
        System.out.println("기본 생성자 초기값 = " + p.name);
        System.out.println("기본 생성자 초기값 = " + c.name);
    }
}

class MyP {
    String msg;
    int num;
    String name;

    String myConcat() {
        return msg + "*" + num;
    }

    MyP() {
        this.name = "unknown";
    }
}

class MyC extends MyP {

}