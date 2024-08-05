import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
interface AI{
    int i=0;
}


public class Generic {
//    public static void main(String[] args) {
//        Map<Integer,String> hm=new HashMap<>();
//        hm.put(1,"Hello");
//        hm.put(2,"Welcome");
//        hm.put(3,"World");
//        hm.merge(1,"WOW",(a,b)->a+b);
//        hm.merge(1,"WOW",(a,b)->a+b);
//        hm.merge(3,"NEW",(a,b)->String.valueOf(a.length()+b.length()));
//        System.out.println(hm);
//        List<String> values = Arrays.asList("Alpha A", "Alpha B", "Alpha C");
//        System.out.println(values.stream().anyMatch(a->a.equalsIgnoreCase("alpha ")));
//        System.out.println(values.stream().findFirst().get());
//        BI bi=new BI();
//        System.out.println(((AI)bi).i);


    //}
}
class AN{
    AN() {  print();   }
    void print() { System.out.print("A "); }
}
class BN extends AN{
    final int i =   4;
    public static void main(String[] args){
        //AN a = new BN();
        //a.print();
        char a = 'a', b = 98; //1
        int a1 = a;
        //int x=98;
        char x=' ';
        int y=x;

    }
    void print() { System.out.print(i+" "); }
}
