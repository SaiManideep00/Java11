import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

class ASuper
{
    void play()
    {
        System.out.println("In A");
    }
}
class BSub extends ASuper
{
    @Override
    void play() {
        //1super.play();
        System.out.println("In B");
    }
}
public class RecordImpl {
    Employee e1=new Employee(1,"Mukesh");
    Employee e2=new Employee(2,"Rishi");
    Employee e3=new Employee(3,"Anna");
    Employee e4=new Employee();

    public static void main(String[] args) {

//        RecordImpl ri=new RecordImpl();
//        System.out.println(ri.e1);
//        System.out.println(ri.e2);
//        System.out.println(ri.e3);
//        System.out.println(ri.e4);
//        System.out.println(ri.e1.id());
//        String phoneNumber="ddd-ddd-dddd";
//        String result=new StringBuilder(phoneNumber).substring(0, 8);//+"xxxx";
        ASuper a=new ASuper();
        BSub b=new BSub();
        LocalDate d=LocalDate.now();
        System.out.println(d);
        LocalDate d1=d.plusYears(1).plusDays(10).plusYears(1);
        System.out.println(d1);
        Period p=Period.ofDays(10);
        System.out.println(p);
        Duration dr=Duration.ofDays(2);
        System.out.println(dr);
        try
        {
            throw new RuntimeException();
        }
        catch (RuntimeException r)
        {
            System.out.println("runtime");
        }

        List<String> ls = Arrays.asList("Tom Cruise", "Tom Hart","Tom Hanks", "Mukesh Rishi","Tom Brady");
        Predicate<String> p1 = str->{             System.out.println("Looking...");             return str.indexOf("Tom") > -1;         };
        boolean flag = ls.stream().allMatch(p1);
    }
}
