package day02;

public class ConsoleInput {
    public static void main(String[] args) {
        int age;
        String name;
        double weight;
        name = System.console().readLine("이름 >>>");
        String tempint = System.console().readLine("나이 >>>");
        String tempdou = System.console().readLine("몸무게 >>>");
        age = Integer.valueOf(tempint);
        weight = Double.valueOf(tempdou);

        System.out.println("입력된 이름 - " + name + "\n나이는 " + age + "세\n" + "몸무게는.." + weight + "kg");
        // valueOf <- 어떤 형식의 값이든 앞에 선언한 형태로 변환함.
    }
}