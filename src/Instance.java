import org.w3c.dom.ls.LSOutput;

class One{
    int x=10;
    static int y=10;
    void print()
    {
        System.out.println("In One");
    }
    static void staticPrint()
    {
        System.out.println("In static One");
    }
}
class Two extends One
{
    int x=20;
    static int y=20;
    void print()
    {
        System.out.println("In Two");
    }
    static void staticPrint()
    {
        System.out.println("In static Two");
    }
}
class Three extends Two
{
    int x=30;
    static int y=30;
    void print()
    {
        System.out.println("In three");
    }
    static void staticPrint()
    {
        System.out.println("In static Three");
    }
}
public class Instance {
    public static void main(String[] args) {
        One one = new One();
        One two = new Two();
        Three three = new Three();
        System.out.println(one.x);
        System.out.println(two.x);
        System.out.println(three.x);
        one.print();
        two.print();
        three.print();
        System.out.println(one.y);
        System.out.println(two.y);
        System.out.println(three.y);
        one.staticPrint();
        two.staticPrint();
        three.staticPrint();
       if(false)
           System.out.println("Welcome");
    }
}
interface Example
{
   int gh=2;
    private static void methodA()
    {
        System.out.println(gh);

    }
  private void methodB(){
      System.out.println("Hello");
  }
}
