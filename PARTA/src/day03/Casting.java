package day03;

public class Casting {
    public static void main(String[] args) {
        double a = 23; // double변수 = int값;
        int a1 = (int) 2147483648L; // int 변수 = long 값은 잘림. 강제 변환 필요
        System.out.println(a);
        System.out.println(a1);
    }
}
