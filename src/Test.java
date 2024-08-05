public class Test extends Thread
{
private static final Object lock = new Object();

public void printNumbers() {
    synchronized (lock) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public void run() {
    printNumbers();
}

public static void main(String[] args) {
    Test t1 = new Test();
Test t2 = new Test();
    t1.start();
    t2.start();
}
}