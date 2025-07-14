package day04;

import java.util.Arrays;

public class PeopleArrayTest {
    public static void main(String[] args) {
        People[] members = new People[4];
        members[0] = new People(18, false, "모모");
        members[1] = new People(28, true, "나현");
        members[2] = new People(22, true, "나나");
        members[3] = new People(23, true, "지효");
        System.out.println("맴버 이름 출력 \n");
        int total = 0;
        members[2] = new People(19, false, "사나");
        for (People p : members) {
            if (!p.getAdult()) {
                System.out.println("청소년 맴버 = " + p.getName());
            }
        }
        System.out.println(Arrays.toString(members));

        for (People p : members) {
            System.out.println("\t" + p.getName());
            total = total + p.getAge();
        }
        System.out.println("평균나이 = " + total / members.length);

    }
}
