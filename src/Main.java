import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    static void out1()
    {
        System.out.println("welocme from out1");
    }
    static void out2()
    {
        System.out.println("welcome from out 2");
    }
    public static void main(String[] args) {

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17); //1
        Integer cv=primes.stream().collect(Collectors.summingInt(a->a));
        System.out.println(cv);
//        Stream<Integer> primeStream = primes.stream(); //2
//        Predicate<Integer> test1 = k->k<10; //3
//        Stream<Integer> primeStream1 = primes.stream();
//        long count1 = primeStream1.filter(test1).count();//4
//        Predicate<Integer> test2 = k->k>10; //5
//        long count2 = primeStream1.filter(test2).count(); //6
        primes.stream().collect(Collectors.partitioningBy(k->k<10,Collectors.counting())).values().forEach(System.out::println);
        //System.out.println(px);
        //System.out.println(count1+" "+count2); //7
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        var pair=new Pair<>("hello",1);
        var pair2=new Pair<>("world",2);
        var pair3=new Pair<>(2,3);
        var list= List.of(pair,pair2,pair3);
        for( var i:list)
        {
            System.out.println(i.getLeft()+" "+i.getRight());
        }
        var x=List.of(1,"hello",2);
        for (var y:x)
            System.out.println(y);
        var x11=10;
        //System.out.println(x11<20?out1():out2());
       // Pair<Integer,Integer> p11=new Pair<>(null,null);
        Instant start = Instant.parse("2022-06-25T16:13:30.00z");
        System.out.println(start);
        start.plus(10, ChronoUnit.HOURS); System.out.println(start);
        int a[]={1,2,0};
        int b[]={1,2,3,4,5};
        System.out.println(Arrays.compare(a,b));
        Integer l[]={1,2,3,4};
        List<Integer> l22=Arrays.asList(l);
        //l22.remove(2);
        l[0]=-1;
        System.out.println(l22);
        System.out.println("Array is"+ Arrays.toString(l));
        List<Integer> asd=new ArrayList<>();
        asd.add(1);
        asd.add(2);
        asd.add(3);
        asd.add(4);
        var asd2= Collections.unmodifiableList(asd);
        System.out.println(asd);
        System.out.println(asd2);
        asd.set(0,-1);
        System.out.println(asd);
        System.out.println(asd2);
        //asd2.set(2,-2);
        System.out.println(asd);
        System.out.println(asd2);
        int i=0;
        int j=1;
        System.out.println(i++==j);
        System.out.println(i+"  "+j);





    }
}