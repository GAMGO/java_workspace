package day08;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class JavasfunctionInterf {
    public static void main(String[] args) {
        Consumer<String> f1 = new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println("Consumer accept :" + t);
            }
        };
        f1.accept("test");
        Supplier<Integer> f3 = new Supplier<Integer>() {

            @Override
            public Integer get() {
                return 100;
            }

        };
        System.out.println(f3.get());
        // function <T,R> -> T인자 1게, R은 리턴임.
        Function<String, Integer> f4 = new Function<String, Integer>() {
            @Override
            public Integer apply(String t) {
                return t.lastIndexOf("hello");
            }
        };
        int index = f4.apply("hello**worlds ~ java in hello world");
        System.out.println("last Index is ... " + index);
        // Consumer<Double> tc3 = (t) -> System.out.println("?????????" + t);

    }

}
