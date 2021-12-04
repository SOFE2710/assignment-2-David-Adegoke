public class Person {
   private String   name;


   // constructors

   public Person(String initialName)
   {
      this.name = initialName;
   }
   
   public Person()
   {

   }

   //setter for name
   public void setName( String fullName)
   {
      this.name = fullName;
    }

   //returns name
   public String getName()
   {
      return this.getName();
   }

   //prints name
   public String toString()
   {
      return "Person Class; Full Name:" + this.name;
   }
}
