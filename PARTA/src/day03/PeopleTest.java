package day03;

public class PeopleTest {
    public static void main(String[] args) {
        People momo = new People();
        People sana = new People();
        momo.setAge(20);
        sana.setAge(18);
        momo.setName(System.console().readLine("회원1의 이름?"));
        sana.setName(System.console().readLine("회원2의 이름?"));
        momo.setVaild(false);
        sana.setVaild(false);
        System.out.println("회원 이름 - " + momo.getName() + "\n" + "회원 연령 - " + momo.getAge() + "세\n");
        System.out.println("회원 이름 - " + sana.getName() + "\n" + "회원 연령 - " + sana.getAge() + "세\n");
    }
}
