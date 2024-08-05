public class TopClass {
    void display(){}
}
class Inner extends TopClass {
    int value;

    void display(){
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        TopClass t=new Inner();
        t.display();
    }


}
