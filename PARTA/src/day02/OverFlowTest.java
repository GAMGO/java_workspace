package day02;

public class OverFlowTest {
    public static void main(String[] args) {
        System.out.println("**데이터 타입별 크기**");
        System.out.println("Integer \n " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println(Integer.SIZE + "Bits\n" + Integer.BYTES + "Bytes\n");

        System.out.println("Double \n " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);
        System.out.println(Double.SIZE + "Bits\n" + Double.BYTES + "Bytes\n");

        System.out.println("Long \n " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
        System.out.println(Long.SIZE + "Bits\n" + Long.BYTES + "Bytes\n");

        System.out.println("Float \n " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
        System.out.println(Float.SIZE + "Bits\n" + Float.BYTES + "Bytes\n");

        int a = 2147483647;
        int b = a + 1;
        int c = -2147483648;
        int d = c - 1;
        long e = a + 3L;
        System.out.println("A = " + a);
        System.out.println("B = " + b + " Overflowed!!!!!!!");
        System.out.println("C = " + c);
        System.out.println("D = " + d + " Underflowed!!!!!!!");
        System.out.println("E(long) = a(int) + 3L[ong] = " + e);
    }
}
