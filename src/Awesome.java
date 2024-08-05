interface AmazingInterface
{
    String value = "amazing";
    void amazingMethod(String arg);
}
abstract class AmazingClass implements AmazingInterface
{
    static String value = "awesome";
    abstract void amazingMethod(String arg1, String arg2);
}

 public class Awesome extends AmazingClass implements AmazingInterface
 {
     static  String value="j";
     public void amazingMethod(String arg1){ }
     public void amazingMethod(String arg1, String arg2){ }
     public static void main(String[] args){
         AmazingInterface ai = new Awesome();
         ai.amazingMethod(value);
         }  }