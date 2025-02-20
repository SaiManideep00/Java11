import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {
    private Count count;
    private Lock lock;

    public Subtractor(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++)
        {
            lock.lock();
            int value=count.getValue();
            value=value-i;
            count.setValue(value);
            lock.unlock();
        }

    }
}
