package day07;

public class CompareTest {
    public static void main(String[] args) {
        // compareTo 메소드가 있음. => implements Comparable
        // compareTo 메소드는 1,0,-1 리턴.
        Integer n1 = 23;
        Integer n2 = 34;
        int diff = n1 - n2;
        System.out.println(n1 < n2);
        System.out.println(diff);
        diff = n1.compareTo(n2);
        System.out.println(diff);
        diff = n2.compareTo(n1);
        System.out.println(diff);
        Integer a = 1;
        Integer b = 1;
        int com = a - b;
        System.out.println(com);
        String name1 = "momo";
        String name2 = "sana";
        diff = name1.compareTo(name2);
        System.out.println(diff);

    }

}