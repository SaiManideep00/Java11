import org.w3c.dom.ls.LSException;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ground {
    static String str;
    public static void main(String[] args) {
        String[] sa = { "charlie", "bob", "andy", "dave" };
        var ls = (Arrays.asList(sa));
        ls.add("Hello");
        ls.sort((var a, var b) -> a.compareTo(b));
        System.out.println(Arrays.toString(sa));
         List<Integer> xxxx= List.of(1,2,3,4,5);
         int i=0;
         for(var x:xxxx)
         {
             if(i==1)
                 continue;
             i++;
             System.out.println(x);
         }


        List<Double> dList = Arrays.asList(10.0, 12.0);

        System.out.println(str);
        System.out.println("Args length is"+args.length);
        String str = """  
                0123\
                4567""";
        System.out.println(str+" "+str.substring(4,7));
        ArrayList<Data> al = new ArrayList<Data>();         al.add(new Data(1));al.add(new Data(2));al.add(new Data(3));
        printUsefulData(al,(Data p)->{return p.value>2;});
        Automobile  a1 = new Automobile();
        Truck t  = new Truck();
        a1.drive(); //1
        t.drive(); //2
        a1 = t;     //3
        a1.drive(); //4
        String[] sa11 = { "charlie", "bob", "andy", "dave" };
        var ls11 = new ArrayList<String>(Arrays.asList(sa11));
        ls.sort((var a, var b) -> a.compareTo(b));
        System.out.println(sa[0]+" "+ls.get(0));
        //List<Integer> ls11 = Arrays.asList(1, 2, 3); ls.stream().map(a->a*2)  .forEach(System.out::print)   .forEach(System.out::println);
    }
    public static void printUsefulData(ArrayList<Data> dataList, Predicate<Data> p){    for(Data d: dataList){         if(p.test(d)) System.out.println(d.value);    } }

}
class Data
{
    int value;
    Data(int value){         this.value = value;     }
}
class Automobile{
    public void drive() {  System.out.println("Automobile: drive");   }
}

class Truck extends Automobile{
    public void drive() {  System.out.println("Truck: drive");   }}