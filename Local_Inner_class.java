//For Local Inner Class
public class First {
    public void m1(){
        class Second{
            int a = 10;
            int b = 20;
        }
        Second obj = new Second();
        int c = obj.a + obj.b;
        System.out.println("Sum of "+obj.a+" "+obj.b+" equals to "+c);
    }
}
class Test {
    public static void main(String[] args) {
        First obj1 = new First();
        obj1.m1();
    }
}
