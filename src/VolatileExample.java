public class VolatileExample  extends Thread {
    private static int threadcounter = 0;
    public void run()
    {       threadcounter++;       System.out.println(threadcounter);
    }
    public static void main(String[] args) throws Exception
    {
        for(int i=0; i<100; i++)
        {
               new VolatileExample().start();
        }
    }
}
