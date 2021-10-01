//Local Inner Class Ex 2
public class Outer {
     public static void m1(){
          class Inner{
               public static void m2(){
                    System.out.println("Hello");
               }
          }
          Inner.m2();
     }
}
class Testt{
     public static void main(String[] args) {
          new Outer().m1();
     }
}
