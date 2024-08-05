import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EnumClass {
    static  int answer;
    public static void main(String[] args) {
        var x=10;
        var l=new ArrayList<Integer>();
        l.add(1);
        System.out.println(l);
        var var=9;
        Day d=Day.FRIDAY;
        System.out.println(d.getShortName());
        Day d2=Day.valueOf("TUESDAY");
        System.out.println(d2);
        System.out.println(d.ordinal());
        Day d1=Day.FRIDAY;
        System.out.println(d==d1);
        System.out.println(d.equals(d1));
        for(Day i:Day.values()){
            System.out.println(i.ordinal());
        }
        System.out.println(answer);

        //int x22=8,x33=10;
        Function<String,Integer> f=x1->x1.length();
        Predicate<String> p=x2->x2.length()%2==0;
        var stringList= List.of("A","aaa","aa","jj");
        stringList.stream().filter(p).forEach(System.out::print);
}}
