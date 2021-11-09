import java.util.Scanner;

public class Testt {
    Integer a;
    Testt(int a){
        this.a = a;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Testt obj = new Testt(s.nextInt());
        System.out.println(Integer.toBinaryString(obj.a));
        System.out.println(Integer.toHexString(obj.a));
        System.out.println(Integer.toOctalString(obj.a));
    }

}
