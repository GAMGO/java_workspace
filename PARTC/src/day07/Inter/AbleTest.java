package day07.Inter;

public class AbleTest {
    public static void main(String[] args) {
        today(new Human());
        someday(new AI("GPT"));
        tomorrow(new Dog());
    }

    private static void today(Cookable cookable) {
        cookable.cook("라면");
    }

    private static void tomorrow(Runnable runnable) {
       String temp = runnable.run(100);
    }

    private static void someday(Thinkable thinkable) {
        thinkable.think("JAVA");
    }
}
