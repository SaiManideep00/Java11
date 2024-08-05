import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MapImpl {


    public static void main(String[] args) {
        List<Integer> l=List.of(1,2,3,4,5,6,7,8,9);
        Function<Integer,Integer> f=a->a+2;
        Consumer<Integer> c=a-> System.out.println("Value is "+a);
        Supplier<Double> s=()->Math.random();
        System.out.println(f.apply(1));
        c.accept(1);
        System.out.println(s.get());
        var d=l.stream().parallel().toList();
        System.out.println(d);
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Sequential Stream
        System.out.println("Sequential Stream:");
        numbers.stream()
                .forEach(num -> System.out.println(Thread.currentThread().getName() + ": " + num));

        // Parallel Stream
        System.out.println("\nParallel Stream:");
        numbers.stream()
                .parallel()
                .forEach(num -> System.out.println(Thread.currentThread().getName() + ": " + num));

        String cvcv= """
                hello
                welocomr 
                to \
                the world \
                """;
        System.out.println(cvcv);
        System.out.println("There is new lne");
    }
}
