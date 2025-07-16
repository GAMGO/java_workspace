package day06;

public class PolymorphismTest {
    public static void main(String[] args) {
        YourP ch1 = new YourC();
        YourP ch2 = new YourC2();
        YourP ch3 = new YourC2();
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        ch2.setMsg("Hi Java");
        ch2.setName("sana");
        test1(ch2);
        ch1 = makeCh(0, "김모모");
        ch1 = makeCh(0, "최사나");
        System.out.println(ch1);

    }

    private static void test1(YourP p1) {
        System.out.println(p1);
    }

    private static YourP makeCh(int type, String name) {
        YourP ch = null;
        if (type == 0) {
            ch = new YourC();
            ch.setMsg("ssss");
            // return new YourC();

        } else {
            ch = new YourC2();
            // return new YourC2();
        }
        ch.setName(name);

        return ch;
    }
}
