package day07;

public class MemberCompare {
    public static void main(String[] args) {
        Member m1 = new Member("sana", 29);
        try {
            Member m2 = m1.clone();
            m2.print();
        } catch (CloneNotSupportedException e) {
            System.out.println("Exception Inbound.");
        }
        Member m3 = new Member("momo", 33);
        int diff = m1.compareTo(m3);
        m3.print();
        System.out.println("m1과 m3 비교 결과 : " + diff); // -4
        diff = m3.compareTo(m1);
        System.out.println("m3과 m1 비교 결과 : " + diff);// 4
    }
}

class Member implements Cloneable, Comparable<Member> {
    private String name;
    private int age;

    Member(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    protected Member clone() throws CloneNotSupportedException {
        return (Member) super.clone();
    }

    @Override
    public int compareTo(Member o) {
        // return this.age - o.age;
        return this.name.compareTo(o.name);
    }

    void print() {
        System.out.println(String.format("Name is %s. is %d years old.", name, age));
    }
}
