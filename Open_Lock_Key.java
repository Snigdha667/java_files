//To check if the lock would open from provided key or not(Method 1)
import java.util.Scanner;

public class Door {
    public void islocked(String key){
       class Lock{
           String keyval = "1234";
           public void display(String kkey){
               if(keyval.equals(kkey)){
                   System.out.println("Lock is Unlocked");
               }
               else{
                   System.out.println("Sorry Invalid Key");
               }
           }
       }
       Lock obj = new Lock();
       obj.display(key);
    }
}
class Testtt{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Door obj1 = new Door();
        obj1.islocked(s.next());
    }
}
