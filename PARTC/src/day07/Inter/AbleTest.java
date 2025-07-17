package day07.Inter;

public class AbleTest {
    public static void main(String[] args) {
        today(new Human());
        Cookable hu1 = new Human();
        hu1.cook("파스타");
        someday(new AI("GPT"));
        tomorrow(new Dog());
        Cookable robot = new Cookable() {
            @Override
            public void cook(String material) {
                System.out.println(material + "인스턴스 요리 가능!");
            }
        };
        today(robot);
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
