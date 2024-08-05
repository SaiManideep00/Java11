import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RunTest {
    static class Runner implements Runnable {
        public void run() {
            System.out.println("In Run");
        }
    }
    public static void main(String[] args) {
//        Runner r = new Runner();
//        Thread1 t1 = new Thread1(r);
//        Thread1 t2 = new Thread1(r);
//        t1.start();
//        t2.start();
        char c;
        int i;
        c = 'a';//1
        i = c;  //2
        i++;    //3
        //c = i;  //4
        c++;
        System.out.println(i);
        var nums = IntStream.range(1, 5);
       // nums.forEach();
        double dxx=nums.average().getAsDouble();
        System.out.println(dxx);
        //double dxy= nums.().mapToDouble(j->j).average().getAsDouble();
        var b1 = false;
        var b2 = false;
        if (b2 = b1 == false) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
