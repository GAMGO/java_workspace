package day07;

public class AbstractParent {
    public static void main(String[] args) {
        Animal c = new Cat(1, "Cat", "3dots");
        System.out.println(c);
        // 내부 익명 클래스 (일회용)
        Animal ani = new Animal(9, "Eagle", "Black") {

            @Override
            void sound() {
                System.out.println("Eagle is Biyak");
            }

            @Override
            boolean isFly() {
                return true;
            }

            @Override
            String toDo(String task) {
                return "Eagle's task is" + task;
            }

        };
        System.out.println(ani);

    }
}

// 부모클래스를 추상화
abstract class Animal {
    protected String name;
    protected String color;
    private int id;

    Animal(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("\tID NUM - [%d]\n\tName : %s\n\tColor : %s", id, name, color);
    }

    abstract void sound();

    abstract boolean isFly();

    abstract String toDo(String task);

}

class Cat extends Animal {

    Cat(int id, String name, String color) {
        super(id, name, color);
    }

    @Override
    void sound() {
        System.out.println("Cat is Meow");
    }

    @Override
    boolean isFly() {
        return false;
    }

    @Override
    String toDo(String task) {
        return "Cat's task is" + task;
    }

}
