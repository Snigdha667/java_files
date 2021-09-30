//Priority Of Nested Classes
public class Outer1 {
    int n2 = 20;
    Inner1 objj = new Inner1();
    class Inner1{
        int n2 = 30;
        public void display(){
            int n2 = 40;
            System.out.println(n2);
            System.out.println(this.n2);
            System.out.println(Outer1.this.n2);
        }
    }
}
class Execution{
    public static void main(String[] args) {
        Outer1 objjj = new Outer1();
        Execution o = new Execution();
        objjj.objj.display();

    }
}
