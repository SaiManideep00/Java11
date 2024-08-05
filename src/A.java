import java.util.*;
import java.util.function.Consumer;

public class A {
    A()
    {
        System.out.println("constrcutor of A");
    }

}
class B extends A
{
    private int a;
    B(int a)
    {
        this.a=a;
        System.out.println("Constructr of B"+a);
    }
}
class C implements Consumer<Integer>
{
    public static void main(String[] args) {
        //B b=new B(1);
        String s=null;
        var ca = new char[] {'a','b','c','d'};
        var i = 0;
        for (var c: ca) {
            switch (c) {
                case 'a':i++;
                case 'b':++i;
                case 'c' |'d':
                {i++;
                    System.out.println("Hello");}
            }
        }
        C c=new C();
        System.out.println("i = " + i);
        System.out.println('c'|'d');
        List<Integer> vb=List.of(1,2,3,4,5);
        //vb.stream().forEach(c.accept;);

    }


    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}
