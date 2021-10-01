//To check if the lock would open from provided key or not(Method 2)
import java.util.Scanner;

public class Doorr {
    public static void m11(String key){
        class Lockk{
            public void m22(String tkey){
                if(tkey.equals("1234")){
                    System.out.println("Unlocked");
                }
                else{
                    System.out.println("Invalid Passcode");
                }
            }
        }
        new Lockk().m22(key);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Doorr.m11(s.next());
    }
}
