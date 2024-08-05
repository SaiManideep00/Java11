
public record Employee(int id, String name) {
   public Employee(int id, String name)
   {
       this.id=id+10;
       this.name=name.toUpperCase();
   }
   public Employee()
   {
       this(-10,"Null");

   }
}
