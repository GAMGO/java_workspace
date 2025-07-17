package day07.Inter;

public interface Beable {
    // 추상메소드 abstract 생략 가능.
    String beable();
}

interface Cookable {
    void cook(String material);
}

interface Runnable {
    String run(int speed);
}

interface Thinkable {
    void Thinks(String what);

    int calcable(int a, int b);
}