interface House
{
    int x=0;
    public default String getAddress()
    {      return "101 Main Str";   }
    void print();
}
interface Bungalow extends House
{
    int x=9;
    public default String getAddress()
    {      return "101 Smart Str";   }
}
class MyHouse implements  House,Bungalow{
    public void print(){

    }
}
public class TestClass {

    public static void main(String[] args)
    {     MyHouse ci = new MyHouse();  //1
         System.out.println(ci.getAddress()); //2
        char a = 'a', b = 98; //1
         int a1 = a; //2
         int b1 = (int) b; //3
        System.out.println('a'+'b'+'c'+' ');
         int i=9,j=9;
        Integer x=9;
       // Long ll=x;

    }
}
