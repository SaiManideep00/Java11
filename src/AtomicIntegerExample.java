import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    public static void main(String[] args) {
        AtomicInteger ai=new AtomicInteger(0);
        System.out.println(ai.addAndGet(-3));
        System.out.println(ai);
    }
}
