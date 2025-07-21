package day09;

public class BitOpsTest {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(24));
        toSeparate();
        for (int i = 0; i <= 24; i++) {
            System.out.println(
                    " 2진수 : " + Integer.toBinaryString(i) + "\t 10진수 : " + i + "\t 16진수 : " + Integer.toHexString(i));
        }
        toSeparate();
        System.out.println("32자리 문자열 - " + String.format("%32s", Integer.toBinaryString(24)).replace(" ", "0"));
        toSeparate();
        System.out.println("Bit and");
        int z = 24, y = 127, r = z & y;
        System.out.println(to32BitBinary(z));
        System.out.println(to32BitBinary(y));
        System.out.println(to32BitBinary(r));
        toSeparate();
        System.out.println("Bit Or");
        r = z | y;
        System.out.println(to32BitBinary(z));
        System.out.println(to32BitBinary(y));
        System.out.println(to32BitBinary(r));
        toSeparate();
        System.out.println("Bit Exclusive");
        z = 24;
        y = 136;
        r = z ^ y;
        System.out.println(to32BitBinary(z));
        System.out.println(to32BitBinary(y));
        System.out.println(to32BitBinary(r));
        toSeparate();
        System.out.println("Bit Not");
        r = ~24;
        System.out.println(r); // 2의 보수 방식.
        System.out.println(to32BitBinary(24));
        System.out.println(to32BitBinary(-24));
    }

    private static String to32BitBinary(int x) {
        return String.format("%32s", Integer.toBinaryString(x)).replace(" ", "0");
    }

    private static void toSeparate() {
        System.out.println("\n\n\n");
        System.out.println("\t------------------------------------");
    }
}
