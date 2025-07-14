package day04;

public class People {
    private int age;
    private boolean isAdult;
    private String name;

    // 커스텀 생성자
    public People() {

    }

    public People(int age, boolean isAdult, String name) {
        this.name = name;
        this.age = age;
        this.isAdult = isAdult;
    }

    // 기본 생성자 사용시 setter 필수
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdult(boolean isAdult) {
        this.isAdult = isAdult;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public Boolean getAdult() {
        return this.isAdult;
    }

    public People(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s - %d - %s", this.name, this.age, this.isAdult);
    }

}
