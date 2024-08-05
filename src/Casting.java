import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class A1
{
    static  int j=100;
    int i = 10;

    void print()
    {
        System.out.println(i+" "+j);
    }
}
class B1 extends A1
{
    static  int j=200;
    int i = 20;
    void print()
    {
        System.out.println(i+" "+j);
    }
}
class C1 extends B1
{
    static  int j=300;
    int i = 30;
    void print()
    {
        System.out.println(i+" "+j);
    }
}
record Student(int id,String name)
{
   Student{
       id=11;
   }
}
class Super { static String ID = "QBANK"; }

class Sub extends Super{
    static { System.out.print("In Sub"); }
}
public class Casting {
    static int k = 5;
    static public boolean checkIt(int k){         return k-->0?true:false;     }
    static public void printThem(){         while(checkIt(k)){             System.out.print(k);         }     }
    public static void main(String[] args) {
        byte starting = 3; short firstValue = 5;
        List list = new ArrayList();         list.add("val1"); //1
        list.add(2, "val2"); //2
        var books=new ArrayList<Integer>(List.of(1,2,3));
        System.out.println(books);
        System.out.println(Sub.ID);
        int index = 1; String[] strArr = new String[5]; var myStr  = strArr[index]; System.out.println(myStr);
        var ia = new int[][]{ {1, 2}, null };
        //printThem();
        System.out.println(1 + 5 < 3 + 7);         System.out.println( (2 + 2) >= 2 + 3);

        Stream<String> words=Stream.of("a","b","c","a","a","b");
        //Map<String, Long> counts =words.collect(Collectors.groupingBy(Collectors.counting()));
        //System.out.println(counts);
        java.time.LocalDate dt =java.time.LocalDate.parse("2015-01-01")
                .minusMonths(1)
        .minusDays(1);
        // .plusYears(1);
        System.out.println(dt);
    }
}
