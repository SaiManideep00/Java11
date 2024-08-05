class Outer
{
    int i = 10;
    class Inner
    {
        int i=0;
        public void methodA()
        {
            System.out.println("Hello World");
        }
    }
    static class StaticInner
    {
        public void methodA()
        {
            System.out.println("Hello World from static");
        }
    }
    class Ex
    {
        Inner st=new Inner();
        
    }
}
public class InnerClassEX {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        System.out.println(s1==s2);
        Outer o1=new Outer();
        Outer.Inner o2=o1.new Inner();
    }
}
