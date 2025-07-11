package day03;
//자바에서 데이터를 저장하는 VO(Value Object) 클래스의 기본 형식

public class People {
    private String name;
    private int age;
    private boolean isAdult;

    // 값 접근 - 메소드 구현
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getVaild() {
        return this.isAdult;
    }

    public void setVaild(boolean isAdult) {
        this.isAdult = isAdult;
    }
}
