import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

class MyCallable implements Callable<String>
{
    public String call() throws Exception
    {         //Thread.sleep(500);
        return "DONE";     } }
public class ThreadImpl
{
    public static void main(String[] args)
    {

            //throw new ArrayIndexOutOfBoundsException();
//            AtomicInteger ai = new AtomicInteger(0);
//            var x = ai.getAndAdd(1);
//            System.out.println(x);
//            System.out.println(ai);
//            System.out.println(x);
        RuntimeException re=null;
        throw re;

        } }