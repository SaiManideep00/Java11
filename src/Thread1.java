public class Thread1 implements Runnable
{
    int i;
    public Thread1(int i)
    {
        this.i=i;
    }
    public synchronized void run()
    {
        System.out.println(i);
    }
}