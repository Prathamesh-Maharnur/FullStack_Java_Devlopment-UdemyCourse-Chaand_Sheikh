package S6_Object_oriented_programming.Polymorphism.polymorphism1and2;
import S6_Object_oriented_programming.Polymorphism.polymorphism1and2.phone.*;

class Main{
   public static void main(String[] args) {

      System.out.println("\nNormal object creation:\n");
      Phone ph = new Phone();
      ph.feature();

      Nokia3310 Nph = new Nokia3310();
      Nph.feature();

      Iphone Iph = new Iphone();
      Iph.feature();;

      // every nokia,IPhone IS-A Phone but vice versa is not possible
      // we can create a phone obj and initialize it with any subclass attributes

      System.out.println("\nPolymorphism: parent obj initialized with subclass Constructor:\n");

      Phone unknownPhone;
      unknownPhone = new Iphone();
      unknownPhone.feature();

      unknownPhone = new Nokia3310();
      unknownPhone.feature();

   }
}