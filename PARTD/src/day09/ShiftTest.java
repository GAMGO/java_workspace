package day09;

//1. 부호 고려 연산 => 부호 비트 변경안함
//2. 부호 미고려 연산
public class ShiftTest {
    public static void main(String[] args) {
        int a = 24;
        int r = a >> 1;
        System.out.println(r);
        System.out.println(to32BitBinary(r));
        r = a >> 2;
        System.out.println(r);
        System.out.println(to32BitBinary(r));
        r = a >> 3;
        System.out.println(r);
        System.out.println(to32BitBinary(r));
    }

    private static String to32BitBinary(int x) {
        return String.format("%32s", Integer.toBinaryString(x)).replace(" ", "0");
    }

    private static void toSeparate() {
        System.out.println("\n\n\n");
        System.out.println("\t------------------------------------");
    }
}
